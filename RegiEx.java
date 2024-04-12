package work1;
import work1.LoginEx;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


//import com.toedter.calendar.JDateChooser;

public class RegiEx 
{
	JFrame jf;
	JPanel panel;
	JLabel l1;
	JTextField jt,jt1,jt2;
	
    JDateChooser dateChoose;
    JLabel l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,jl,jl2;
    JPasswordField pf1,pf2;
    JRadioButton r1,r2;
    JCheckBox ch1,ch2,ch3,ch4;
    JComboBox comboBox;
    JButton b1;
	RegiEx() 
	{
		jf = new JFrame();
		
		

		 l1 = new JLabel("Registration Form");
		 l1.setForeground(Color.WHITE);
		 l1.setFont(new Font("Verdana", Font.BOLD, 35));
		 
		 panel = new JPanel();
		 panel.setBackground(Color.black);
		 panel.setBounds(0, 11, 650, 50);
		 
		 	l2 = new JLabel("First Name :");
			l2.setBounds(37, 106, 81, 14);
			jf.add(l2);
			
			l3 = new JLabel("Last Name :");
			l3.setBounds(274, 106, 70, 14);
			jf.add(l3);
			
			l4 = new JLabel("UserName :");
			l4.setBounds(37, 148, 81, 14);
			jf.add(l4);
			
			l5 = new JLabel("Password :");
			l5.setBounds(37, 183, 81, 14);
			jf.add(l5);
			
			l6 = new JLabel("ReEnter Pass :");
			l6.setBounds(24, 219, 94, 14);
			jf.add(l6);
			
		    l7 = new JLabel("BirthDate :");
			l7.setBounds(37, 252, 81, 14);
			jf.add(l7);
			
			dateChoose = new JDateChooser();
			dateChoose.setBounds(115, 246, 137, 20);
			jf.add(dateChoose);
			
			l8 = new JLabel("Address :");
			l8.setBounds(47, 282, 70, 14);
			jf.add(l8);
			
			l9 = new JLabel("Gender :");
			l9.setBounds(65, 350, 62, 14);
			jf.add(l9);
			
			l10 = new JLabel("Course :");
			l10.setBounds(48, 379, 81, 14);
			jf.add(l10);
			
			jt = new JTextField();
			jt.setBounds(115, 103, 137, 20);
			jf.add(jt);
			jt.setColumns(10);
			
			jt1 = new JTextField();
			jt1.setBounds(354, 103, 134, 20);
			jf.add(jt1);
			jt1.setColumns(10);
			
			jt2 = new JTextField();
			jt2.setBounds(115, 145, 137, 20);
			jf.add(jt2);
			jt2.setColumns(10);
			
			pf1 = new JPasswordField();
			pf1.setBounds(115, 180, 137, 20);
			jf.add(pf1);
			
			pf2 = new JPasswordField();
			pf2.setBounds(115, 216, 137, 20);
			jf.add(pf2);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(115, 277, 137, 56);
			jf.add(textArea);
			
			r1 = new JRadioButton("Male");
			r1.setBounds(114, 346, 70, 23);
			r1.setBackground(Color.lightGray);
			jf.add(r1);
			
			r2 = new JRadioButton("Female");
			r2.setBounds(194, 346, 109, 23);
			r2.setBackground(Color.lightGray);
			jf.add(r2);
			

			ButtonGroup bg=new ButtonGroup();
			bg.add(r1);
			bg.add(r2);
			
			ch1 = new JCheckBox("JAVA");
			ch1.setBounds(114, 375, 62, 23);
			ch1.setBackground(Color.lightGray);
			jf.add(ch1);
			

			ch2 = new JCheckBox("PYTHON");
			ch2.setBounds(182, 375, 80, 23);
			ch2.setBackground(Color.lightGray);
			jf.add(ch2);
			
			ch3 = new JCheckBox("PHP");
			ch3.setBounds(274, 375, 51, 23);
			ch3.setBackground(Color.lightGray);
			jf.add(ch3);
			
			ch4 = new JCheckBox("DOTNET");
			ch4.setBounds(341, 375, 97, 23);
			ch4.setBackground(Color.lightGray);
			jf.add(ch4);
			
			
			String[] msg = {"Rajkot","Surat","Ahemdabad","Gandhinagar","Vadodara","Navsari","Bhavnagar","Mahesana"};
			comboBox = new JComboBox<>(msg);
			comboBox.setBounds(354, 284, 130, 20);
			comboBox.setSelectedIndex(2);
			jf.add(comboBox);
			
			l11 = new JLabel("City");
			l11.setBounds(293, 287, 46, 14);
			jf.add(l11);
			
			b1 = new JButton("Continue");
			b1.setBounds(115, 413, 137, 23);
			b1.setBackground(new Color(105,105,105));
			b1.setFont(new Font("Tahoma", Font.BOLD, 14));
			
			jf.add(b1);
			
			jl = new JLabel("Already have an account ?");
			jl.setBounds(78, 460, 150, 14);
			jf.add(jl);
			
			jl2 = new JLabel("LogIn");
			jl2.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					LoginEx le = new LoginEx();
		
					// TODO Auto-generated method stub
					
				}
			});
			jl2.setForeground(Color.BLUE);
			jl2.setBounds(235, 460, 46, 14);
			jf.add(jl2);
		
			
			
		 

			jf.getContentPane().setBackground(Color.lightGray);
		    jf.setLayout(null);
		    jf.setSize(650,650);
		    jf.setVisible(true);
		
		 jf.add(panel);
		 panel.add(l1);
		
	}
	public static void main(String[] args)
	{
		
		new RegiEx();
	}
	
		
	


}
