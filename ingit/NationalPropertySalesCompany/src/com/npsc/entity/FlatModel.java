/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.entity;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ashwin
 */
public class FlatModel extends AbstractTableModel {

     private List<Flat> li = new ArrayList<>();
    private String[] columnNames = { "id",
"address",
"rooms",
"sellingPrice",
"soldPrics",
"noOfFloors",
"monthlyCharge"};

     @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
    @Override
    public int getRowCount() {
    
     return li.size();
   
   
    }

    @Override
    public int getColumnCount() {
      return 6;    }

    public FlatModel() {
    }

    public FlatModel(List<Flat> list){
         this.li = list;
         System.out.println(list);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Flat hou=li.get(rowIndex);
       switch (columnIndex) {
            case 0: 
                return hou.getId();
            case 1: 
                return hou.getAddress();
            case 2:
                return hou.getNoOfRooms();
            case 3:
                return hou.getSellingPrice();
            case 4:
                return hou.getSoldPrice();
            case 5:
                return hou.getFloor();
//            case 6:
//                return hou.getSoldPrice();
            case 6:
                return hou.getMonthlyCharge();
           }
           return null;
    }
    @Override
   public Class<?> getColumnClass(int columnIndex){
          switch (columnIndex){
              case 0:
               return Integer.class;
             case 1:
               return String.class;
             case 2:
               return Integer.class;
             case 3:
               return Integer.class;
             case 4:
               return Integer.class;
             case 5:
               return Integer.class;
             case 6:
               return Integer.class;
//             case 7:
//               return Integer.class;
             }
             return null;
      }
    
}
