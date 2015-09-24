//-------------------------------------------------------------------------------------------------------------------------------------------------
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

//-------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Java.
 * Version: Java Development Kit 1.8.0_31, Standard Edition.
 * Development Environment: Sublime Text 3.
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * Additional Info.
 *
 * Source Code Target:
 *
 *			[ JFRAME WITH A BASIC JPROGRESSBAR AND JTEXTAREA TO SHOW THE PROGRESS OF A SUB-PROCESS ]
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Frame extends JFrame
{
	JPanel contentPane;
	JScrollPane scroll;
	public static JTextArea text;
	public static JProgressBar bar;
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public static void main( String[] args )
	{
		new Frame().setVisible( true );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public Frame()
	{
		setTheme();
		setTitle( "Progress" );
		setSize( 500, 350 );
		setLocationRelativeTo( null );
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
		//-----------------------------------------------------------------------------------------------------------------------------------------

		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
		contentPane.setLayout( new BorderLayout( 0, 0 ) );
		contentPane.setBackground( new Color( 60, 63, 65 ) );
		setContentPane( contentPane );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		text = new JTextArea();
		text.setBackground( new Color( 60, 63, 65 ) );
		text.setForeground( Color.LIGHT_GRAY );
		text.setFont( new Font( "Tahoma", Font.BOLD, 15 ) );
		text.setEditable( false );
		scroll = new JScrollPane( text );
		getContentPane().add( scroll, BorderLayout.CENTER );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		bar = new JProgressBar();
		bar.setStringPainted( true );
		getContentPane().add( bar, BorderLayout.SOUTH );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		new Timer().start();
		//-----------------------------------------------------------------------------------------------------------------------------------------
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void setTheme()
	{
	    try
	    {
	        UIManager.setLookAndFeel( "javax.swing.plaf.metal.MetalLookAndFeel" );  //    Java Default Theme
	        // UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" );  //   Java Swing Theme
	        // UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );  //    UNIX Systems Theme
	    }
	    catch( Exception e )
	    {
	        e.printStackTrace();
	    }
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------