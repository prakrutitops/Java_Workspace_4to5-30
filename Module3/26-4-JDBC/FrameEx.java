import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameEx implements ActionListener
{
	JFrame frame;
	JButton insert,view,update,delete;
	
	public FrameEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		insert = new JButton("Insert");
		view= new JButton("View");
		update = new JButton("Update");
		delete = new JButton("Delete");
		
		insert.addActionListener(this);
		
		frame.add(insert);
		frame.add(view);
		frame.add(update);
		frame.add(delete);
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new FrameEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a = new AllOperations();
		// TODO Auto-generated method stub
		if(e.getSource()==insert)
		{
			a.insertdata();
		}
	
	}
}
