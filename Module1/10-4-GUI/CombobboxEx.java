package com.a104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class CombobboxEx 
{
	
	JFrame frame;
	JComboBox<String> cb;
	JButton btn;
	String city[]= {"Rajkot","Ahmedabad","Baroda","Surat"};
	
	public CombobboxEx() 
	{
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(100, 100, 150, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(300, 100, 80, 20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String ans = cb.getItemAt(cb.getSelectedIndex());
				
				System.out.println("Your Selected City is : "+ans);
				
			}
		});
		
		frame.add(cb);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CombobboxEx();
	}
}
