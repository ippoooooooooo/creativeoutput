package co;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class three implements ActionListener{
	
	Scanner scanner = new Scanner(System.in);
	int questions;
	 JFrame frame = new JFrame();
	 JLabel label = new JLabel("Welcome to the Testify");
	 JTextField textfield = new JTextField("Enter the number of questions");
	 JButton button = new JButton("Enter");
	 three(){
	  
	  
	  button.setBounds(700,500,500,200);
	  button.setFont(new Font(null,Font.BOLD,50));
	  button.addActionListener((ActionListener) this);
	  
	  textfield = new JTextField(questions);
	  textfield.setBounds(700, 340, 500, 40);
	  label.setBounds(700,40,500,500);
	  label.setFont(new Font(null,Font.BOLD,25));
	  
	  frame.add(label);
	  frame.add(textfield);
	  frame.add(button);
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(1920,1080);
	  frame.setLayout(null);
	  frame.setVisible(true);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			
			   frame.dispose();
			   four Four = new four();
				button.setEnabled(false);
				textfield.setEditable(false);
			  }
		
	}
	}
