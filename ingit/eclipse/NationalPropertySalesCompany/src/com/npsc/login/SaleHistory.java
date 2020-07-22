package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

import com.npsc.dao.SalesDAO;
import com.npsc.dao.impl.SaleDAOImpl;
import com.npsc.entity.Sale;
import com.npsc.entity.SalesHistoryModel;

public class SaleHistory extends JFrame  {

	   
    private List<Sale> saleList=new ArrayList<>();
    private List<Sale> newList=new ArrayList<>();
    private SalesDAO salesDAO=new SaleDAOImpl();
	
	private JButton jButton1;
	private JTable jTable1;
	private JScrollPane jScrollPane1;
  
	
	public SaleHistory() {
		setPreferredSize(new Dimension(600, 600));
		jButton1=new JButton("Back");
		jTable1=new JTable();
        saleList=salesDAO.getAll();
        
       newList=salesDAO.getBySecretaryId();
      
       if (newList !=null){
        fetch();
         }

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
      
             
        return bottomPanel;
    }
  
  
 private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel(new GridLayout(0, 1, 5, 10));
        //mainPanel.add(createFormPanel());
        mainPanel.add(createTablePanel());
        return mainPanel;
    }

    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel();
         JScrollPane js=fetch();    
        tablePanel.add(js);
        return tablePanel;
    }
    
    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel addbranch = new JLabel("Sales History House");
        topPanel.add(addbranch);
        return topPanel;
    }


    public JScrollPane fetch(){
    	jScrollPane1=new JScrollPane();
        jTable1.setVisible(true);
        jTable1.setModel(new SalesHistoryModel(newList));
        jScrollPane1.setViewportView(jTable1);
          return jScrollPane1; 
  
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {
        setVisible(false);
        SecDashboard s=new SecDashboard();
        s.setVisible(true);
    }
}
