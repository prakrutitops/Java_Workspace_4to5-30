package com.a34;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class NotepadMenuEx implements ActionListener
{
	JFrame frame;
	JMenuBar menubar;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectall;
	JTextArea ta;
	
	public NotepadMenuEx() 
	{
		frame = new JFrame();
		
		menubar = new JMenuBar();
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectall = new JMenuItem("SelectAll");
		
		ta = new JTextArea();
		ta.setBounds(20,75,250,200);
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectall);
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		
		frame.add(ta);
		frame.setSize(500,500);
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new NotepadMenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
	}
	
}
