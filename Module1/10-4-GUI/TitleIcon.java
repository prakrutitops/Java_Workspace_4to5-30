package com.a104;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class TitleIcon 
{
	public TitleIcon() 
	{
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\photos\\a.jpg");    
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
	}
	public static void main(String[] args) 
	{
		new TitleIcon();
	}
}
