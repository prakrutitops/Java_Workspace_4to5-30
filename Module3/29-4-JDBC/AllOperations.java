import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tfid;
	JButton btn1,btn2,btn3,btn4;
	JPanel jp,jp2;
	int did=0;
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
			
			System.out.println("ID  \t NAME \t  SURNAME");
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
			
				System.out.println(id+"  \t "+name+" \t  "+surname+"");

			}
			System.out.println();
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void updatedata()
	{
		updateframe = new JFrame();
		jp = new JPanel();
		jp2 = new JPanel();
		
	
		tfid = new JTextField(15);
		btn3 = new JButton("Edit");
		
		jp.add(tfid);
		jp.add(btn3);
		
		
		
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		btn4 = new JButton("Update");
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btn4);
		
		
		jp.setVisible(true);
		jp2.setVisible(false);
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				

				String host="jdbc:mysql://localhost:3306/";
				String db="acer";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					//
					String id = tfid.getText().toString();
					int id2 = Integer.parseInt(id);
					String sql ="select * from info where id ='"+id2+"'";
					Statement stmt = con.createStatement();
					
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						did = set.getInt(1);
						String name = set.getString(2);
						String surname = set.getString(3);
						
						tf1.setText(name);
						tf2.setText(surname);
						
						btn4.addActionListener(new ActionListener() {
							
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
									
									String sql ="update info set name='"+n+"',surname='"+s+"' where id='"+did+"'";
									
									Statement stmt = con.createStatement();
									int data = stmt.executeUpdate(sql);
									
									if(data>0)
									{
										updateframe.setVisible(false);
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
						
					}
					
					
				
				} 
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			
				
				
				jp2.setVisible(true);
				jp.setVisible(false);
				
				
			}
		});
		
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
		
		
		

		
		
		
	}
	
	public void deletedata()
	{
		deleteframe = new JFrame();
		
		tfid = new JTextField(15);
		btn2 = new JButton("Delete");
	
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
			
				String id = tfid.getText().toString();
				int id2 = Integer.parseInt(id);
				String sql ="delete from info where id='"+id2+"'";
				
				String host="jdbc:mysql://localhost:3306/";
				String db="acer";
				String url = host+db;
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(sql);	
					
					if(data>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
					
				
			}
		});
		
		deleteframe.add(tfid);
		deleteframe.add(btn2);
		deleteframe.setSize(300,300);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
	}
}
