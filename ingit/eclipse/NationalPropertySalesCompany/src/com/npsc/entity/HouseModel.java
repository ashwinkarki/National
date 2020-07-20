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
public class HouseModel extends AbstractTableModel {

     private List<House> li = new ArrayList<>();
    private String[] columnNames = { "id",
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
      return 8;    }

    public HouseModel() {
    }

    public HouseModel(List<House> list){
        System.out.println(list);
         this.li = list;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       House hou=li.get(rowIndex);
       switch (columnIndex) {
            case 0: 
                return hou.getId();
            case 1: 
                return hou.getAddress();
            case 2:
                return hou.getRooms();
            case 3:
                return hou.getSellingPrice();
            case 4:
                return hou.getSoldPrice();
            case 5:
                return hou.getNoOfFloors();
            case 6:
                return hou.isGarden();
            case 7:
                return hou.isGarage();
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
