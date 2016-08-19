package com.java.console;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 18/08/2016, Time: 22:14:43.
* 
* Additional Info.
*
* Source Code Target Or Details:
*
*              [ Create a simple text file from exec command ] 
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Console {
  public static void main( String[] args ) {
    new Console().makeFile();
  }

  public void makeFile() {
    try {
      String sampleText = "This is a simple text file.\n\nWritten by Jhonny on VIM";
      Runtime.getRuntime().exec( new String[] { "bash", "-c", "echo \"" + sampleText + "\"> Test.txt" } );
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }
}
