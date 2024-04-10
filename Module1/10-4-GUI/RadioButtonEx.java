package com.a104;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JPanel jp,jp2;
	
	JLabel l1;
	JLabel l2;
	
	public RadioButtonEx() 
	{
		rb1 = new JRadioButton("Admin");
		rb2 = new JRadioButton("User");
		
		l1 = new JLabel("Admin");
		l2 = new JLabel("User");
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		jp.add(l1);
		jp2.add(l2);
		jp2.setVisible(false);
		jp.setVisible(false);
		
		add(rb1);
		add(rb2);
		add(jp);
		add(jp2);
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new RadioButtonEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			jp.setVisible(true);
			jp2.setVisible(false);
		}
		if(e.getSource()==rb2)
		{
			jp2.setVisible(true);
			jp.setVisible(false);
		}
	}
}
