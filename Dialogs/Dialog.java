//-------------------------------------------------------------------------------------------------------------------------------------------------
import javax.swing.JDialog;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

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
 *			DIALOG, iOS LIKE BASED.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: (+57) 317 311 3223.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Dialog extends JDialog
{
    JPanel contentPane;
    JEditorPane messageTitle, messageBody;
    JLabel textButton1, textButton2;
    //---------------------------------------------------------------------------------------------------------------------------------------------

    public static void main( String[] args )
    {
        new Dialog( "Titulo Del Mensaje", "Aqui estará ubicado el mensaje con mas lineas para ser completamente leidas, Este es aun mas extensoooo." );
        // new Dialog( "Titulo Del Mensaje", "Aqui estará ubicado el mensaje con mas lineas para ser completamente leidas." );
        // new Dialog( "Titulo Del Mensaje", "Aqui estará ubicado el mensaje." );
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------

    public Dialog( String title, String message )
    {
        setSize( 360, 140 );
        setUndecorated( true );
        setOpacity( 0.9F );
        setShape( new RoundRectangle2D.Double( 1, 10, 350, 130, 30, 30 ) ); 
        setLocationRelativeTo( null );
        setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
        //-----------------------------------------------------------------------------------------------------------------------------------------

        contentPane = new JPanel();
        contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
        contentPane.setLayout( null );
        setContentPane( contentPane );
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        messageTitle = new JEditorPane(  );
        messageTitle.setContentType( "text/html" );
        messageTitle.setBounds( 12, 18, 328, 30 );
        messageTitle.setBackground( new Color( 238, 238, 238 ) );
        messageTitle.setEditable( false );
        getContentPane().add( messageTitle );
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        messageBody = new JEditorPane(  );
        messageBody.setContentType( "text/html" );
        messageBody.setBounds( 12, 50, 328, 30 );
        messageBody.setBackground( new Color( 238, 238, 238 ) );
        messageBody.setEditable( false );
        getContentPane().add( messageBody );
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        textButton1 = new JLabel( "Cancel" );
        textButton1.setBounds( 0, 100, 180, 42 );
        textButton1.setHorizontalAlignment( JLabel.CENTER );
        textButton1.setFont( new Font( "Helvetica Neue", Font.PLAIN, 18 ) );
        textButton1.setForeground( new Color( 4, 131, 242 ) );
        textButton1.setBorder( new MatteBorder( 1, 1, 0, 1, Color.LIGHT_GRAY ) );
        textButton1.setOpaque( true );
        textButton1.addMouseListener( new MouseAdapter()
        {

            public void mouseEntered( MouseEvent evt )
            {
                textButton1.setBackground( new Color( 224, 221, 221 ) );
            }

            public void mouseExited( MouseEvent evt )
            {
                textButton1.setBackground( textButton2.getBackground() );
            }
            
            public void mouseClicked( MouseEvent evt )
            {
                System.exit( 0 ); 
            }
        });
        getContentPane().add( textButton1 );
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        textButton2 = new JLabel( "OK" );
        textButton2.setBounds( 180, 100, 180, 42 );
        textButton2.setHorizontalAlignment( JLabel.CENTER );
        textButton2.setFont( new Font( "Helvetica Neue", Font.BOLD, 18 ) );
        textButton2.setForeground( new Color( 4, 131, 242 ) );
        textButton2.setBorder( new MatteBorder( 1, 0, 0, 1, Color.LIGHT_GRAY ) );
        textButton2.setOpaque( true );
        textButton2.addMouseListener( new MouseAdapter()
        {
            public void mouseEntered( MouseEvent evt )
            {
                textButton2.setBackground( new Color( 224, 221, 221 ) );
            }

            public void mouseExited( MouseEvent evt )
            {
                textButton2.setBackground( textButton1.getBackground() );
            }

            public void mouseClicked( MouseEvent evt )
            {
                System.exit( 0 );
            }
        } );
        getContentPane().add( textButton2 );

        /**  _________  SET DIALOG STRINGS  ___________________________________________________________________________________________________  */

        messageTitle.setText( "<html><body style=\"font-family:Helvetica Neue; font-size:14px\"><center><b>" + title+ "</b></center></body></html>" );
        messageBody.setText( "<html><body style=\"font-family:Helvetica Neue; font-size:13px\"><center>" + message + "</center></body></html>" );
        /**  __________________________________________________________________________________________________________________________________  */

        resizeIfNecessary();
        //-----------------------------------------------------------------------------------------------------------------------------------------
        
        setVisible( true );
        //-----------------------------------------------------------------------------------------------------------------------------------------
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------
    
    public void resizeIfNecessary()
    {
        int messageLength = messageBody.getText().length();

        System.out.println( "Text lenght \"messageBody\": " + messageLength );

        if( messageLength > 138 && messageLength < 200 )
        {
            setSize( 360, 163 );
            messageBody.setBounds( 12, 50, 328, 52 );
            setShape( new RoundRectangle2D.Double( 1, 10, 350, 153, 30, 30 ) );
            textButton1.setBounds( 0, 122, 180, 42 );
            textButton2.setBounds( 180, 122, 180, 42 );
        }
        else
        {
            if( messageLength > 200 )
            {
                setSize( 360, 187 );
                messageBody.setBounds( 12, 50, 328, 75 );
                setShape( new RoundRectangle2D.Double( 1, 10, 350, 176, 30, 30 ) ); 
                textButton1.setBounds( 0, 144, 180, 42 );
                textButton2.setBounds( 180, 144, 180, 42 );
            }
        }
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------