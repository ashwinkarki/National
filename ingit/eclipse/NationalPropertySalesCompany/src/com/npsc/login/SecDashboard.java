package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

import com.npsc.dao.FlatDAO;
import com.npsc.dao.HouseDAO;
import com.npsc.dao.impl.FlatDAOImpl;
import com.npsc.dao.impl.HouseDAOImpl;
import com.npsc.dao.impl.SecretaryDaoImpl;
import com.npsc.entity.Flat;
import com.npsc.entity.FlatModel;
import com.npsc.entity.House;
import com.npsc.entity.HouseModel;
import com.npsc.file.WriteReadFileFlat;
import com.npsc.file.WriteReadFileHouse;

public class SecDashboard extends JFrame {
	
	private List<House> houseList=null;
	private List<Flat> flatList=null;
	    public static House house=null;
	     public static Flat flat=null;
	    private HouseDAO houseDAO=new HouseDAOImpl();
	    private FlatDAO flatDAO=new FlatDAOImpl();
	    private List<House> filteredHouse=new ArrayList<>();
	    private JTable jTable1,flatTable;
	     private List<Flat> filteredFlat=new ArrayList<>();
	     private JScrollPane jScrollPane1,jScrollPane2;
	     
	     private JButton addFlat;
	     private JButton addHouse;
	     private JButton deleteHouse;
	     private JButton deleteHouse1;
	     private JButton exit;
	     private JButton flatSaleHistory;
	     private JButton houseSaleHistory;
	     private JButton jButton1;
	     private JButton jButton2;
	     private JButton updateHouse;
	     private JButton updateHouse1;
	     
	     
	public SecDashboard() {
		deleteHouse1 = new JButton("Delete Flat");
		 addFlat = new JButton("Add Flat");
		 updateHouse1 = new JButton("Update Flat");
		
		 
	        deleteHouse = new JButton("Delte House");
	        updateHouse = new JButton("Update House");
	        addHouse = new JButton("Add House");
	       
	        jButton1 = new JButton("Sale House");
	        jButton2 = new JButton("Sale Flat");
	     
	       
	        flatSaleHistory = new JButton("View Flat Sale History");
	        houseSaleHistory = new JButton("House sales history");
	        
	        exit = new JButton("Exit");
	       
		 jTable1=new JTable();
		 flatTable=new JTable();
		  house=null;
		  
		   houseList=houseDAO.getAll();
           flatList=flatDAO.getAll();
           
         filteredHouse=houseDAO.getBySecretaryId();
         filteredFlat=flatDAO.getBySecretaryId();
        //  jLabel3.setText("Welcome"+" "+SecretaryDaoImpl.sec.getUserName());
        if (filteredHouse !=null){
                  fetch();
        }
        
        if(filteredFlat!=null){
        	fetchFlat();
        	           
        }	
		
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        add(createTopPanel(), BorderLayout.PAGE_START);
	        add(createMainPanel(), BorderLayout.CENTER);
	        add(createBottomPanel(), BorderLayout.PAGE_END);
	        pack();
	        setLocationByPlatform(true);
	        setVisible(true);
	        
	        
	        
	        
	}
	
	
	private JPanel createBottomPanel() {
		   JPanel buttomPanel = new JPanel(new GridBagLayout());
		   buttomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	         GridBagConstraints gbc = new GridBagConstraints();
	         gbc.anchor = GridBagConstraints.NORTHWEST;
	         gbc.gridx = 0;
	         gbc.gridy = 0;
	         gbc.insets.bottom = 5;
	         gbc.insets.left = 5;
	         gbc.insets.right = 5;
	         gbc.insets.top = 5;
	         buttomPanel.add(jButton1 , gbc);

	         jButton1.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 jButton1ActionPerformed(evt);
	             }
	         });
	         
	         
	         gbc.gridx = 1;
	         buttomPanel.add(houseSaleHistory  , gbc);
	         
	         houseSaleHistory.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 houseSaleHistoryActionPerformed(evt);
	             }
	         });
	         
	         
	         

	        	         
	         gbc.gridx = 5;
	         gbc.insets.left = 15;
	         gbc.anchor = GridBagConstraints.SOUTHEAST;
	         buttomPanel.add(jButton2, gbc);
	         
	         jButton2.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 jButton2ActionPerformed(evt);
	             }
	         });
	         
	         gbc.gridx = 6;
	         buttomPanel.add(flatSaleHistory   , gbc);
	         
	         flatSaleHistory.addActionListener(new ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 flatSaleHistoryActionPerformed(evt);
	             }
	         });
	         
	         gbc.gridx = 7;
	         buttomPanel.add(exit   , gbc);
	         
	         exit.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 exitActionPerformed(evt);
	             }
	         });
	         
	          return buttomPanel;
	    }

	    private JPanel createFormPanel() {
	    	JPanel flatPanel = new JPanel();
	         JScrollPane js=fetch();    
	         flatPanel.add(js);
	        return flatPanel;

	        
	    }

	    private JPanel createMainPanel() {
	        JPanel mainPanel = new JPanel(new GridLayout(0, 2, 5, 10));
	        mainPanel.add(createFormPanel());
	        mainPanel.add(createTablePanel());
	        return mainPanel;
	    }

	    private JPanel createTablePanel() {
	    	JPanel tablePanel = new JPanel();
	         JScrollPane js=fetchFlat();    
	        tablePanel.add(js);
	        return tablePanel;
	    }

	    private JPanel createTopPanel() {

	    	
	    	  JPanel topPanel = new JPanel(new GridLayout(2,0, 5, 10));
	    	  topPanel.add(createTopText());
	    	  topPanel.add(buttons());
		        return topPanel;
	    }
	    
	    
	
	    private JPanel buttons() {
	    	 JPanel buttonPanel = new JPanel(new GridBagLayout());
	    	 buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	         GridBagConstraints gbc = new GridBagConstraints();
	         gbc.anchor = GridBagConstraints.NORTHWEST;
	         gbc.gridx = 0;
	         gbc.gridy = 0;
	         gbc.insets.bottom = 5;
	         gbc.insets.left = 5;
	         gbc.insets.right = 5;
	         gbc.insets.top = 5;
	         buttonPanel.add(addHouse, gbc);
	         
	         
	         addHouse.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 addHouseActionPerformed(evt);
	             }
	         });

	         gbc.gridx = 1;
	         buttonPanel.add(updateHouse , gbc);
	         
	         updateHouse.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 updateHouseActionPerformed(evt);
	             }
	         });

	         gbc.gridx = 2;
	         buttonPanel.add(deleteHouse , gbc);
	         
	         deleteHouse.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 deleteHouseActionPerformed(evt);
	             }
	         });

	         
	         gbc.gridx = 5;
	         gbc.insets.left = 15;
	         gbc.anchor = GridBagConstraints.SOUTHEAST;
	         buttonPanel.add(addFlat  , gbc);
	         
	         addFlat.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 addFlatActionPerformed(evt);
	             }
	         });
	         
	         
	         gbc.gridx = 6;
	         buttonPanel.add(updateHouse1  , gbc);
	         
	         updateHouse1.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 updateHouse1ActionPerformed(evt);
	             }
	         });

	         
	         gbc.gridx = 7;
	         buttonPanel.add(deleteHouse1, gbc);
	         
	         deleteHouse1.addActionListener(new ActionListener() {
	             public void actionPerformed(ActionEvent evt) {
	                 deleteHouse1ActionPerformed(evt);
	             }
	         });

	         return buttonPanel;
		}


		private JPanel createTopText() {
	    	JPanel topPanel = new JPanel();
	        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	        JLabel addbranch = new JLabel("Secretary  Dashboard");
	        topPanel.add(addbranch);
	        return topPanel;
		}


		protected void initDetail(int selectedRow) {
	        house = filteredHouse.get(jTable1.convertRowIndexToModel(selectedRow));
	    System.out.print("house seelctd"+house);
	      
	    }
	    
	       protected void initDetailFlat(int selectedRow) {
	        flat = filteredFlat.get(jTable1.convertRowIndexToModel(selectedRow));
	        System.out.print("flatselect is"+flat);
	      
	    }
	       
	       public JScrollPane fetch(){
	    	   jScrollPane1=new JScrollPane();
	           houseDAO=new  HouseDAOImpl();
//	           houseList=new ArrayList<>();
//	              houseList=houseDAO.getAll();
	         
	            if (filteredHouse !=null){
	                
	       jTable1.setVisible(true);
	       jTable1.setModel(new HouseModel(filteredHouse));
	       jScrollPane1.setViewportView(jTable1);
	       
	            }
	            jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
	                public void mouseClicked(java.awt.event.MouseEvent evt) {
	                    jTable1MouseClicked(evt);
	                }
	            });
	            return jScrollPane1;
	     
	       }   
	
	    private JScrollPane fetchFlat() {
	    	jScrollPane2=new JScrollPane();
	        flatTable.setVisible(true);
	       // flatList=new ArrayList<>();
	        flatTable.setModel(new FlatModel(filteredFlat));
	        jScrollPane2.setViewportView(flatTable);
	        
	        flatTable.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                flatTableMouseClicked(evt);
	            }
	        });
	        return jScrollPane2;
	    }

	    void setTable() {
	    jTable1.repaint();
	    }

	    
	    private void addHouseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addHouseActionPerformed
	        setVisible(false);
	        AddHouse adHouse=new AddHouse();
	        adHouse.setVisible(true);
	    }
	    
	    private void updateHouseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateHouseActionPerformed
	        setVisible(false);
	        UpdateHouse u=new UpdateHouse();
	        u.setVisible(true);
	    }
	    
	    private void deleteHouseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteHouseActionPerformed
	        //house.setSecretary(SecretaryDaoImpl.sec);
	         boolean x= houseDAO.delete(house);
	        if(x){
	               JOptionPane.showMessageDialog(null,"House is deleted");
	               //jTable1.repaint();
	               filteredHouse=houseDAO.getBySecretaryId();
	              jTable1.setModel(new HouseModel(filteredHouse));
	              jTable1.setPreferredScrollableViewportSize(new Dimension(450,63));
	         jTable1.setFillsViewportHeight(true);

	         JScrollPane js=new JScrollPane(jTable1);
	         js.setVisible(true);
	         add(js);
	              // WriteReadFileHouse.writeFile(HouseDAOImpl.houseList);
	             // new SecDashboard();
	              house=null;
	        }
	     }
	    
	    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        if(house==null){
	            JOptionPane.showMessageDialog(null,"Please select House");
	        }
	        else{
	            setVisible(false);
	            SaleHouse sale=new SaleHouse();
	            sale.setVisible(true);
	          //  sale.setSaleType("house");
	        }
	    }
	    
	    private void addFlatActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addFlatActionPerformed
	        
            setVisible(false);
      AddFlat ad=new AddFlat();
      ad.setVisible(true);
    //  ad.passHouse(house);
     
  }
	    
	    private void updateHouse1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateHouse1ActionPerformed
	        setVisible(false);
	        UpdateFlat u=new UpdateFlat();
	        u.setVisible(true);
	    }
	    
	    private void deleteHouse1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteHouse1ActionPerformed
	        flat.setSec(SecretaryDaoImpl.sec);
	         boolean x= flatDAO.delete(flat);
	        if(x){
	               JOptionPane.showMessageDialog(null,"Flat is deleted");
	             // tableModel.fireTableDataChanged();
	                filteredFlat=flatDAO.getBySecretaryId();
	              flatTable.setModel(new FlatModel(filteredFlat));
	        }
	               
	     }
	    
	    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	        setVisible(false);
	            SaleFlat sh=new SaleFlat();
	            sh.setVisible(true);
	    }
	    
	    private void flatSaleHistoryActionPerformed(ActionEvent evt) {//GEN-FIRST:event_flatSaleHistoryActionPerformed
	        setVisible(false);
	            SaleHistoryFlat sh=new SaleHistoryFlat();
	            sh.setVisible(true);
	    }
	    
	    private void exitActionPerformed(ActionEvent evt) {
	        houseList=HouseDAOImpl.houseList;
	                
	        WriteReadFileHouse.writeFile(houseList);
	        
	        flatList=FlatDAOImpl.flatList;
	        
	        WriteReadFileFlat.writeFile(flatList);
	        System.exit(0);
	    }
	    
	    
	    private void houseSaleHistoryActionPerformed(ActionEvent evt) {//GEN-FIRST:event_houseSaleHistoryActionPerformed
            setVisible(false);
            SaleHistory sh=new SaleHistory();
            sh.setVisible(true);
    }
	    
	    
	    private void flatTableMouseClicked(MouseEvent evt) {
	        initDetailFlat(flatTable.getSelectedRow());
	    }
	    
	    private void jTable1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
	        initDetail(jTable1.getSelectedRow());
	    }  
		    
}
