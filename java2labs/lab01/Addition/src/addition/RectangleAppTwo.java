/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ali Torabi
 */

public class RectangleAppTwo extends JFrame{
    // instance variables
    private static final int FRAME_WIDTH = 700;
    private static final int FRAME_HEIGHT = 420;

    private static final int FRAME_X = 80;
    private static final int FRAME_Y = 80;

    private static final int BUTTON_WIDTH = 350;
    private static final int BUTTON_HEIGHT = 35;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    private JCheckBox checkbox1;
    private JCheckBox checkbox2;
    private JCheckBox checkbox3;
    private JCheckBox checkbox4;

    private JRadioButton buttonOne;
    private JRadioButton buttonTwo;
    private JRadioButton buttonThree;
    private JRadioButton buttonFour;

    private JTextArea textArea;
    
    private JButton open;
    private JButton close;
    private JButton save;
    private JButton print;

    private JPanel checkboxPanel;
    private JPanel radiobuttonPanel;
    private JPanel buttonPanel;
    private JPanel textAreaPanel;

    public RectangleAppTwo(){

        Container container;

        //Set the frame properties
        setSize         (FRAME_WIDTH, FRAME_HEIGHT);
//        setResizable    (false);
        setTitle        ("RectangleAppTwo Title");
        setLocation     (FRAME_X, FRAME_Y);

        container = getContentPane();
        container.setLayout(new GridLayout(4,2));
        container.setBackground( Color.LIGHT_GRAY );

        //Create the labels container
        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");
        label3 = new JLabel("Label 3");
        label4 = new JLabel("Label 4");
        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        
        //Create the checkboxes container
        checkbox1 = new JCheckBox("Checkbox 1");
        container.add(checkbox1);
        checkbox1.setSelected(true);
        checkbox2 = new JCheckBox("Checkbox 2");
        checkbox2.setSelected(false);
        checkbox3 = new JCheckBox("Checkbox 3");
        checkbox3.setSelected(true);
        checkbox4 = new JCheckBox("Checkbox 4");
        checkbox4.setSelected(false);
        checkboxPanel = new JPanel(new GridLayout(0,1));
        container.add(checkboxPanel);
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        checkboxPanel.add(checkbox3);
        checkboxPanel.add(checkbox4);

        //create the radio buttons
        buttonOne = new JRadioButton("Radiobutton 1");
        buttonOne.setSelected(true);
        buttonTwo = new JRadioButton("Radiobutton 2");
        buttonThree = new JRadioButton("Radiobutton 3");
        buttonFour = new JRadioButton("Radiobutton 4");
        ButtonGroup group = new ButtonGroup();
        group.add(buttonOne);
        group.add(buttonTwo);
        group.add(buttonThree);
        group.add(buttonFour);
        radiobuttonPanel = new JPanel(new GridLayout(2,4));
        radiobuttonPanel.setBackground(Color.blue);
        radiobuttonPanel.add(buttonOne);
        radiobuttonPanel.add(buttonTwo);
        radiobuttonPanel.add(buttonThree);
        radiobuttonPanel.add(buttonFour);
        container.add(radiobuttonPanel);

       //create the textbox
        textArea = new JTextArea("Text Area");
        textAreaPanel = new JPanel(new GridLayout(0,1));
        textAreaPanel.setBackground(Color.black);
        textAreaPanel.add(textArea);
        container.add(textAreaPanel);
         
         //Create the Buttons container
        open = new JButton("Open");
        open.setBounds(4, 285, BUTTON_WIDTH, BUTTON_HEIGHT);
        close = new JButton("Close");
        close.setBounds(100, 285, BUTTON_WIDTH, BUTTON_HEIGHT);
        save = new JButton("Save");
        save.setBounds(195, 285, BUTTON_WIDTH, BUTTON_HEIGHT);
        print = new JButton("Print");
        print.setBounds(290, 285, BUTTON_WIDTH, BUTTON_HEIGHT);
        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.orange);
        buttonPanel.add(open); 
        buttonPanel.add(close);
        buttonPanel.add(save);
        buttonPanel.add(print);
        container.add(buttonPanel);

       //close the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
//        RectangleAppTwo frame = new RectangleAppTwo();
//        frame.setVisible(true);
    }
}