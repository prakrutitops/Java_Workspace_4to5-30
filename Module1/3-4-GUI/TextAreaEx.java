package com.a34;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx implements ActionListener
{
	JFrame frame;
	JTextArea area;
	JButton btn;
	JLabel l1,l2;  
	
	public TextAreaEx() 
	{
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		
		area = new JTextArea();
		area.setBounds(20,75,250,200);
		
		btn = new JButton("Count");
		btn.setBounds(100,300,120,30);
		
		
		
		l1=new JLabel();  
		l1.setBounds(50,25,100,30);  
		 
		l2=new JLabel();  
		l2.setBounds(160,25,200,30);  
		 
		btn.addActionListener(this);
		
		
		
		frame.add(area);
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new TextAreaEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn)
		{
			String data = area.getText().toString();
			
			String words[]	= data.split("\\s");
			
			l1.setText("Words are :"+words.length);
			l2.setText("Characters are:"+data.length());
		}
		
		
	}

	
}
