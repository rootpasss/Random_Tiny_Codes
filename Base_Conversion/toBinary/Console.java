import java.util.ArrayList;
import java.util.Scanner;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* 
* Additional Info.
*
* Source Code Target:
*
*               [CONVERT DECIMAL TO BINARY]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Console
{
    public static void main( String[] args )
    {
        new Console().convert();
    }

    public void convert()
    {
        int[] bin = new int[ 4 ];
        int value;

        for( int k = 0; k <= 15; k++ ) //15 values for this example...
        {
            value = k;

            for( int i = 0; i < 4; i++ )
            {
                bin[ i ] = value % 2;
                value /= 2;
            }

            System.out.print( "Binary conversion for " + k + " = " );

            for( int i = bin.length - 1; i >= 0; i-- )
            {
                System.out.print( bin[ i ] );
            }

            System.out.println( "" );
        }
    }
}
