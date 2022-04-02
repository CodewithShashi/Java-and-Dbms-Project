import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.ActionEvent;


public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
public static void main(String[] args) {
	Register r = new Register();
	
	r.setVisible(true);
	
	
}
	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(390, 40, 159, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(223, 121, 102, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-Mail");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(223, 163, 102, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(223, 204, 102, 31);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Confirm Password");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(223, 245, 139, 31);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(408, 117, 208, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(408, 171, 208, 19);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(408, 212, 208, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(408, 253, 208, 19);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textField.getText();
				String email = textField_1.getText();
				String pwd = passwordField.getText();
				String pwd2 = passwordField_1.getText();
				 Random ran = new Random();
				int nxt = ran.nextInt(10000);
				
				
				if(name.isEmpty() || email.isEmpty() || pwd.isEmpty()  || pwd2.isEmpty()) {
					
					JOptionPane.showMessageDialog(btnNewButton,"Invalid Entery");
					
					
				}else {
					
					
				
				
			
				
				//connection
				 try {
	                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usercurd", "root", "9845");

	                    String query = "INSERT INTO user values('"+nxt+"','" + name + "',' " + email + "','" + pwd + "')";
	                    
                   java.sql.Statement st = conn.createStatement();
	                    
                    int rs = st.executeUpdate(query);

//	                    java.sql.Statement sta = conn.createStatement();
//                 int x = sta.executeUpdate(query);
	                    
	                    if (rs != 0) {
	                    	  JOptionPane.showMessageDialog(btnNewButton,
	  	                            "Welcome, "  + "Your account is sucessfully created");
	  	                       Login l = new Login();
	  	                       l.setVisible(true);
	  	                      
	  	                       dispose();
	                    } else {
	                    	 JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
	                      
	       				 
	                    }
	                    conn.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
				 
				}
								
				//connection end
				 
			
				 
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(358, 308, 147, 21);
		contentPane.add(btnNewButton);
	}
}
