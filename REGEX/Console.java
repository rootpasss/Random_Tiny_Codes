import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 08/11/2015, Time: 23:16:20.
* 
* Additional Info.
*
* Source Code Target:
*
*               
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Console
{
    ArrayList < String > vowels = new ArrayList <>();
    ArrayList < String > noVowels = new ArrayList <>();
    String[] strings = new String[] {
        "Murcielago", "Arquitecto", "Autentico", "Aurelio",
        "Carro", "Uvas", "Lenguaje", "Laptop", "Java",
        "MacBook", "Caballo", "Perico", "Bota", "Hipotenusa"
    };

    public static void main( String[] args )
    {
        //new Console().modeA();
        new Console().modeB();
    }

    public void modeB()
    {
        Pattern pattern = Pattern.compile( "(?i)(?:[a-z]*[aeiou]){5}[a-z]*" );
        Matcher match;

        for( String S : strings )
        {
            match = pattern.matcher( S );

            if( match.find() )
            {
                System.out.println( S + " Contains all vowels!!" );
                vowels.add( S );
            }
            else
            {
                System.out.println( S + " NOT contains all vowels ;(" );
                noVowels.add( S );
            }
        }

        System.out.println( "\nWith all vowels: " + vowels + " (" + vowels.size() + ")" );
        System.out.println( "Without all vowels: " + noVowels + " (" + noVowels.size() + ")" );
    }

    public void modeA()
    {
        for( String S : strings )
        {
            S = S.toLowerCase();

            if( S.contains( "a" ) && S.contains( "e" ) && S.contains( "i" ) && S.contains( "o" ) && S.contains( "u" ) )
            {
                System.out.println( S + " contains all vowels!" );
                vowels.add( S );
            }
            else
            {
                System.out.println( S + " NOT contains all vowels :(" );
                noVowels.add( S );
            }
        }

        System.out.println( "\n\nWith all vowels: " + vowels );
        System.out.println( "Without all vowels: " + noVowels );
    }
}
