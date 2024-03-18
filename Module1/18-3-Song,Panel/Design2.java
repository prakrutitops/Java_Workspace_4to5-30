package com.a183;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Design2 
{
	//declaration
	JFrame frame;
	JLabel l1,l2;
	JTextField tf1;
	JPasswordField tf2;
	JButton btn1;
	
	public Design2() 
	{
		//initialization
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(140, 37, 150, 20);
		
		tf2 = new JPasswordField();
		tf2.setBounds(140, 75, 150, 20);
		
		l1 = new JLabel("Enter Your Email");
		l1.setBounds(10, 40, 100, 14);
		
		l2 = new JLabel("Enter Your Password");
		l2.setBounds(10, 78, 120, 14);
		
		btn1 = new JButton("submit");
		btn1.setBounds(90, 130, 89, 23);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String email = tf1.getText().toString();
				String pass = tf2.getText().toString();
				
				if(email.equals("tops@gmail.com") && pass.equals("1234"))
				{
					//System.out.println("Logged in Succesfully");
					//new Design3();
					frame.setVisible(false);
				}
				else
				{
					//System.out.println("Invalid Credentials");
					JOptionPane.showMessageDialog(frame,"Invalid Credentials");
				}
				
				
			}
		});
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(btn1);
		frame.setSize(400,250);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		
		new Design2();
		
	}
	
}
