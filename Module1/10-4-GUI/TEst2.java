package com.a104;

import javax.swing.JFrame;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class TEst2 
{
	JFrame frame;
	public TEst2() 
	{
		
		frame = new JFrame();
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		 
		frame.add(datePicker);
		frame.setSize(250,250);
		//frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new TEst2();
	}
}
