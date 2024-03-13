package com.a133;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Design1 
{
	//declaration
	JFrame frame;
	JButton btn1;
	
	public Design1() 
	{
		//initialization
		frame = new JFrame();
		
		btn1 = new JButton("submit");
		btn1.setBounds(100, 101, 89, 30);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("Welcome");
				
			}
		});
		
		
		
		frame.add(btn1);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		
		new Design1();
		
	}
	
}
