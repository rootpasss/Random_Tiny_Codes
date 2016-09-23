package com.java.timer;

import java.util.Random;

import com.java.frame.Frame;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 22/09/2016, Time: 21:33:59.
* 
* Additional Info.
*
* Source Code Target Or Details:
*
*               [ Auto-Resizer Timer ]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Timer extends Thread {
  boolean widthFlag = new Random().nextBoolean();
  boolean heightFlag = new Random().nextBoolean();
  boolean status = false;

  public void run() {
    try {
      while( true ) {
        if( status ) {
          // For image WIDTH auto-scaling...
          if( widthFlag ) {
            Frame.horizontal.setValue( Frame.horizontal.getValue() + 1 );
          } else {
            Frame.horizontal.setValue( Frame.horizontal.getValue() - 1 );
          }

          if( Frame.horizontal.getValue() == Frame.horizontal.getMaximum() ) {
            widthFlag = false;
          }

          if( Frame.horizontal.getValue() == Frame.horizontal.getMinimum() ) {
            widthFlag = true;
          }
          
          // For image HEIGHT auto-scaling...
          if( heightFlag ) {
            Frame.vertical.setValue( Frame.vertical.getValue() + 1 );
          } else {
            Frame.vertical.setValue( Frame.vertical.getValue() - 1 );
          }

          if( Frame.vertical.getValue() == Frame.vertical.getMaximum() ) {
            heightFlag = false;
          }

          if( Frame.vertical.getValue() == Frame.vertical.getMinimum() ) {
            heightFlag = true;
          }
        }
        
        sleep( 2 );
      }
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }

  public void autoScaling( boolean status ) {
    this.status = status;
  }
}
