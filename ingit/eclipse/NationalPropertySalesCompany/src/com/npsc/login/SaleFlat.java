package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.npsc.dao.FlatDAO;
import com.npsc.dao.SaleFlatDAO;
import com.npsc.dao.impl.FlatDAOImpl;
import com.npsc.dao.impl.SaleDAOFlatImpl;
import com.npsc.entity.Flat;
import com.npsc.entity.SaleFlats;
import com.npsc.file.WriteReadFileFlat;
import com.npsc.file.WriteReadFileSaleFlat;

public class SaleFlat  extends JFrame  {
	
	 private String type;
	    private Flat f=null;
	    private FlatDAO flatDAO=new FlatDAOImpl();
	    
	    private JButton jButton1;
	    private JButton jButton2;
	    private JTextField jTextField1;
	    
	    private SaleFlatDAO sfDAO=new SaleDAOFlatImpl();

	public SaleFlat() {
		setPreferredSize(new Dimension(600, 600));
		jButton1=new JButton("Sale");
		jButton2=new JButton("Back");
		jTextField1=new JTextField(10);
		
		f=SecDashboard.flat;
		
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
	        f.setSoldPrice(Integer.parseInt(jTextField1.getText()));
	        SaleFlats sfs=new SaleFlats(f,f.getSec());
	       int id=sfDAO.getMaximumid();
	         sfs.setId(id+1);
	         boolean ss=sfDAO.insert(sfs);
	         flatDAO.delete(f);
	       if(ss){
	             JOptionPane.showMessageDialog(null,"Flat Added in Sales");
	              WriteReadFileFlat.writeFile(FlatDAOImpl.flatList);
	               WriteReadFileSaleFlat.writeFile(SaleDAOFlatImpl.saleFlatList);
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
	    
	    void setSaleType(String h) {
	           this.type=h; 
	    }

}
