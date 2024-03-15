package com.a153;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class CheckboxExample extends WindowAdapter
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3; 
	JLabel l1;
	JButton b1;
	
	public CheckboxExample() 
	{
		frame = new JFrame();
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(170, 25, 146, 14);
		
		chk1 = new JCheckBox("\n Pizza @ Rs. 100");
		chk1.setBounds(93, 75, 197, 23);
		
		chk2 = new JCheckBox("\n Burger @ Rs. 70");
		chk2.setBounds(93, 125, 197, 23);
		
		chk3 = new JCheckBox("\n Coffee @ Rs. 120");
		chk3.setBounds(93, 175, 197, 23);
		
		b1 = new JButton("Order");
		b1.setBounds(93, 225, 197, 23);
		
		
		

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				int amount =0;
				String msg="";
				
				if(chk1.isSelected())
				{
					amount+=100;//
					msg+="\n Pizza @ Rs. 100";
				}
				if(chk2.isSelected())
				{
					amount+=70;
					msg+="\n Burger @ Rs. 70";
				}
				if(chk3.isSelected())
				{
					amount+=120;
					msg+="\n Coffee @ Rs. 120";
				}
				
				//System.out.println();
				JOptionPane.showMessageDialog(frame,"Bill: "+msg+"\n Total: "+amount);
				
				
			}
		});
		frame.addWindowListener(this);
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(b1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	@Override
	public void windowClosing(WindowEvent e) 
	{
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		int ans = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
		
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
		if(ans==JOptionPane.NO_OPTION)
		{
			
		}
		if(ans==JOptionPane.CANCEL_OPTION)
		{
			
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		new CheckboxExample();
	}
}
