import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegistrationForm implements ActionListener
{
	JFrame mainframe;
	JTextField jtid,jtname,jtadd, jtcont;
	JLabel jlid,jlname,jladd,jlcont,register,gender;
	JRadioButton jrmale, jrfemale;
	JButton jbexit, jbregister,jbdel,jbupdate,jbreset,jbrefresh;
	JTable jt;
	JScrollPane jscroll;
	
	DefaultTableModel model;
		
	Font font = new Font("Times new Roman", Font.BOLD, 60);
	
	public RegistrationForm() 
	{

		mainframe = new JFrame("Registration Form");
			
		// text field setting
		jtid = new JTextField(15);
		jtid.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jtid.setBounds(130, 49, 167, 34);
		jtname = new JTextField(15);
		jtname.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jtname.setBounds(130, 87, 167, 34);
		jtadd = new JTextField(15);
		jtadd.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jtadd.setBounds(130, 175, 167, 34);
		jtcont = new JTextField(15);
		jtcont.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT,15));
		jtcont.setBounds(130, 215, 167, 34);
		
		// label setting
		jlid = new JLabel("ID");
		jlid.setFont(new Font("Tahoma", Font.BOLD,15));
		jlid.setBounds(35, 58, 60, 16);
		jlname = new JLabel("Name");
		jlname.setFont(new Font("Tahoma", Font.BOLD,15));
		jlname.setBounds(35, 96, 60, 16);
		jladd = new JLabel("Address");
		jladd.setFont(new Font("Tahoma", Font.BOLD,15));
		jladd.setBounds(35, 184, 60, 16);
		jlcont = new JLabel("Contact");
		jlcont.setFont(new Font("Tahoma", Font.BOLD,15));
		jlcont.setBounds(35, 224, 60, 16);
		register = new JLabel("Registration Form");
		register.setFont(new Font("Tahoma", Font.BOLD,15));
		register.setBounds(61, 13, 157, 23);
		gender = new JLabel("Gender");
		gender.setFont(new Font("Tahoma", Font.BOLD,15));
		gender.setBounds(35, 139, 64, 25);
		
		// radio button setting
		jrmale = new JRadioButton("Male");
		jrmale.setFont(new Font("Tahoma", Font.BOLD,15));
		jrmale.setBounds(125, 139, 70, 25);
		jrfemale = new JRadioButton("Female");
		jrfemale.setFont(new Font("Tahoma", Font.BOLD,15));
		jrfemale.setBounds(200, 139, 80, 25);
		
		// all button setting
		jbexit = new JButton("Exit");
		jbexit.setFont(new Font("Tahoma", Font.BOLD,15));
		jbexit.setBounds(35, 277, 107, 34);
		jbregister = new JButton("Register");
		jbregister.setFont(new Font("Tahoma", Font.BOLD,15));
		jbregister.setBounds(150, 277, 120, 34);
		jbdel = new JButton("Delete");
		jbdel.setFont(new Font("Tahoma", Font.BOLD,15));
		jbdel.setBounds(35, 317, 107, 34);
		jbupdate = new JButton("Update");
		jbupdate.setFont(new Font("Tahoma", Font.BOLD,15));
		jbupdate.setBounds(150, 317, 120, 34);
		
		jbreset = new JButton("Reset");
		jbreset.setFont(new Font("Tahoma", Font.BOLD,15));
		jbreset.setBounds(87, 356, 120, 34);
		
		jbrefresh = new JButton("Refresh Table");
		jbrefresh.setFont(new Font("Tahoma", Font.BOLD,15));
		jbrefresh.setBounds(550, 403, 300, 34);
		
		// jtable and scrollbar setting -- this method is created in viewDataTable 
		String column[] = {"S.No","ID","Name","Gender","Address","Contact"};
		
		model = new DefaultTableModel(column,0);
		jt = new JTable(model);
		jt.setBounds(350, 13, 650, 377);
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
		
		jt.repaint();
		jscroll = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscroll.setBounds(350, 13, 650, 377);
		
		// frame setting
		mainframe.setSize(1090, 600);
		mainframe.setLayout(null);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// radio button group
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrmale);
		bg.add(jrfemale);
		
		// adding detail in frame	
		mainframe.add(register);
		mainframe.add(jlid);
		mainframe.add(jtid);
		mainframe.add(jlname);
		mainframe.add(jtname);
		mainframe.add(gender);
		mainframe.add(jrmale);
		mainframe.add(jrfemale);
		mainframe.add(jladd);
		mainframe.add(jtadd);
		mainframe.add(jlcont);
		mainframe.add(jtcont);
		mainframe.add(jbexit);
		mainframe.add(jbupdate);
		mainframe.add(jbdel);
		mainframe.add(jbrefresh);
		mainframe.add(jbregister);
		mainframe.add(jbrefresh);
		mainframe.add(jscroll);
		mainframe.add(jbreset);
		
		
		jbregister.addActionListener(this);
		jbexit.addActionListener(this);
		jbdel.addActionListener(this);
		jbreset.addActionListener(this);
		jbupdate.addActionListener(this);
		jbrefresh.addActionListener(this);
		
	}

	// sql dabase declaration
			String host = "jdbc:mysql://localhost:3306/";
			String dbname = "registration_form";
			String url = host+dbname;


	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource() == jbregister)
		{
			inserData();
		}
		if(e.getSource() == jbexit)
		{
			 mainframe.dispose();
		}
		if(e.getSource() == jbdel)
		{
			 deleteData();
		}
		if(e.getSource() == jbreset)
		{
			 jtid.setText(null);
			 jtname.setText(null);
			 jrfemale.setSelected(false);
			 jrmale.setSelected(false);
			 jtadd.setText(null);
			 jtcont.setText(null);
		}
		if(e.getSource() == jbupdate)
		{
			 updateData();
		}
		if(e.getSource() == jbrefresh)
		{
			viewDataInTable();
		}
	}
	
	public void inserData()
	{
		
		try 
		{
			int noofinsert;
			int id = Integer.parseInt(jtid.getText());
			String nam = jtname.getText();
						
			String gend;
			if(jrmale.isSelected())
			{
				gend = jrmale.getText();
			}
			else
				gend = jrfemale.getText();
			
			String add = jtadd.getText();
			long cont = Long.parseLong(jtcont.getText());
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			Statement stmt = con.createStatement();
			String sqlinsert = "insert into registration value(null, '" + id + "','" + nam + "', '" + gend + "','" + add + "','" + cont +"')";
			noofinsert = stmt.executeUpdate(sqlinsert);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			JOptionPane.showMessageDialog(jbregister, "Registered Successfully");
		}
	}
	public void deleteData()
	{
		int noofdelete;
		int id = Integer.parseInt(jtid.getText());
		String sqldelete = "delete from registration where id='"+id+"'";
				
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofdelete = stmt.executeUpdate(sqldelete);
					
		}
		catch (Exception e) 
		{
			System.out.println();
		}
		finally
		{
			JOptionPane.showMessageDialog(jbdel, "Deleted Successfully");
		}
		
	}
	public void updateData()
	{
		int noofupdate;
		int id = Integer.parseInt(jtid.getText());
		String nam = jtname.getText();
					
		String gend;
		if(jrmale.isSelected())
		{
			gend = jrmale.getText();
		}
		else
			gend = jrfemale.getText();
		
		String add = jtadd.getText();
		long cont = Long.parseLong(jtcont.getText());
		String sqlupdate = "update registration set ID= "+id+",Name= '"+nam+"',Gender= '"+gend+"',Address='"+add+"',Contact= "+cont+" where ID='"+id+"'";
								
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofupdate = stmt.executeUpdate(sqlupdate);
			JOptionPane.showMessageDialog(jbupdate, "Updated Successfully");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
			
	}
	public void viewDataInTable()
	{
			
		String sqlviewdata = "select * from registration";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlviewdata);



			model.setRowCount(0);
						
			while(rs.next())
			{
				model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
							
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) 
	{
		new RegistrationForm();
	}

}

