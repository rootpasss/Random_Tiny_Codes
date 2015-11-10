package com.java.console;

import java.util.ArrayList;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 09/11/2015, Time: 21:26:35.
* 
* Additional Info.
*
* Source Code Target Or Details:
*
*              [COUNT CHARACTERS OCCURRENCES INNER ANY STRING] 
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Console
{
    public static void main( String[] args )
    {
        new Console().process( "United States Of America".toUpperCase() );
    }

    public void process( String strings )
    {
        ArrayList < String > list = new ArrayList <>();
        String output = "";

        for( int i = 0; i < strings.length(); i++ )
        {
            list.add( strings.substring( i, i + 1 ) );
        }

        for( int i = 0; i < list.size(); i++ )
        {
            int charCounter = 1;

            for( int j = i + 1; j < list.size(); j++ )
            {
                if( list.get( i ).equals( list.get( j ) ) )
                {
                    charCounter ++;
                    list.remove( j );
                    j --;
                }
            }

            output += charCounter + " \"" + list.get( i ) + "\"\n";
        }

        System.out.println( "String " + strings + " has:\n" + output );
    }
}
