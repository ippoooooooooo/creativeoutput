package co;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
public class four implements ActionListener{
	
	{JFrame frame = new JFrame();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	
	frame.add(buttonA);
	frame.add(buttonB);
	frame.add(buttonC);
	frame.add(buttonD);
	
	buttonA.setBounds(10,100,100,100);
	buttonA.setFont(new Font(null,Font.BOLD,35));
	buttonA.setFocusable(false);
	buttonA.addActionListener((ActionListener) this);
	buttonA.setText("A");
	
	buttonB.setBounds(10,100,100,100);
	buttonB.setFont(new Font(null,Font.BOLD,35));
	buttonB.setFocusable(false);
	buttonB.addActionListener((ActionListener) this);
	buttonB.setText("B");
	
	buttonC.setBounds(10,100,100,100);
	buttonC.setFont(new Font(null,Font.BOLD,35));
	buttonC.setFocusable(false);
	buttonC.addActionListener((ActionListener) this);
	buttonC.setText("C");
	
	buttonD.setBounds(10,100,100,100);
	buttonD.setFont(new Font(null,Font.BOLD,35));
	buttonD.setFocusable(false);
	buttonD.addActionListener((ActionListener) this);
	buttonD.setText("D");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1920,1080);
	frame.setLayout(null);
	frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
		
}