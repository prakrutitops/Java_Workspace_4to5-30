import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
class mainpage implements ActionListener
{
	JFrame fm;
	JButton Reg, Lin;
	JLabel wel;
	public mainpage()
	{
		fm = new JFrame("Welcome Page");
		fm.setSize(450, 300);
		
		Reg = new JButton("Sign Up");
		Reg.setBounds(144, 55, 101, 38);
		Reg.addActionListener(this);
		
		Lin = new JButton("Login");
		Lin.setBounds(144, 125, 101, 38);
		Lin.addActionListener(this);
		
		wel = new JLabel("WELCOME");
		wel.setBounds(166, 11, 61, 38);
		fm.add(Reg);
		fm.add(Lin);
		fm.add(wel);
		fm.setLayout(null);
		fm.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Operations a = new Operations();
		if(e.getSource() == Reg)
		{
			a.Register();
		}
		else if(e.getSource() == Lin)
		{
			a.Login();
		}
	}
	
}
class Operations
{
	
	String host="jdbc:mysql://localhost:3306/";
	String dbname="aayush";
	String url=host+dbname;
	JFrame Lgin, Sup;
	JTextField Uname, Fname, Email;
	JPasswordField Pass;
	JLabel Un, Fn, Em, Ps, Er;
	JButton Log, Sig;
	public void Register()
	{
		
		
		
		Sup = new JFrame("Sign up here!");
		Sup.setSize(450, 300);
		Sup.setLayout(null);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Fn = new JLabel("Full Name");
		Fn.setBounds(44, 107, 70, 17);
		
		Em = new JLabel("Email Id");
		Em.setBounds(44, 145, 70, 17);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Fname = new JTextField();
		Fname.setBounds(115, 104, 195, 20);
		
		Email = new JTextField();
		Email.setBounds(115, 142, 195, 20);
		
		Sig = new JButton("Sign Up");
		Sig.setBounds(115, 188, 89, 23);
		Sig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent f) 
			{
				String un,ps,fn,em;
				un = Uname.getText();
				ps = Pass.getText();
				fn = Fname.getText();
				em = Email.getText();
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=	(Connection)DriverManager.getConnection(url,"root","");
					String sql = "insert into login values(null,'"+un+"','"+fn+"','"+em+"','"+ps+"')";
					Statement stmt = (Statement) con.createStatement();
					int nins = stmt.executeUpdate(sql);
					if(nins>0)
					{
						System.out.println("Inserted");
						Sup.setVisible(false);
					}
					con.close();
				}
				catch(Exception e)
				{
					System.out.println("Username or Email Id already present. Please enter a new one");
				}
			}
		});
		Sup.add(Em);
		Sup.add(Email);
		Sup.add(Ps);
		Sup.add(Fn);
		Sup.add(Fname);
		Sup.add(Un);
		Sup.add(Uname);
		Sup.add(Pass);
		Sup.add(Sig);
		Sup.setVisible(true);
		
		
		
	}
	
	public void Login()
	{
		Lgin = new JFrame("Sign up here!");
		Lgin.setSize(450, 300);
		Lgin.setLayout(null);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Email = new JTextField();
		Email.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Log = new JButton("Log In");
		Log.setBounds(115, 188, 89, 23);
		Log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String iun, ips;
				String em = Email.getText();
				String ps = Pass.getText();
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=	(Connection)DriverManager.getConnection(url,"root","");
					String sql = "select email,password from login where email ='"+em+"'";
					Statement stmt = (Statement) con.createStatement();
					ResultSet rs = (ResultSet) stmt.executeQuery(sql);
					if(rs.next())
					{
					
						iun = rs.getString(1);
						ips = rs.getString(2);
						if(ips.equals(ps))
						{
							JOptionPane.showMessageDialog(Log, "Login Successfull");
							Lgin.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(Log, "Wrong Passowrd!!\nLogin unsuccessfull");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(Log,"No user found, username invalid");
					}
					
					}
					
				
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		Lgin.add(Un);
		Lgin.add(Email);
		Lgin.add(Ps);
		Lgin.add(Pass);
		Lgin.add(Log);
		Lgin.setVisible(true);
	}
	
	
}
public class Registration {
	
	public static void main(String[] args) 
	{
		new mainpage();
	}

}