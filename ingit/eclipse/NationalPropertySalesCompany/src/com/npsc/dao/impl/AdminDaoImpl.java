/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao.impl;

import com.npsc.dao.AdminDao;
import com.npsc.entity.Administrator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Ashwin
 */
public class AdminDaoImpl implements AdminDao {

    private  String filename = "admin.txt";
    private Administrator admin=null;
    
    @Override
    public boolean getAdmin(String username,String pw) {
             try { 
  
            // Reading the object from a file 
                 FileInputStream file = new FileInputStream 
                                         (filename); 
                 ObjectInputStream in = new ObjectInputStream 
                                         (file); 
  
            // Method for deserialization of object 
            admin = (Administrator)in.readObject(); 
  
            in.close(); 
            file.close(); 
          
            printdata(admin); 
            
            if(admin.getUserName().equals(username) && admin.getPassword().equals(pw)){
                return true;
            }
               
        } 
  
        catch (IOException ex) { 
            System.out.println("File not found secretary"); 
        } 
  
        catch (ClassNotFoundException ex) { 
        	 System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
            return false;    
    }
    
    public static void printdata(Administrator object1) 
    { 
  
      
        
    } 
  
    
}
