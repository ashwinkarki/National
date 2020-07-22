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

import com.npsc.dao.HouseDAO;
import com.npsc.dao.SaleFlatDAO;
import com.npsc.dao.SalesDAO;
import com.npsc.dao.impl.HouseDAOImpl;
import com.npsc.dao.impl.SaleDAOFlatImpl;
import com.npsc.dao.impl.SaleDAOImpl;
import com.npsc.entity.House;
import com.npsc.entity.Sale;
import com.npsc.file.WriteReadFileHouse;
import com.npsc.file.WriteReadFileSale;

public class SaleHouse extends JFrame {

	private String type;
    private House h=null;
    
    private SalesDAO salesDAO=new SaleDAOImpl();
    private HouseDAO houseDAO=new HouseDAOImpl();
	    
	    private JButton jButton1;
	    private JButton jButton2;
	    private JTextField jTextField1;
	    
	    private SaleFlatDAO sfDAO=new SaleDAOFlatImpl();

	public SaleHouse() {
		setPreferredSize(new Dimension(600, 600));
		jButton1=new JButton("Sale");
		jButton2=new JButton("Back");
		jTextField1=new JTextField(10);
		
		  h=SecDashboard.house;
		
		 	//setSize(700,300);
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
	        
	        
	        bottomPanel.add(jButton1,gbc);
	        
	        jButton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	  jButton1ActionPerformed(evt);
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
	         JLabel n = new JLabel("Enter sold price");
	         formPanel.add(n, gbc);

	         gbc.gridx = 1;
	         formPanel.add(jTextField1, gbc);
	         
	         jTextField1.addKeyListener(new KeyAdapter() {
	             public void keyReleased(KeyEvent evt) {
	                 jTextField1KeyReleased(evt);
	             }
	         });
	        
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
	        JLabel addbranch = new JLabel("Flat Sale");
	        topPanel.add(addbranch);
	        return topPanel;
	    }


	    private void jButton1ActionPerformed(ActionEvent evt) {
	    	h.setSoldPrice(Integer.parseInt(jTextField1.getText()));
	        Sale s=new Sale(h,h.getSecretary());
	       int id=salesDAO.getMaximumid();
	         s.setId(id+1);
	         boolean ss=salesDAO.insert(s);
	         houseDAO.delete(h);
	       if(ss){
	             JOptionPane.showMessageDialog(null,"House added in Sales");
	              WriteReadFileHouse.writeFile(HouseDAOImpl.houseList);
	               WriteReadFileSale.writeFile(SaleDAOImpl.saleList);
	       }
	       else{
	           JOptionPane.showMessageDialog(null,"Error in saving");
	       }      
	    }
	    
	    private void jButton2ActionPerformed(ActionEvent evt) {
	        setVisible(false);
	        SecDashboard s=new SecDashboard();
	        s.setVisible(true);
	        s.setTable();
	    }
	    
	   
	    
	    private void jTextField1KeyReleased(KeyEvent evt) {
            try {
      Integer  x = Integer.parseInt(jTextField1.getText());
    } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,"Please enter only number");
        jTextField1.setText("");
    }
    }

	
}
