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
public class FinalTableModel extends AbstractTableModel {

     private List<Secretary> li = new ArrayList<>();
    private String[] columnNames = { "id","username", "password", "address",
                "email", "name", "webadd", "phonenum"};

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

    public FinalTableModel() {
    }

    public FinalTableModel(List<Secretary> list){
         this.li = list;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Secretary sec=li.get(rowIndex);
       switch (columnIndex) {
            case 0: 
                return sec.getId();
            case 1: 
                return sec.getUserName();
            case 2:
                return sec.getPassword();
            case 3:
                return sec.getBranch().getAddress();
            case 4:
                return sec.getBranch().getEmail();
            case 5:
                return sec.getBranch().getName();
            case 6:
                return sec.getBranch().getWebadd();
            case 7:
                return sec.getBranch().getPhonenum();
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
               return String.class;
             case 4:
               return String.class;
             case 5:
               return String.class;
             case 6:
               return String.class;
             case 7:
               return String.class;
             }
             return null;
      }
    
}
