package com.a133;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Design3 
{
	//declaration
	JFrame frame;
	JLabel l1;
	
	public Design3() 
	{
		//initialization
		frame = new JFrame();
		
		l1 = new JLabel("Welcome to tops");
		l1.setBounds(100, 100, 100, 100);
		
		frame.add(l1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	
	
}
