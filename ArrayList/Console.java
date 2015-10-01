import java.util.ArrayList;
import java.util.Random;
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
*        [REVERSE AN ARRAYLIST WITHOUT USE 'reverse()' METHOD]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --.
*/

public class Console
{
    public static void main( String[] args )
    {
        System.out.print( "List size: " );

        new Console().reverseList( new Scanner( System.in ).nextInt() );
    }

    public void reverseList( int size )
    {
        ArrayList < Integer > values = new ArrayList <>();

        System.out.println( "Created List:" );

        for( int i = 0; i < size; i++ )
        {
            values.add( 1 + new Random().nextInt( 60 ) );
            System.out.print( values.get( i ) + "\t" );
        }

        //REVERSING LIST
        for( int i = 0; i < values.size() / 2; i++ )
        {
            int temporal = values.get( i );
            values.set( i, values.get( values.size() - i - 1 ) );
            values.set( values.size() - i - 1, temporal );
        }

        System.out.println( "\nReversed List:" );

        for( int V : values )
        {
            System.out.print( V + "\t" );
        }
    }
}
