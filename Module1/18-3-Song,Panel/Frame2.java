package com.a183;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame2 
{
	JFrame frame;
	JTextField tf;
	JButton btn,btn2;
	JPanel jp,jp2;
	
	
	public Frame2() 
	{
		frame = new JFrame();
		
		tf = new JTextField(10);
		
		
		btn = new JButton("OK");
		
		
		btn2 = new JButton("Submit");
		
		
		jp = new JPanel();
		
		
		
		jp2 = new JPanel();
		
		jp.add(tf);
		jp.add(btn);
		
		jp2.add(btn2);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jp2.setVisible(true);
				
				jp.setVisible(false);
				
				
			}
		});
		jp.setVisible(true);
		jp2.setVisible(false);
	
		frame.add(jp);
		frame.add(jp2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) 
	{
		new Frame2();
	}
}
