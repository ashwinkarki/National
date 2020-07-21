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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.npsc.dao.FlatDAO;
import com.npsc.dao.impl.FlatDAOImpl;
import com.npsc.dao.impl.SecretaryDaoImpl;
import com.npsc.entity.Flat;
import com.npsc.entity.Secretary;

public class UpdateFlat  extends JFrame  {

	private JButton jButton1;
    private JButton update;

    private JTextField monthlyCharge;
    private JTextField rooms;
    private JTextField sellingPrice;
    private JTextField address;
    private JTextField floor;
    private Flat f=null;
    
    
    public UpdateFlat() {
    	 f=SecDashboard.flat;
    	 
	update=new JButton("Update"); 
	jButton1=new JButton("Back");
	floor=new JTextField(10);
	address=new JTextField(10);
	sellingPrice=new JTextField(10);
	rooms=new JTextField(10);
	monthlyCharge=new JTextField(10);
	 
		setSize(700,300);
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
	        
	        
	        bottomPanel.add(update,gbc);
	        
	        update.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	updateActionPerformed(evt);
	            }
	        });
	      
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        bottomPanel.add(jButton1,gbc);
	        
	        jButton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                jButton1ActionPerformed(evt);
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
	         JLabel add = new JLabel("Address");
	         formPanel.add(add, gbc);

	         gbc.gridx = 1;
	         formPanel.add(address, gbc);

	         gbc.gridx = 0;
	         gbc.gridy = 1;
	         JLabel noofRooms = new JLabel("No of Rooms");
	         formPanel.add(noofRooms, gbc);

	         gbc.gridx = 1;
	         formPanel.add(rooms, gbc);
	         
	         rooms.addKeyListener(new KeyAdapter() {
	             public void keyReleased(KeyEvent evt) {
	                 roomsKeyReleased(evt);
	             }
	         });
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 2;
	         JLabel sellingPri = new JLabel("Selling Price");
	         formPanel.add(sellingPri, gbc);
	         
	       

	         gbc.gridx = 1;
	         formPanel.add(sellingPrice, gbc);
	         
	         sellingPrice.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 sellingPriceActionPerformed(evt);
	             }
	         });

	         
	         //package ends
	         
	       //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 3;
	         JLabel flo = new JLabel("Floor");
	         formPanel.add(flo, gbc);

	         gbc.gridx = 1;
	         formPanel.add(floor, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 4;
	         JLabel mnthylCharge = new JLabel("Monthly Charge");
	         formPanel.add(mnthylCharge, gbc);

	         gbc.gridx = 1;
	         formPanel.add(monthlyCharge, gbc);
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
	        JLabel addbranch = new JLabel("Update Flat");
	        topPanel.add(addbranch);
	        return topPanel;
	    }
	    
	    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        setVisible(false);
	        SecDashboard s=new SecDashboard();
	        s.setVisible(true);
	    }
	    
	    private void updateActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
	    System.out.println("f is"+f);
	        Flat newFlat=new Flat(f.getId(),address.getText(),
	            Integer.parseInt(rooms.getText()), Integer.parseInt(sellingPrice.getText()), Integer.parseInt(floor.getText()), Integer.parseInt(monthlyCharge.getText()));
	        //  f.setHouse(house);
          
	        FlatDAO  fDao=new FlatDAOImpl();

	        fDao.delete(f);
	        newFlat.setSec(SecretaryDaoImpl.sec);
	     Flat ss=fDao.update(newFlat);
	        if(ss!=null){
	            JOptionPane.showMessageDialog(null,"Updating flat successful");

	        }
	        else{
	            JOptionPane.showMessageDialog(null,"Error in updating");
	        }

	    }
	    
	    private void roomsKeyReleased(KeyEvent evt) {//GEN-FIRST:event_roomsKeyReleased
	          try {
	      Integer  x = Integer.parseInt(rooms.getText());
	    } catch (NumberFormatException nfe) {
	          JOptionPane.showMessageDialog(null,"Please enter only number");
	        rooms.setText("");
	    }
	    }
	    
	    private void sellingPriceActionPerformed(ActionEvent evt) {//GEN-FIRST:event_sellingPriceActionPerformed
	           try {
	      Integer  x = Integer.parseInt(sellingPrice.getText());
	    } catch (NumberFormatException nfe) {
	          JOptionPane.showMessageDialog(null,"Please enter only number");
	        sellingPrice.setText("");
	    }
	    }
}
