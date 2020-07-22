/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;


import com.npsc.dao.FlatDAO;
import static com.npsc.dao.impl.HouseDAOImpl.houseList;
import com.npsc.entity.Flat;
import com.npsc.entity.House;
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
public class FlatDAOImpl implements FlatDAO {
  public static List<Flat> flatList=new ArrayList<Flat>();
    private  String filename = "flat.txt";

    
    
    @Override
    public boolean insert(Flat t) {
      
      boolean added=flatList.add(t);
      
      if(added){
          return true;
      }
      else{
          return false;  
      }
     
     
    }

    @Override
    public Flat update(Flat t) {
            flatList.add(t);
            return t;
    }

    @Override
    public boolean delete(Flat t) {
      boolean removed= flatList.remove(t);
   
     if(removed){
         return true;
     }
     else{
         return false;
     }
         
//    for(int i=0;i<flatList.size();i++){
//          Flat s=flatList.get(i);
//          if(s.getId()==t.getId()){
//              flatList.remove(t);
//          }
//    }
         
               
    }

    @Override
    public List<Flat> getAll() {
        if(flatList.size()==0){
             try{
FileInputStream fis = new FileInputStream(filename);
ObjectInputStream ois = new ObjectInputStream(fis);
flatList= (List<Flat>) ois.readObject();
ois.close();
if(flatList==null){
flatList=new ArrayList<Flat>();

return flatList;
}
else{
    return flatList;
}
        }
        catch(Exception e){
           flatList=new ArrayList<Flat>();
            
          return flatList;  
        }   
        }
        else{
            return flatList;
        }
      
    
    }

    @Override
    public int getMaximumid() {
     int maxId=0;
      flatList=getAll();
      if(flatList==null){
          flatList=new ArrayList<>();
      }
        System.err.println("from maximunid is"+getAll());
     if (flatList.size()==0){
          return 0;
      }
     else {
        int maxid=flatList.get(flatList.size()-1).getId();
         return maxid;
      }
     
    }

    @Override
    public List<Flat> getBySecretaryId() {
   Secretary s=SecretaryDaoImpl.sec;
  
       List<Flat> newArr=new ArrayList<>();
       
      
       
      for(Flat h:flatList){
          if(h.getSec().getId()==s.getId()){
              newArr.add(h);
         }
     }
       
    return newArr;
    }

    
    

}
