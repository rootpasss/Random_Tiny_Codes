//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
 *			[CALCULATING PERIODS OF TIME, BASED ON SALESFORCE RECORD INFO EXAMPLE]
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Console
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		new Console().processDate();
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void processDate()
	{
		LocalDate currentDate = LocalDate.now();
		LocalDate startDate = LocalDate.of( 2014, 10, 4 );
		LocalDate endDate = LocalDate.of( 2014, 12, 4 );
		int expiredMonths = ( int ) ChronoUnit.MONTHS.between( endDate, currentDate );
		int expiredDays = ( int ) ChronoUnit.DAYS.between( endDate, currentDate );
		int expiredYears = ( int ) ChronoUnit.YEARS.between( endDate, currentDate );

		System.out.println( "Current date: " + currentDate );
		System.out.println( "\nStart date: " + startDate );
		System.out.println( "End date: " + endDate );
		System.out.println( "\nExpired from: " + expiredMonths + " months (" + expiredDays + " days, " + expiredYears + " years)" );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------
