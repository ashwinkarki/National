package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.npsc.dao.SecretaryDAO;
import com.npsc.dao.impl.SecretaryDaoImpl;
import com.npsc.entity.Branch;
import com.npsc.entity.Secretary;

public class Addbranch extends JFrame{

	private JTextField address;
    private JTextField email;
    private JButton saveBtn;
    private JTextField name;
    private JTextField password;
    private JTextField phonenum;
    private JTextField username;
    private JTextField webadd;
	private JButton jButton2;
	
	public Addbranch() {
		setPreferredSize(new Dimension(400, 300));
		  phonenum = new JTextField(10);
		  saveBtn=new JButton("Save");
		  jButton2=new JButton("Exit");
	         username = new JTextField(10);
	         address = new JTextField(10);
	         password = new JTextField(10);
	         name =new  JTextField(10);
	         webadd = new JTextField(10);
	         email =new JTextField(10);
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        add(createTopPanel(), BorderLayout.PAGE_START);
	        add(createMainPanel(), BorderLayout.CENTER);
	        add(createBottomPanel(), BorderLayout.PAGE_END);
	        pack();
	        setLocationByPlatform(true);
	        setVisible(true);
	}
	
		  private JPanel createBottomPanel() {
		  JPanel bottomPanel = new JPanel(new GridBagLayout());
	        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	   	 GridBagConstraints gbc = new GridBagConstraints();
	        gbc.anchor = GridBagConstraints.LINE_START;
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.insets.bottom = 5;
	        gbc.insets.left = 5;
	        gbc.insets.right = 5;
	        gbc.insets.top = 5;
	        
	        
	        bottomPanel.add(saveBtn,gbc);
	        
	        saveBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	saveBtnActionPerformed(evt);
	            }
	        });
	      
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        bottomPanel.add(jButton2,gbc);
	        
	        jButton2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });
	         
	        return bottomPanel;
	    }

	    private JPanel createFormPanel() {
	    	 JPanel formPanel = new JPanel(new GridBagLayout());
	         GridBagConstraints gbc = new GridBagConstraints();
	         gbc.anchor = GridBagConstraints.LINE_START;
	         gbc.gridx = 0;
	         gbc.gridy = 0;
	         gbc.insets.bottom = 5;
	         gbc.insets.left = 5;
	         gbc.insets.right = 5;
	         gbc.insets.top = 5;
	         JLabel n = new JLabel("Name");
	         formPanel.add(n, gbc);

	         gbc.gridx = 1;
	         formPanel.add(name, gbc);

	         gbc.gridx = 0;
	         gbc.gridy = 1;
	         JLabel addresss = new JLabel("Address");
	         formPanel.add(addresss, gbc);

	         gbc.gridx = 1;
	         formPanel.add(address, gbc);
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 2;
	         JLabel phoneni = new JLabel("Phone no");
	         formPanel.add(phoneni, gbc);
	         
	       

	         gbc.gridx = 1;
	         formPanel.add(phonenum, gbc);
	         
	         phonenum.addKeyListener(new KeyAdapter() {
	            @Override
	             public void keyReleased(KeyEvent e) {
	            	 phonenumActionPerformed(e);
	                                
	             }
	         });

	         
	         //package ends
	         
	       //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 3;
	         JLabel ema = new JLabel("Email");
	         formPanel.add(ema, gbc);

	         gbc.gridx = 1;
	         formPanel.add(email, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 4;
	         JLabel web = new JLabel("Web Address");
	         formPanel.add(web, gbc);

	         gbc.gridx = 1;
	         formPanel.add(webadd, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 5;
	         JLabel user = new JLabel("Username");
	         formPanel.add(user, gbc);

	         gbc.gridx = 1;
	         formPanel.add(username, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 6;
	         JLabel pw = new JLabel("password");
	         formPanel.add(pw, gbc);

	         gbc.gridx = 1;
	         formPanel.add(password, gbc);
	         //package ends

	         return formPanel;
	    }

	    private JPanel createMainPanel() {
	        JPanel mainPanel = new JPanel(new GridLayout(0, 1, 5, 10));
	        mainPanel.add(createFormPanel());
	       // mainPanel.add(createTablePanel());
	        return mainPanel;
	    }

	    private JPanel createTablePanel() {
	        JPanel tablePanel = new JPanel();

	        return tablePanel;
	    }

	    private JPanel createTopPanel() {
	        JPanel topPanel = new JPanel();
	        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	        JLabel addbranch = new JLabel("Add Branch");
	        topPanel.add(addbranch);
	        return topPanel;
	    }
	    
	    
	   	    private void saveBtnActionPerformed(ActionEvent evt) {
	   String  add=address.getText();
	  String  emai=email.getText();
	   String  nam=name.getText();
	      String weba=webadd.getText();
	   String phonen=phonenum.getText();
	   String userna=username.getText();
	   String passwo=password.getText();
	  
	        Branch b=new Branch(add, emai, nam, weba, phonen);
	       
	        Secretary s=new Secretary(userna, passwo);
	        s.setBranch(b);
	       
	        SecretaryDAO sDao=new SecretaryDaoImpl();
	         int id=sDao.getMaximumid();
	         s.setId(id+1);
	         boolean ss=sDao.insert(s);
	       if(ss){
	             JOptionPane.showMessageDialog(null,"Adding new branch and new secretary succeessful");
	       }
	       else{
	           JOptionPane.showMessageDialog(null,"Error in saving");
	       }
	   
	   
	    }
	    
	    private void jButton2ActionPerformed(ActionEvent evt) {
	        setVisible(false);
	        AdminDashboard admin= new AdminDashboard();
	        admin.setVisible(true);
	    }
	    
	    private void phonenumActionPerformed(KeyEvent evt) {
	          try {
	      Integer  x = Integer.parseInt(phonenum.getText());
	    } catch (NumberFormatException nfe) {
	          JOptionPane.showMessageDialog(null,"Please enter only number");
	        phonenum.setText("");
	    }
	    }
	    
	   
}


