package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import com.npsc.dao.impl.SecretaryDaoImpl;
import com.npsc.entity.FinalTableModel;

public class SaleHistoryFlat  extends JFrame  {

	
//	public SaleHistory() {
//	 	setSize(700,300);
//	 	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        add(createTopPanel(), BorderLayout.PAGE_START);
//        add(createMainPanel(), BorderLayout.CENTER);
//        add(createBottomPanel(), BorderLayout.PAGE_END);
//        pack();
//        setLocationByPlatform(true);
//        setVisible(true);
//}
//
//
//  private JPanel createBottomPanel() {
//	  JPanel bottomPanel = new JPanel(new GridBagLayout());
//        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//   	 GridBagConstraints gbc = new GridBagConstraints();
//        gbc.anchor = GridBagConstraints.LINE_START;
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.insets.bottom = 5;
//        gbc.insets.left = 5;
//        gbc.insets.right = 5;
//        gbc.insets.top = 5;
//        
//        
//        bottomPanel.add(saveBtn,gbc);
//        
//        saveBtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//            	saveBtnActionPerformed(evt);
//            }
//        });
//      
//             
//        return bottomPanel;
//    }
//  
//  
// private JPanel createMainPanel() {
//        JPanel mainPanel = new JPanel(new GridLayout(0, 1, 5, 10));
//        //mainPanel.add(createFormPanel());
//        mainPanel.add(createTablePanel());
//        return mainPanel;
//    }
//
//    private JPanel createTablePanel() {
//        JPanel tablePanel = new JPanel();
//         JScrollPane js=fetch();    
//        tablePanel.add(js);
//        return tablePanel;
//    }
//    
//    private JPanel createTopPanel() {
//        JPanel topPanel = new JPanel();
//        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//        JLabel addbranch = new JLabel("Sales History House");
//        topPanel.add(addbranch);
//        return topPanel;
//    }
//
//
//    public JScrollPane fetch(){
//    	
//    	jScrollPane1 = new JScrollPane();
//        secDao=new SecretaryDaoImpl();
//        secList=new ArrayList<>();
//           secList=secDao.getAll();
//       System.out.println(secList);
//         if (secList !=null){
//             
//       jtable1.setVisible(true);
//    jtable1.setModel(new FinalTableModel(secList));
//    jScrollPane1.setViewportView(jtable1);
//    jtable1.addMouseListener(new MouseAdapter() {
//        public void mouseClicked(MouseEvent evt) {
//            jTable1MouseClicked(evt);
//        }
//    });
//         }
//         return jScrollPane1; 
//  
//    }
}
