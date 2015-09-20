//-------------------------------------------------------------------------------------------------------------------------------------------------
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

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
 *			ONLY NUMBERS INSERTION.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Frame extends JFrame
{
	JPanel contentPane;
	JFormattedTextField numbers;
	MaskFormatter formatter;
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public static void main( String[] args )
	{
		new Frame().setVisible( true );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------

	public Frame()
	{
		setTitle( "JFormattedTextField Demo (only numbers)" );
		setSize( 350, 60 );
		setResizable( false );
		setLocationRelativeTo( null );
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
		//-----------------------------------------------------------------------------------------------------------------------------------------

		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
		contentPane.setLayout( new BorderLayout( 0, 0 ) );
		contentPane.setBackground( new Color( 60, 63, 65 ) );
		setContentPane( contentPane );
		//-----------------------------------------------------------------------------------------------------------------------------------------
		
		setUpFormatter();
		numbers = new JFormattedTextField( formatter );
		numbers.setBounds( 100, 100, 200, 30 );
		numbers.putClientProperty( "JComponent.sizeVariant", "small" );
		numbers.setFont( new Font( "Tahoma", Font.BOLD, 15 ) );
		numbers.setForeground( Color.RED );
		getContentPane().add( numbers, BorderLayout.CENTER );
		//-----------------------------------------------------------------------------------------------------------------------------------------
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void setUpFormatter()
	{
		try
		{
			formatter = new MaskFormatter( "##-##-####" );
			formatter.setPlaceholderCharacter( '_' );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
