/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.login;

import com.npsc.dao.HouseDAO;
import com.npsc.dao.impl.HouseDAOImpl;
import com.npsc.entity.House;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashwin
 */
public class UpdateHouse extends javax.swing.JFrame {
   private  boolean  gardenSelected=false;
      private  boolean garageSelected=false;
      private HouseDAO h=new HouseDAOImpl();
      private House house=null;
    /**
     * Creates new form UpdateHouse
     */
    public UpdateHouse() {
        initComponents();
        
      
         house=SecDashboard.house;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        garden = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sellingprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nooffloor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        garage = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        room = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 160, 220));

        saveBtn.setIcon(new javax.swing.ImageIcon("F:\\NationalPropertySalesCompany\\icons8-update-tag-32.png")); // NOI18N
        saveBtn.setText("Update House");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        garden.setText("Yes?");
        garden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gardenActionPerformed(evt);
            }
        });

        jLabel4.setText("Selling Price:");

        jButton2.setIcon(new javax.swing.ImageIcon("F:\\NationalPropertySalesCompany\\icons8-back-50.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sellingprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingpriceActionPerformed(evt);
            }
        });
        sellingprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellingpriceKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Update House");

        jLabel3.setText("Rooms:");

        jLabel2.setText("Address:");

        nooffloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nooffloorActionPerformed(evt);
            }
        });
        nooffloor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nooffloorKeyReleased(evt);
            }
        });

        jLabel8.setText("Garage:");

        garage.setText("Yes?");
        garage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garageActionPerformed(evt);
            }
        });

        jLabel7.setText("Garden:");

        room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roomKeyReleased(evt);
            }
        });

        jLabel6.setText("No of Floors:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(garden)
                            .addComponent(garage)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nooffloor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(sellingprice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(room, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nooffloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(garden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(garage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gardenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gardenActionPerformed
        if(garage.isSelected()){
            gardenSelected=true;
        }
    }//GEN-LAST:event_gardenActionPerformed

    private void garageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garageActionPerformed
        if(garage.isSelected()){
            garageSelected=true;
        }

    }//GEN-LAST:event_garageActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
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
       
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        SecDashboard sec=new SecDashboard();
        sec.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nooffloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nooffloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nooffloorActionPerformed

    private void roomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomKeyReleased
         try {
      Integer  x = Integer.parseInt(room.getText());
    } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,"Please enter only number");
        room.setText("");
    }
    }//GEN-LAST:event_roomKeyReleased

    private void sellingpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingpriceActionPerformed

    private void sellingpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingpriceKeyReleased
            try {
      Integer  x = Integer.parseInt(sellingprice.getText());
    } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,"Please enter only number");
        sellingprice.setText("");
    }
    }//GEN-LAST:event_sellingpriceKeyReleased

    private void nooffloorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nooffloorKeyReleased
             try {
      Integer  x = Integer.parseInt(nooffloor.getText());
    } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,"Please enter only number");
        nooffloor.setText("");
    }
    }//GEN-LAST:event_nooffloorKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JCheckBox garage;
    private javax.swing.JCheckBox garden;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nooffloor;
    private javax.swing.JTextField room;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sellingprice;
    // End of variables declaration//GEN-END:variables
}
