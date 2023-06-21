package main;
import javax.swing.*;

//import Main.setGet;

import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{

	private JLabel labelQuestion;
    private JLabel labelWeight;
    private JTextField fieldWeight;
    private JButton buttonTellMe;
    static StringBuilder finalWords;
    
 
    
	public Gui () {
		super ("DisplayWindow");
		initComponents();
		 
	    setSize(300, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	static void SetString (StringBuilder words) {
		
		finalWords = words;
	}

	private void initComponents() {
        labelQuestion = new JLabel("What words are Poe's Favourites in \"The Raven\"?");
        
       
        buttonTellMe = new JButton("Tell Me");
 
        setLayout(new FlowLayout());
 
        add(labelQuestion);
        add(buttonTellMe);
 
        buttonTellMe.addActionListener(this);
    }
	

	
	 public void actionPerformed(ActionEvent event) {
		 
		
	       StringBuilder message = finalWords;
	 
	       // float weight = Float.parseFloat(fieldWeight.getText());
	        //float waterAmount = calculateWaterAmount(weight);
	 
	       //message = String.format(message, waterAmount);
	 
	        JOptionPane.showMessageDialog(this, message);
	    }


	
	
}
