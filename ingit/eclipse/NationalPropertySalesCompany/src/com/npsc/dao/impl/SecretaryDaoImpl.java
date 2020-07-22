/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;


import com.npsc.dao.SecretaryDAO;
import com.npsc.entity.Secretary;
import com.npsc.file.WriteReadFile;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashwin
 */
public class SecretaryDaoImpl implements SecretaryDAO {
  public static List<Secretary> secList=new ArrayList<Secretary>();
    private  String filename = "secretary.txt";
    
    public static Secretary sec=null;

    
    
    @Override
    public boolean insert(Secretary t) {
        
      boolean added=secList.add(t);
          
      if(added){
          return true;
      }
      else{
          return false;  
      }
     
     
    }

    @Override
    public Secretary update(Secretary t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Secretary t) {
      boolean removed= secList.remove(t);
     
     if(removed){
         return true;
     }
     else{
         return false;
     }
         

         
               
    }

    @Override
    public List<Secretary> getAll() {
        if(secList.size()==0){
             try{
FileInputStream fis = new FileInputStream(filename);
ObjectInputStream ois = new ObjectInputStream(fis);
secList= (List<Secretary>) ois.readObject();
ois.close();
if(secList==null){
secList=new ArrayList<Secretary>();

return secList;
}
else{
    return secList;
}
        }
        catch(Exception e){
           secList=new ArrayList<Secretary>();
           
          return secList;  
        }   
        }
        else{
            return secList;
        }
      
    
    }

    @Override
    public int getMaximumid() {
     int maxId=0;
      secList=getAll();
      if(secList==null){
          secList=new ArrayList<>();
      }
        System.err.println("from maximunid is"+getAll());
     if (secList.size()==0){
          return 0;
      }
     else {
        int maxid=secList.get(secList.size()-1).getId();
         return maxid;
      }
     
    }

    @Override
    public boolean getSec(String userName, String password) {
       List<Secretary> secList=getAll();
        for(Secretary s:secList){
           
            if(s.getUserName().equals(userName) && 
                    s.getPassword().equals(password)){
                sec=s;
                return true;
            }
        }
        
        return false;
        
    }
    

}
