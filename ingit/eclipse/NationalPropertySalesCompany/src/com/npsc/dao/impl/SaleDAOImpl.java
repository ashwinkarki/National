/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;



import com.npsc.dao.SalesDAO;
import static com.npsc.dao.impl.HouseDAOImpl.houseList;
import com.npsc.entity.House;
import com.npsc.entity.Sale;
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
public class SaleDAOImpl implements SalesDAO {
  public static List<Sale> saleList=new ArrayList<Sale>();
    private  String filename = "sale.txt";

    
    
    @Override
    public boolean insert(Sale t) {
     
      boolean added=saleList.add(t);
       
      if(added){
          return true;
      }
      else{
          return false;  
      }
     
     
    }

    @Override
    public Sale update(Sale t) {
            saleList.add(t);
            return t;
    }

    @Override
    public boolean delete(Sale t) {
      boolean removed= saleList.remove(t);
     
     if(removed){
         return true;
     }
     else{
         return false;
     }
         
//    for(int i=0;i<saleList.size();i++){
//          Sale s=saleList.get(i);
//          if(s.getId()==t.getId()){
//              saleList.remove(t);
//          }
//    }
         
               
    }

    @Override
    public List<Sale> getAll() {
        if(saleList.size()==0){
             try{
FileInputStream fis = new FileInputStream(filename);
ObjectInputStream ois = new ObjectInputStream(fis);
saleList= (List<Sale>) ois.readObject();
ois.close();
if(saleList==null){
saleList=new ArrayList<Sale>();

return saleList;
}
else{
    return saleList;
}
        }
        catch(Exception e){
           saleList=new ArrayList<Sale>();
            
          return saleList;  
        }   
        }
        else{
            return saleList;
        }
      
    
    }

    @Override
    public int getMaximumid() {
     int maxId=0;
      saleList=getAll();
      if(saleList==null){
          saleList=new ArrayList<>();
      }
        System.err.println("from maximunid is"+getAll());
     if (saleList.size()==0){
          return 0;
      }
     else {
        int maxid=saleList.get(saleList.size()-1).getId();
         return maxid;
      }
     
    }

    @Override
    public List<Sale> getBySecretaryId() {
    
     Secretary s=SecretaryDaoImpl.sec;
       List<Sale> newArr=new ArrayList<>();
      for(Sale h:saleList){
          if(h.getSec().getId()==s.getId()){
              newArr.add(h);
         }
     }
        
    return newArr;
        
    }

    @Override
    public List<Sale> getBySecretaryIdFlat() {
         Secretary s=SecretaryDaoImpl.sec;
       List<Sale> newArr=new ArrayList<>();
      for(Sale h:saleList){
          if(h.getSec().getId()==s.getId()){
              newArr.add(h);
         }
     }
      
    return newArr;
    
    }

    
    

}
