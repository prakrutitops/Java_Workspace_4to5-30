package com.a104;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ListEx 
{
	static JFrame frame;
	
	public ListEx() 
	{
		frame = new JFrame();
		
		 DefaultListModel<String> l1 = new DefaultListModel<>();  
         l1.addElement("Item1");  
         l1.addElement("Item2");  
         l1.addElement("Item3");  
         l1.addElement("Item4");  
         
         JList<String> list = new JList<>(l1);  
         list.setBounds(100,100, 75,75);  
         frame.add(list);  
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
			//new ListEx();
		  String name=JOptionPane.showInputDialog(frame,"Enter Name"); 
	}
}
