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
*               [PRINT A PYRAMID (TRIANGLE); NORMAL AND 180º INVERTED - NO ARRAYS WERE USED]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Triangle
{
    public static void main( String[] args )
    {
        System.out.print( "Array size: " );

        new Triangle().printNormalTriangle( new Scanner( System.in ).nextInt() );
        //new Triangle().printInvertedTriangle( new Scanner( System.in ).nextInt() );
    }

    public void printNormalTriangle( int top )
    {
        int limit = top * 2;
        String tab = " ";

        for( int i = 0; i < top; i++ )
        {
            for( int x = 0; x < top - i; x++ )
            {
                System.out.print( tab );                                               }

            for( int j = ( top + top + 1 ) - limit; j > 0; j-- )
            {
                System.out.print( "*" );
            }

            System.out.println( "" );
            limit -= 2;
        }
    }

    public void printInvertedTriangle( int top )
    {
        String tab = " ";

        for( int i = 0; i < top; i++ )
        {
            for( int j = i + 1; j < ( top + top - i ); j++ )
            {
                System.out.print( "*" );
            }

            System.out.print( "\n" + tab );
            tab += " ";
        }
    }
}
