import java.time.LocalTime;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 27/10/2015, Time: 22:14:23.
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

public class Timer extends Thread
{
    LocalTime time;

    public void run()
    {
        try
        {
            while( true )
            {
                //time = LocalTime.now();

                //Frame.front.setText( time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() );

                Frame.front.setText( LocalTime.now() + "" );
                Frame.rear.setText( Frame.front.getText() );
                sleep( 10 );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
