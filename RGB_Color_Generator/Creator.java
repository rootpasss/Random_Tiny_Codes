import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.Random;

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
*               [MINIMALIST RGB COLOR GENERATOR]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Creator extends JFrame
{
    JPanel contentPane;
    JLabel lred, lgreen, lblue;
    JSlider sred, sgreen, sblue;  //Press Tab key to switch between Sliders
    JTextField R, G, B;
    JTextArea preview;

    public static void main( String[] args )
    {
        new Creator().setVisible( true );
    }

    public Creator()
    {
        setTitle( "Simple Color Generator" );
        setSize( 337, 120 );
        setResizable( false );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

        contentPane = new JPanel();
        contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2 ) );
        contentPane.setLayout( null );
        setContentPane( contentPane );

        lred = new JLabel( "Red" );
        lred.setBounds( 5, 5, 40, 26 );
        lred.setFocusable( false );
        getContentPane().add( lred );

        lgreen = new JLabel( "Green" );
        lgreen.setBounds( 5, 35, 40, 26 );
        lgreen.setFocusable( false );
        getContentPane().add( lgreen );

        lblue = new JLabel( "Blue" );
        lblue.setBounds( 5, 65, 40, 26 );
        lblue.setFocusable( false );
        getContentPane().add( lblue );

        sred = new JSlider();
        sred.setBounds( 40, 6, 130, 26 );
        sred.setMaximum( 255 );
        sred.setValue( new Random().nextInt( 255 ) );
        sred.addMouseMotionListener( new MouseMotionAdapter()
        {
            public void mouseDragged( MouseEvent evt )
            {
                R.setText( sred.getValue() + "" );
                updatePreview();
            }
        } );
        sred.addMouseListener( new MouseAdapter()
        {
            public void mouseClicked( MouseEvent evt )
            {
                R.setText( sred.getValue() + "" );
                updatePreview();
            }
        } );
        sred.addKeyListener( new KeyAdapter()
        {
            public void keyPressed( KeyEvent evt )
            {
                if( ( evt.getKeyCode() == KeyEvent.VK_LEFT ) || ( evt.getKeyCode() == KeyEvent.VK_RIGHT ) || ( evt.getKeyCode() == KeyEvent.VK_UP ) || ( evt.getKeyCode() == KeyEvent.VK_DOWN ) )
                {
                    R.setText( sred.getValue() + "" );
                    updatePreview();
                }
            }
        } );
        getContentPane().add( sred );

        sgreen = new JSlider();
        sgreen.setBounds( 40, 36, 130, 26 );
        sgreen.setMaximum( 255 );
        sgreen.setValue( new Random().nextInt( 255 ) );
        sgreen.addMouseMotionListener( new MouseMotionAdapter()
        {
            public void mouseDragged( MouseEvent evt )
            {
                G.setText( sgreen.getValue() + "" );
                updatePreview();
            }
        } );
        sgreen.addMouseListener( new MouseAdapter()
        {
            public void mouseClicked( MouseEvent evt )
            {
                G.setText( sgreen.getValue() + "" );
                updatePreview();
            }
        } );
        sgreen.addKeyListener( new KeyAdapter()
        {
            public void keyPressed( KeyEvent evt )
            {
                if( ( evt.getKeyCode() == KeyEvent.VK_LEFT ) || ( evt.getKeyCode() == KeyEvent.VK_RIGHT ) || ( evt.getKeyCode() == KeyEvent.VK_UP ) || ( evt.getKeyCode() == KeyEvent.VK_DOWN ) )
                {
                    G.setText( sgreen.getValue() + "" );
                    updatePreview();
                }
            }
        } );
        getContentPane().add( sgreen );

        sblue = new JSlider();
        sblue.setBounds( 40, 65, 130, 26 );
        sblue.setMaximum( 255 );
        sblue.setValue( new Random().nextInt( 255 ) );
        sblue.addMouseMotionListener( new MouseMotionAdapter()
        {
            public void mouseDragged( MouseEvent evt )
            {
                B.setText( sblue.getValue() + "" );
                updatePreview();
            }
        } );
        sblue.addMouseListener( new MouseAdapter()
        {
            public void mouseClicked( MouseEvent evt )
            {
                B.setText( sblue.getValue() + "" );
                updatePreview();
            }
        } );
        sblue.addKeyListener( new KeyAdapter()
        {
            public void keyPressed( KeyEvent evt )
            {
                if( ( evt.getKeyCode() == KeyEvent.VK_LEFT ) || ( evt.getKeyCode() == KeyEvent.VK_RIGHT ) || ( evt.getKeyCode() == KeyEvent.VK_UP ) || ( evt.getKeyCode() == KeyEvent.VK_DOWN ) )
                {
                    B.setText( sblue.getValue() + "" );
                    updatePreview();
                }
            }
        } );
        getContentPane().add( sblue );

        R = new JTextField( sred.getValue() + "" );
        R.setBounds( 165, 8, 40, 19 );
        R.setEditable( false );
        R.setFocusable( false );
        R.setHorizontalAlignment( JTextField.CENTER );
        getContentPane().add( R );

        G = new JTextField( sgreen.getValue() + "" );
        G.setBounds( 165, 38, 40, 19 );
        G.setEditable( false );
        G.setFocusable( false );
        G.setHorizontalAlignment( JTextField.CENTER );
        getContentPane().add( G );

        B = new JTextField( sblue.getValue() + "" );
        B.setBounds( 165, 68, 40, 19 );
        B.setEditable( false );
        B.setFocusable( false );
        B.setHorizontalAlignment( JTextField.CENTER );
        getContentPane().add( B );

        preview = new JTextArea();
        preview.setBounds( 210, 2, 120, 90 );
        preview.setEditable( false );
        preview.setFocusable( false );
        getContentPane().add( preview );

        updatePreview();
    }

    public void updatePreview()
    {
        preview.setBackground( new Color( sred.getValue(), sgreen.getValue(), sblue.getValue() ) );
    }





























}
