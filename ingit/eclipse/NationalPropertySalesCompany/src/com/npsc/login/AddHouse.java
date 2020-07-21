package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class AddHouse   extends JFrame {
	
//	public AddHouse() {
//		
//		
//		
//		setSize(700,300);
//		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	        add(createTopPanel(), BorderLayout.PAGE_START);
//	        add(createMainPanel(), BorderLayout.CENTER);
//	        add(createBottomPanel(), BorderLayout.PAGE_END);
//	        pack();
//	        setLocationByPlatform(true);
//	        setVisible(true);
//	}
//	
//	
//	  private JPanel createBottomPanel() {
//		  JPanel bottomPanel = new JPanel(new GridBagLayout());
//	        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//	   	 GridBagConstraints gbc = new GridBagConstraints();
//	        gbc.anchor = GridBagConstraints.LINE_START;
//	        gbc.gridx = 0;
//	        gbc.gridy = 0;
//	        gbc.insets.bottom = 5;
//	        gbc.insets.left = 5;
//	        gbc.insets.right = 5;
//	        gbc.insets.top = 5;
//	        
//	        
//	        bottomPanel.add(saveBtn,gbc);
//	        
//	        saveBtn.addActionListener(new ActionListener() {
//	            public void actionPerformed(ActionEvent evt) {
//	            	saveBtnActionPerformed(evt);
//	            }
//	        });
//	      
//	        gbc.gridx = 0;
//	        gbc.gridy = 1;
//	        bottomPanel.add(jButton2,gbc);
//	        
//	        jButton2.addActionListener(new ActionListener() {
//	            public void actionPerformed(ActionEvent evt) {
//	                jButton2ActionPerformed(evt);
//	            }
//	        });
//	         
//	        return bottomPanel;
//	    }
//	  
//	  
//	  private JPanel createFormPanel() {
//	    	 JPanel formPanel = new JPanel(new GridBagLayout());
//	         GridBagConstraints gbc = new GridBagConstraints();
//	         gbc.anchor = GridBagConstraints.LINE_START;
//	         gbc.gridx = 0;
//	         gbc.gridy = 0;
//	         gbc.insets.bottom = 5;
//	         gbc.insets.left = 5;
//	         gbc.insets.right = 5;
//	         gbc.insets.top = 5;
//	         JLabel addre = new JLabel("Address");
//	         formPanel.add(addre, gbc);
//
//	         gbc.gridx = 1;
//	         formPanel.add(name, gbc);
//
//	         gbc.gridx = 0;
//	         gbc.gridy = 1;
//	         JLabel rooms = new JLabel("Rooms");
//	         formPanel.add(rooms, gbc);
//
//	         gbc.gridx = 1;
//	         formPanel.add(address, gbc);
//	         
//	         //package starts
//	         gbc.gridx = 0;
//	         gbc.gridy = 2;
//	         JLabel sellingPri = new JLabel("Selling Price");
//	         formPanel.add(sellingPri, gbc);
//	         
//	       
//
//	         gbc.gridx = 1;
//	         formPanel.add(phonenum, gbc);
//	         
//	         phonenum.addKeyListener(new KeyAdapter() {
//	             // override keyReleased listener on the Email TextField
//	             @Override
//	             public void keyReleased(KeyEvent e) {
//	            	 phonenumActionPerformed(e);
//	                                
//	             }
//	         });
//
//	         
//	         //package ends
//	         
//	       //package starts
//	         gbc.gridx = 0;
//	         gbc.gridy = 3;
//	         JLabel nooffl = new JLabel("No Of floors");
//	         formPanel.add(nooffl, gbc);
//
//	         gbc.gridx = 1;
//	         formPanel.add(email, gbc);
//	         //package ends
//	         
//	         //package starts
//	         gbc.gridx = 0;
//	         gbc.gridy = 4;
//	         JLabel web = new JLabel("Garden");
//	         formPanel.add(web, gbc);
//
//	         gbc.gridx = 1;
//	         formPanel.add(webadd, gbc);
//	         //package ends
//	         
//	         //package starts
//	         gbc.gridx = 0;
//	         gbc.gridy = 5;
//	         JLabel user = new JLabel("Garage");
//	         formPanel.add(user, gbc);
//
//	         gbc.gridx = 1;
//	         formPanel.add(username, gbc);
//	         //package ends
//	         
//	        
//
//	         return formPanel;
//	    }
//	  
//	  private JPanel createMainPanel() {
//	        JPanel mainPanel = new JPanel(new GridLayout(0, 1, 5, 10));
//	        mainPanel.add(createFormPanel());
//	       // mainPanel.add(createTablePanel());
//	        return mainPanel;
//	    }
//
//	    private JPanel createTablePanel() {
//	        JPanel tablePanel = new JPanel();
//
//	        return tablePanel;
//	    }
//	    
//	    private JPanel createTopPanel() {
//	        JPanel topPanel = new JPanel();
//	        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//	        JLabel addbranch = new JLabel("Add House");
//	        topPanel.add(addbranch);
//	        return topPanel;
//	    }

}
