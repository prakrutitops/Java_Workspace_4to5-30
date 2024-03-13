package com.a133;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Design4 
{
	//declaration
	JFrame frame;
	JLabel l1,l2;
	JTextField tf1,tf2,tf3;
	
	JButton btn1;
	
	public Design4() 
	{
		//initialization
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(140, 37, 150, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(140, 75, 150, 20);
		
		l1 = new JLabel("Enter Your 1st value");
		l1.setBounds(10, 40, 100, 14);
		
		l2 = new JLabel("Enter Your 2nd value");
		l2.setBounds(10, 78, 120, 14);
		
		btn1 = new JButton("submit");
		btn1.setBounds(90, 130, 89, 23);
		
		tf3 = new JTextField();
		tf3.setBounds(90, 160, 89, 23);
		tf3.setEditable(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String a = tf1.getText().toString();
				String b = tf2.getText().toString();
			
				int c = Integer.parseInt(a)+Integer.parseInt(b);
				//System.out.println(c);
				tf3.setText(String.valueOf(c));
			}
		});
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.setSize(400,250);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		
		new Design4();
		
	}
	
}
