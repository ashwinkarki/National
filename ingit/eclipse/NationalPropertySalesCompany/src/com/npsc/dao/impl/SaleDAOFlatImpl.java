/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;



import com.npsc.dao.SaleFlatDAO;
import com.npsc.dao.SalesDAO;
import static com.npsc.dao.impl.HouseDAOImpl.houseList;
import com.npsc.entity.House;
import com.npsc.entity.Sale;
import com.npsc.entity.SaleFlats;
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
public class SaleDAOFlatImpl implements SaleFlatDAO {
  public static List<SaleFlats> saleFlatList=new ArrayList<SaleFlats>();
    private  String filename = "saleFlat.txt";

     
    @Override
    public boolean insert(SaleFlats t) {
     
      boolean added=saleFlatList.add(t);
          
      if(added){
          return true;
      }
      else{
          return false;  
      }
     
     
    }

    @Override
    public SaleFlats update(SaleFlats t) {
            saleFlatList.add(t);
            return t;
    }

    @Override
    public boolean delete(SaleFlats t) {
      boolean removed= saleFlatList.remove(t);
  
     if(removed){
         return true;
     }
     else{
         return false;
     }
         
              
    }

    @Override
    public List<SaleFlats> getAll() {
        if(saleFlatList.size()==0){
             try{
FileInputStream fis = new FileInputStream(filename);
ObjectInputStream ois = new ObjectInputStream(fis);
saleFlatList= (List<SaleFlats>) ois.readObject();
ois.close();
if(saleFlatList==null){
saleFlatList=new ArrayList<SaleFlats>();

return saleFlatList;
}
else{
    return saleFlatList;
}
        }
        catch(Exception e){
           saleFlatList=new ArrayList<SaleFlats>();
          
          return saleFlatList;  
        }   
        }
        else{
            return saleFlatList;
        }
      
    
    }

    @Override
    public int getMaximumid() {
     int maxId=0;
      saleFlatList=getAll();
      if(saleFlatList==null){
          saleFlatList=new ArrayList<>();
      }
        System.err.println("from maximunid is"+getAll());
     if (saleFlatList.size()==0){
          return 0;
      }
     else {
        int maxid=saleFlatList.get(saleFlatList.size()-1).getId();
         return maxid;
      }
     
    }

    @Override
    public List<SaleFlats> getBySecretaryId() {
    
     Secretary s=SecretaryDaoImpl.sec;
       List<SaleFlats> newArr=new ArrayList<>();
      for(SaleFlats h:saleFlatList){
          if(h.getSec().getId()==s.getId()){
              newArr.add(h);
         }
     }
       
    return newArr;
        
    }

    @Override
    public List<SaleFlats> getBySecretaryIdFlat() {
         Secretary s=SecretaryDaoImpl.sec;
       List<SaleFlats> newArr=new ArrayList<>();
      for(SaleFlats h:saleFlatList){
          if(h.getSec().getId()==s.getId()){
              newArr.add(h);
         }
     }
        
    return newArr;
    
    }

    
    

}
