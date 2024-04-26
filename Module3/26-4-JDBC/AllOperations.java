import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btn1;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		btn1 = new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
				String host="jdbc:mysql://localhost:3306/";
				String db="acer";
				String url = host+db;
			
				String n = tf1.getText().toString();
				String s = tf2.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql ="insert into info(name,surname) values('"+n+"','"+s+"')";
					
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	public void viewdata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="acer";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql ="select * from info";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("\t ID  \t NAME \t  SURNAME");
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
			
				System.out.println("\t "+id+"  \t "+name+" \t  "+surname+"");

			}
			System.out.println();
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
