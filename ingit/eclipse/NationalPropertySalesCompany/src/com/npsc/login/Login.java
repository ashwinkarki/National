package com.npsc.login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.npsc.dao.AdminDao;
import com.npsc.dao.SecretaryDAO;
import com.npsc.dao.impl.AdminDaoImpl;
import com.npsc.dao.impl.SecretaryDaoImpl;

public class Login extends JFrame {
	private AdminDao adminDAO;
	 private SecretaryDAO secDao;
	
	private JButton loginassecretary;
	private JPanel panel;
	private JFrame jFrame;
	private JTextField username;
	private JTextField passwordField;
	private JLabel login;
	private JLabel userLabel;
	private JTextField userText;
	private JLabel passwordLabel;
	private JPasswordField passwordText;
	private JButton loginasadmin;
	
	public Login() {
		setTitle("Login");
	  setSize(500, 350);
      
       
       panel = new JPanel();
		add(panel);
		placeComponents(panel);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	
	}
	

	private  void placeComponents(JPanel panel) {
		
	panel.setLayout(null);
	    login = new JLabel("Login:");
		login.setBounds(5, 10, 80, 25);
		panel.add(login);
		
		userLabel = new JLabel("UserName:");
		userLabel.setBounds(10, 40, 80, 25);
		panel.add(userLabel);

		username = new JTextField(20);
		username.setBounds(200, 40, 160, 25);
		panel.add(username);

		 passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 70, 80, 25);
		panel.add(passwordLabel);

		passwordField = new JPasswordField(20);
		passwordField.setBounds(200, 70, 160, 25);
		panel.add(passwordField);

		loginasadmin = new JButton("Login as Admin");
		//loginasadmin.setPreferredSize(new Dimension(400, 400));
		loginasadmin.setBounds(10, 150, 150,40);
		//150=LENGHT
		panel.add(loginasadmin);
		
		loginassecretary = new JButton("Login as Secretary");
		loginassecretary.setBounds(250, 150, 150,40);
	    panel.add(loginassecretary);
	    
	    loginasadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginasadminActionPerformed(evt);
            }
        });
	    
	    loginassecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginassecretaryActionPerformed(evt);
            }
        });

	    

	    
	}
	
	
	
	private void loginasadminActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String userName=username.getText();
        String password=passwordField.getText();

     
        adminDAO=new AdminDaoImpl();
        boolean a= adminDAO.getAdmin(userName,password);

        if(a==true){
            JOptionPane.showMessageDialog(null,"Sign In succeessful");
            setVisible(false);
            AdminDashboard ad=new AdminDashboard();
            ad.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Sign In Unsucceessful");
        }
    }  
    
    private void loginassecretaryActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        String userName=username.getText();
        String password=passwordField.getText();

       
        secDao=new SecretaryDaoImpl();
        boolean a= secDao.getSec(userName,password);

        if(a==true){
            JOptionPane.showMessageDialog(null,"Sign In succeessful");
            setVisible(false);
            SecDashboard sc=new SecDashboard();
            sc.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Sign In Unsucceessful");
        }

    } 
    
}
