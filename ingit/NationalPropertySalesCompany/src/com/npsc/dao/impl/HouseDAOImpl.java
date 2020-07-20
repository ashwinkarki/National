/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;


import com.npsc.dao.HouseDAO;
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
public class HouseDAOImpl implements HouseDAO {
  public static List<House> houseList=new ArrayList<House>();
    private  String filename = "house.txt";

    
    
    @Override
    public boolean insert(House t) {
        System.out.println(t);
      boolean added=houseList.add(t);
          System.out.println(houseList.size());
      if(added){
          return true;
      }
      else{
          return false;  
      }
     
     
    }

    @Override
    public House update(House t) {
        houseList.add(t);
        return t;
    }

    @Override
    public boolean delete(House t) {
      boolean removed= houseList.remove(t);
     System.out.print(removed);
     
        System.out.println("after removed"+houseList);
      if(removed){
         return true;
     }
     else{
         return false;
     }
         
//    for(int i=0;i<houseList.size();i++){
//          House s=houseList.get(i);
//          if(s.getId()==t.getId()){
//              houseList.remove(t);
//          }
//    }
         
               
    }

    @Override
    public List<House> getAll() {
        if(houseList.size()==0){
             try{
FileInputStream fis = new FileInputStream(filename);
ObjectInputStream ois = new ObjectInputStream(fis);
houseList= (List<House>) ois.readObject();
ois.close();
if(houseList==null){
houseList=new ArrayList<House>();
System.out.println("Size of houselist is"+houseList.size());
return houseList;
}
else{
    return houseList;
}
        }
        catch(Exception e){
           houseList=new ArrayList<House>();
            System.out.println("not able to read");
          return houseList;  
        }   
        }
        else{
            return houseList;
        }
      
    
    }

    @Override
    public int getMaximumid() {
     int maxId=0;
      houseList=getAll();
      if(houseList==null){
          houseList=new ArrayList<>();
      }
        System.err.println("from maximunid is"+getAll());
     if (houseList.size()==0){
          return 0;
      }
     else {
        int maxid=houseList.get(houseList.size()-1).getId();
         return maxid;
      }
     
    }

//    @Override
//    public List<House> getBySecretaryId() {
//        Secretary s=SecretaryDaoImpl.sec;
//        List<House> newArr=new ArrayList<>();
//        for(House h:houseList){
//            if(h.getSecretary().getId()==s.getId()){
//                newArr.add(h);
//            }
//        }
//        return newArr;
//    }

    @Override
    public List<House> getBySecretaryId() {
      Secretary s=SecretaryDaoImpl.sec;
       List<House> newArr=new ArrayList<>();
      for(House h:houseList){
          if(h.getSecretary().getId()==s.getId()){
              newArr.add(h);
         }
     }
        System.out.println("fileted house is"+newArr);
    return newArr;
    }

    
    

}
