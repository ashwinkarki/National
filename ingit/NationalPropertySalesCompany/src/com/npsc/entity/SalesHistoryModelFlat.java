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
public class SalesHistoryModelFlat extends AbstractTableModel {

     private List<SaleFlats> li = new ArrayList<>();
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

    public SalesHistoryModelFlat() {
    }

    public SalesHistoryModelFlat(List<SaleFlats> list){
        System.out.println(list);
         this.li = list;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       SaleFlats hou=li.get(rowIndex);
       switch (columnIndex) {
            case 0: 
                return hou.getId();
            case 1: 
                return hou.getFlat().getAddress();
            case 2:
                return hou.getFlat().getNoOfRooms();
            case 3:
                return hou.getFlat().getSellingPrice();
            case 4:
                return hou.getFlat().getSoldPrice();
            case 5:
                return hou.getFlat().getFloor();
            case 6:
                return hou.getFlat().getSellingPrice();
            case 7:
                return hou.getFlat().getSoldPrice();
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
               return Integer.class;
             case 7:
               return Integer.class;
             }
             return null;
      }
    
}
