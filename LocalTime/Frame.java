import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 27/10/2015, Time: 22:07:35.
*
* Additional Info.
*
* Source Code Target:
*
*               [LocalTime CLASS SIMPLE TEST]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Frame extends JFrame
{
    JPanel contentPane;
    public static JLabel front, rear;

    public static void main( String[] args )
    {
        new Frame().setVisible( true );
    }

    public Frame()
    {
        setTitle( "Java 8 LocalTime class" );
        setSize( 750, 200 );
        setResizable( false );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

        contentPane = new JPanel();
        contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
        contentPane.setLayout( null );
        setContentPane( contentPane );

        front = new JLabel();
        front.setBounds( 44, 40, 600, 90 );
        front.setForeground( Color.GRAY );
        front.setFont( new Font( "Segment7", Font.BOLD, 75 ) );
        getContentPane().add( front );

        rear = new JLabel();
        rear.setBounds( 50, 50, 600, 90 );
        rear.setForeground( new Color( 209, 209, 209 ) );
        rear.setFont( new Font( "Segment7", Font.BOLD, 75 ) );
        getContentPane().add( rear );

        new Timer().start();
    }
}
