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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.npsc.dao.HouseDAO;
import com.npsc.dao.impl.HouseDAOImpl;
import com.npsc.entity.House;

public class UpdateHouse  extends JFrame  {

	private  boolean  gardenSelected=false;
    private  boolean garageSelected=false;
    private HouseDAO h=new HouseDAOImpl();
    private House house=null;
	
    private JButton jButton2;
 	private JButton saveBtn;   

     private JTextField nooffloor;
     private JTextField room;
     private JTextField address;
     private JTextField sellingprice;

    private JCheckBox garage;
     private JCheckBox garden;
    
public UpdateHouse() {
	setPreferredSize(new Dimension(600, 600));
	jButton2=new JButton("Back");
	saveBtn=new JButton("Update");
	nooffloor=new JTextField(10);
	room=new JTextField(10);
	address=new JTextField(10);
	sellingprice=new JTextField(10);
	garage=new JCheckBox();
	garden=new JCheckBox();
    house=SecDashboard.house;	
    
    
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
	         JLabel addre = new JLabel("Address");
	         formPanel.add(addre, gbc);

	         gbc.gridx = 1;
	         formPanel.add(address, gbc);

	         gbc.gridx = 0;
	         gbc.gridy = 1;
	         JLabel rooms = new JLabel("Rooms");
	         formPanel.add(rooms, gbc);

	         gbc.gridx = 1;
	         formPanel.add(room, gbc);
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 2;
	         JLabel sellingPri = new JLabel("Selling Price");
	         formPanel.add(sellingPri, gbc);
	         
	       

	         gbc.gridx = 1;
	         formPanel.add(sellingprice, gbc);
	         
	         sellingprice.addKeyListener(new  KeyAdapter() {
	             public void keyReleased(KeyEvent evt) {
	                 sellingpriceKeyReleased(evt);
	             }
	         });

	         
	         //package ends
	         
	       //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 3;
	         JLabel nooffl = new JLabel("No Of floors");
	         formPanel.add(nooffl, gbc);

	         gbc.gridx = 1;
	         formPanel.add(nooffloor, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 4;
	         JLabel web = new JLabel("Garden");
	         formPanel.add(web, gbc);

	         gbc.gridx = 1;
	         formPanel.add(garden, gbc);
	         //package ends
	         
	         //package starts
	         gbc.gridx = 0;
	         gbc.gridy = 5;
	         JLabel user = new JLabel("Garage");
	         formPanel.add(user, gbc);

	         gbc.gridx = 1;
	         formPanel.add(garage, gbc);
	         //package ends
	         
	         nooffloor.addKeyListener(new KeyAdapter() {
	             public void keyReleased(java.awt.event.KeyEvent evt) {
	                 nooffloorKeyReleased(evt);
	             }
	         });

	         ;

	         garage.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 garageActionPerformed(evt);
	             }
	         });
	         
	         garden.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 gardenActionPerformed(evt);
	             }
	         });

	           room.addKeyListener(new KeyAdapter() {
	             public void keyReleased(KeyEvent evt) {
	                 roomKeyReleased(evt);
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
	        JLabel addbranch = new JLabel("Update House");
	        topPanel.add(addbranch);
	        return topPanel;
	    }
	    
	    private void jButton2ActionPerformed(ActionEvent evt) {
	        setVisible(false);
	        SecDashboard sec=new SecDashboard();
	        sec.setVisible(true);
	    }
	    
	    private void sellingpriceKeyReleased(KeyEvent evt) {
            try {
      Integer  x = Integer.parseInt(sellingprice.getText());
    } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,"Please enter only number");
        sellingprice.setText("");
    }
    }
	    
	    private void nooffloorKeyReleased(KeyEvent evt) {
            try {
     Integer  x = Integer.parseInt(nooffloor.getText());
   } catch (NumberFormatException nfe) {
         JOptionPane.showMessageDialog(null,"Please enter only number");
       nooffloor.setText("");
   }
   }
	    
	    private void roomKeyReleased(KeyEvent evt) {
	         try {
	      Integer  x = Integer.parseInt(room.getText());
	    } catch (NumberFormatException nfe) {
	          JOptionPane.showMessageDialog(null,"Please enter only number");
	        room.setText("");
	    }
	    }
	    
	    private void saveBtnActionPerformed(ActionEvent evt) {
	        
	        House newHouse=new House(house.getId(),address.getText(),Integer.parseInt(room.getText()),Integer.parseInt(sellingprice.getText()),Integer.parseInt(nooffloor.getText()),gardenSelected, garageSelected,
	     house.getSecretary());
	     
	        h.delete(house);
	       House j=h.update(newHouse);
	       if(j!=null){
	               JOptionPane.showMessageDialog(null,"updating house sucessful");
//	            
	       }
	       else{
	           JOptionPane.showMessageDialog(null,"Error in upadting");
	       }
	       
	    }
	    
	    

	    private void gardenActionPerformed(ActionEvent evt) {
	        if(garden.isSelected()){
	            gardenSelected=true;
	        }
	    }//GEN-LAST:event_gardenActionPerformed

	    private void garageActionPerformed(ActionEvent evt) {
	        if(garage.isSelected()){
	            garageSelected=true;
	        }

	    }
}
