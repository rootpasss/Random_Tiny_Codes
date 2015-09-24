//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.awt.Toolkit;

import java.util.Random;

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
 *			[ TIMER COUNTING FROM ZERO TO 100 ]
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Timer extends Thread
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void run()
	{
		try
		{
			for( int progress = 0; progress <= 100; progress++ )
			{
				Frame.text.append( "Process running...    progress: " + progress + "%\n" );
				Frame.bar.setString( "Loading... " + progress + "%" );
				Frame.bar.setValue( progress );
				scrolling();

				sleep( 90 + new Random().nextInt( 100 ) );
			}

			Frame.text.append( "\n\nFinished!" );
			scrolling();

			Frame.bar.setIndeterminate( true );
			Frame.bar.setString( "Waiting for your closing operation..." );
			Toolkit.getDefaultToolkit().beep();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void scrolling()
	{
		Frame.text.getCaret().setDot( Frame.text.getText().length() );
		Frame.text.scrollRectToVisible( Frame.text.getVisibleRect() );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------