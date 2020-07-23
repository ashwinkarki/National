package com.npsc.file;

import com.npsc.entity.Sale;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwin
 */
public class WriteReadFileSale {
    
    private static List<Sale> saleList=new ArrayList<>();
      private static String filename = "sale.txt";
      
     public static void writeFile(List<Sale> list){
        try {
            File file=new File(filename);
            try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(list);
                oos.close();
            }
        }catch(IOException e){e.getMessage();}
    }
     
     public static List<Sale> readFile(File file){
            try {
            try (FileInputStream fis = new FileInputStream(file);
       ObjectInputStream ois = new ObjectInputStream(fis)) {
                Sale o =(Sale) ois.readObject();
              saleList.add(o);
                ois.close();
            }
        }catch(IOException | ClassNotFoundException e){e.getMessage();}  
         
        return saleList;
    } 
     }
     
     

