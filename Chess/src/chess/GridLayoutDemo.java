package chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
 
public class GridLayoutDemo extends JFrame {
    JButton applyButton = new JButton("Apply gaps");
    GridLayout experimentLayout = new GridLayout(8,8);
    Color BROWN = new Color(150,72,35);
    Color WHITE = new Color(255,255,255);
     
    public GridLayoutDemo(String name) {
        super(name);
        setResizable(false);
    }
     
    
    
	
	
	
	
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(8,8));
         
        //Set up components preferred size
        compsToExperiment.setPreferredSize(new Dimension(700,700));
         
        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Rook.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Knight.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Bishop.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Queen.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_King.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Bishop.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Knight.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Rook.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:Black_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton("")).setBackground(BROWN);
        compsToExperiment.add(new JButton("")).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Pawn.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Rook.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Knight.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Bishop.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Queen.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_King.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Bishop.png"))).setBackground(WHITE);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Knight.png"))).setBackground(BROWN);
        compsToExperiment.add(new JButton(new ImageIcon("C:White_Rook.png"))).setBackground(WHITE);
         
        
        
        pane.add(compsToExperiment, BorderLayout.NORTH);
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
