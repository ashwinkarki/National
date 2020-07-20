package com.npsc.file;

import com.npsc.entity.Flat;
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
public class WriteReadFileFlat {
    
    private static List<Flat> flatList=new ArrayList<>();
      private static String filename = "flat.txt";
      
     public static void writeFile(List<Flat> list){
        try {
            File file=new File(filename);
            try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(list);
                oos.close();
            }
        }catch(IOException e){e.getMessage();}
    }
     
     public static List<Flat> readFile(File file){
            try {
            try (FileInputStream fis = new FileInputStream(file);
       ObjectInputStream ois = new ObjectInputStream(fis)) {
                Flat o =(Flat) ois.readObject();
              flatList.add(o);
                ois.close();
            }
        }catch(IOException | ClassNotFoundException e){e.getMessage();}  
         System.out.println("flat is" +flatList.size());
        return flatList;
    } 
     }
     
     

