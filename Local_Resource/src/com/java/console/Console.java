package com.java.console;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 16/08/2016, Time: 00:18:16.
* 
* Additional Info.
*
* Source Code Target Or Details:
*
*              [ Get file as local application resource ] 
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Console {
  public static void main( String[] args ) {
    new Console().process();
  }

  public void process() {
    try {
      /*InputStream IS = getClass().getResourceAsStream( "/files/file.txt" );
      InputStreamReader ISR = new InputStreamReader( IS );
      BufferedReader BR = new BufferedReader( ISR );*/

      BufferedReader BR = new BufferedReader( new InputStreamReader( getClass().getResourceAsStream( "/files/file.txt" ) ) );
      String line;

      while( ( line = BR.readLine() ) != null ) {
        System.out.println( line );
      }
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }
}
