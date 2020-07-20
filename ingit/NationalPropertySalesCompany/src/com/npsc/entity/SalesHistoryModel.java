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
public class SalesHistoryModel extends AbstractTableModel {

     private List<Sale> li = new ArrayList<>();
    private String[] columnNames = { "sales_id",
"address",
"rooms",
"sellingPrice",
"soldPrics",
"noOfFloors",
"garden",
"garage"};

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
      return 7;    }

    public SalesHistoryModel() {
    }

    public SalesHistoryModel(List<Sale> list){
        System.out.println(list);
         this.li = list;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Sale hou=li.get(rowIndex);
       switch (columnIndex) {
            case 0: 
                return hou.getId();
            case 1: 
                return hou.getHouse().getAddress();
            case 2:
                return hou.getHouse().getRooms();
            case 3:
                return hou.getHouse().getSellingPrice();
            case 4:
                return hou.getHouse().getSoldPrice();
            case 5:
                return hou.getHouse().getNoOfFloors();
            case 6:
                return hou.getHouse().isGarden();
            case 7:
                return hou.getHouse().isGarden();
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
               return String.class;
             case 3:
               return Integer.class;
             case 4:
               return Integer.class;
             case 5:
               return Integer.class;
             case 6:
               return Boolean.class;
             case 7:
               return Boolean.class;
             }
             return null;
      }
    
}
