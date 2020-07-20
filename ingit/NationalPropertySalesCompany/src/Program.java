
import com.npsc.dao.AdminDao;
import com.npsc.dao.impl.AdminDaoImpl;
import com.npsc.entity.Administrator;
import com.npsc.login.Login;
import java.io.*; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Login().setVisible(true);
        
        Administrator adminish=new Administrator(1,"ashwin","karki");
//        
//         
//         try { 
//           FileOutputStream file = new FileOutputStream(filename); 
//            ObjectOutputStream out = new ObjectOutputStream(file); 
//            
//              out.writeObject(adm); 
//  
//            out.close(); 
//            file.close();
//         }
//         catch(Exception e){
//             e.getMessage();
//             
//         }
       
    }
    
}
