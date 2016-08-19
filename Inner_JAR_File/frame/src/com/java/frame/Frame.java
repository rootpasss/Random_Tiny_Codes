package com.java.frame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 18/08/2016, Time: 23:14:56.
*
* Additional Info.
*
* Source Code Target Or Details:
*
*              [ Load and store a file within a jar application ] 
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Frame extends JFrame {
  JPanel contentPane;
  JTextArea text;
  JButton button;

  public static void main( String[] args ) {
    new Frame().setVisible( true );
  }

  public Frame() {
    setTitle( "Java 8 on VIM" );
    setSize( 350, 200 );
    setLocationRelativeTo( null );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

    contentPane = new JPanel();
    contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
    contentPane.setLayout( new BorderLayout( 0, 0 ) );
    contentPane.setBackground( new Color( 60, 63, 65 ) );
    setContentPane( contentPane );

    text = new JTextArea();
    getContentPane().add( text, BorderLayout.CENTER );

    button = new JButton( "Load" );
    button.addActionListener( event -> processTask() );
    getContentPane().add( button, BorderLayout.SOUTH );
  }

  public void processTask() {
    if( button.getText().equals( "Load" ) ) {
      loadResource();
      button.setText( "Store" );
    } else {
      storeResource();
    }
  }

  public void loadResource() {
    try {
      BufferedReader BR = new BufferedReader( new InputStreamReader( getClass().getResourceAsStream( "/resources/Sample.txt" ) ) );
      String line;

      while( ( line = BR.readLine() ) != null ) {
        text.append( line + "\n" );
      }
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }

  public void storeResource() {
    try {
      Runtime.getRuntime().exec( new String[] { "bash", "-c", "echo \"" + text.getText() + "\"> resources/Sample.txt" } );
      Runtime.getRuntime().exec( "jar uf Frame.jar resources/Sample.txt" );
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }
}
