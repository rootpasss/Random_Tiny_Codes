package com.java.frame;
    
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
    
import java.util.Random;

import com.java.timer.Timer;
    
/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* Date: 21/09/2016, Time: 18:55:16.
*
* Additional Info.
*
* Source Code Target Or Details:
*
*               [ Simple image scale  ]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/
    
public class Frame extends JFrame {
  JPanel contentPane;
  public static JSlider horizontal, vertical;
  JLabel box;
  public static JCheckBox option;
  Timer T = new Timer();

  public static void main( String[] args  ) {
    new Frame().setVisible( true  );
  }

  public Frame() {
    setMinimumSize( new Dimension( 310, 310  )  );
    setLocationRelativeTo( null  );
    addComponentListener( new ComponentAdapter() {
      public void componentResized( ComponentEvent evt  ) {
        updateBoxSize();
      }
    } );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE  );

    contentPane = new JPanel();
    contentPane.setBorder( new EmptyBorder( 2, 2, 2, 2  )  );
    contentPane.setLayout( null  );
    contentPane.setBackground( new Color( 18, 16, 24  )  );
    setContentPane( contentPane  );

    horizontal = new JSlider();
    horizontal.setBounds( 10, 10, 250, 25  );
    horizontal.addMouseMotionListener( new MouseAdapter() {
      public void mouseDragged( MouseEvent evt  ) {
        updateBoxSize();
      }
    } );
    getContentPane().add( horizontal  );

    option = new JCheckBox( "Automated Rescaling" );
    option.setBounds( 37, 265, 190, 25 );
    option.setForeground( new Color( 255, 245, 5 ) );
    option.addActionListener( event -> select() );
    getContentPane().add( option );

    vertical = new JSlider();
    vertical.setBounds( 10, 35, 25, 250  );
    vertical.addMouseMotionListener( new MouseAdapter() {
      public void mouseDragged( MouseEvent evt  ) {
        updateBoxSize();
      }
    } );
    getContentPane().add( vertical  );

    setSliders();

    box = new JLabel();
    box.setBorder( new LineBorder( new Color( 255, 255, 2 ), 1, false ) );
    getContentPane().add( box  );

    updateBoxSize();

    T.start();
  }

  public void setSliders() {
    int min = 1, max = 220;
    horizontal.setMinimum( min  );
    horizontal.setMaximum( max  );
    horizontal.setValue( new Random().nextInt( max  )  );
    //horizontal.setValue( max  );
    horizontal.addChangeListener( new ChangeListener() {
      public void stateChanged( ChangeEvent evt ) {
        updateBoxSize();
      }
    } );

    vertical.setMinimum( min  );
    vertical.setMaximum( max  );
    vertical.setValue( new Random().nextInt( max  )  );
    //vertical.setValue( max  );
    vertical.setOrientation( JSlider.VERTICAL  );
    vertical.setInverted( true  );
  }

  public void updateBoxSize() {
    box.setSize( horizontal.getValue(), vertical.getValue()  );
    box.setLocation( getWidth() / 2 - box.getWidth() / 2, getHeight() / 2 - box.getHeight() / 2  );
    Image image = new ImageIcon( getClass().getResource( "/images/minedroid.png"  )  ).getImage();
    image = image.getScaledInstance( box.getWidth(), box.getHeight(), Image.SCALE_SMOOTH  );
    box.setIcon( new ImageIcon( image  )  );
    setTitle( "Box Size: " + box.getWidth() + " * " + box.getHeight()  );
  }

  public void select() {
    if( option.isSelected() ) {
      T.autoScaling( true );
    } else {
      T.autoScaling( false );
    }
  }
}
