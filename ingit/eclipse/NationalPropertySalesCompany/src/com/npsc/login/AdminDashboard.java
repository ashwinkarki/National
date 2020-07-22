package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import com.npsc.dao.SecretaryDAO;
import com.npsc.dao.impl.SecretaryDaoImpl;
import com.npsc.entity.Branch;
import com.npsc.entity.FinalTableModel;
import com.npsc.entity.Secretary;
import com.npsc.file.WriteReadFile;


public class AdminDashboard extends JFrame {
	
	private List<Secretary> secList=null;
    private Secretary sec=null;
    private SecretaryDAO secDao=new SecretaryDaoImpl();
    
    private JTable jtable1;
	private JScrollPane jScrollPane1;
	private JButton jButton1,jButton2,deleteBtn,updateBtn ; 
	  private JTextField address;
	  private JTextField email;
	  private JTextField name;
	    private JTextField password;
	    private JTextField phonenum; private JTextField username;
	    private JTextField webadd,a;
	    
	
	 final static boolean shouldFill = true;
	    final static boolean shouldWeightX = true;
	    final static boolean RIGHT_TO_LEFT = false;
 
    private static JPanel panel,subPanel1,panel2,panel3;
    
    public AdminDashboard() {
    	
    	 setSize(700,500);
    	 updateBtn = new  JButton("Update");
    	 jtable1=new JTable();
    	 phonenum = new JTextField(10);
         username = new JTextField(10);
         address = new JTextField(10);
         password = new JTextField(10);
         name =new  JTextField(10);
         webadd = new JTextField(10);
         email =new JTextField(10);
         a=new JTextField(10);
    	 jButton1 = new JButton("Add Branch");
    	 jButton2=new JButton("Exit");
    	 deleteBtn=new JButton("Delte branch");
         secList=secDao.getAll();
         if (secList !=null){
         fetch();
          }
    	 
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          add(createTopPanel(), BorderLayout.PAGE_START);
          add(createMainPanel(), BorderLayout.CENTER);
          add(createBottomPanel(), BorderLayout.PAGE_END);
          pack();
          setLocationByPlatform(true);
        //  setVisible(true);
//model initlaie finish
          
         
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel(new GridLayout(0, 2, 5, 10));
        mainPanel.add(createFormPanel());
        mainPanel.add(createTablePanel());
        return mainPanel;
    }
    
    private JPanel createFormPanel() {
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;
        gbc.insets.top = 5;
        JLabel n = new JLabel("Name");
        formPanel.add(n, gbc);

        gbc.gridx = 1;
        formPanel.add(name, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel addresss = new JLabel("Address");
        formPanel.add(addresss, gbc);

        gbc.gridx = 1;
        formPanel.add(address, gbc);
        
        //package starts
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel phoneni = new JLabel("Phone no");
        formPanel.add(phoneni, gbc);

        gbc.gridx = 1;
        formPanel.add(phonenum, gbc);
        //package ends
        
      //package starts
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel ema = new JLabel("Email");
        formPanel.add(ema, gbc);

        gbc.gridx = 1;
        formPanel.add(email, gbc);
        //package ends
        
        //package starts
        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel web = new JLabel("Web Address");
        formPanel.add(web, gbc);

        gbc.gridx = 1;
        formPanel.add(webadd, gbc);
        //package ends
        
        //package starts
        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel user = new JLabel("Username");
        formPanel.add(user, gbc);

        gbc.gridx = 1;
        formPanel.add(username, gbc);
        //package ends
        
        //package starts
        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel pw = new JLabel("password");
        formPanel.add(pw, gbc);

        gbc.gridx = 1;
        formPanel.add(password, gbc);
        //package ends


        return formPanel;
    }

    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel();
         JScrollPane js=fetch();    
        tablePanel.add(js);
        return tablePanel;
    }

    private JPanel createTopPanel() {
    	JPanel topPanel = new JPanel(new GridBagLayout());
    	 topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    	 GridBagConstraints gbc = new GridBagConstraints();
         gbc.anchor = GridBagConstraints.LINE_START;
         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.insets.bottom = 5;
         gbc.insets.left = 5;
         gbc.insets.right = 5;
         gbc.insets.top = 5;
         
         JLabel adminDs = new JLabel("Admin Dashboard");
         topPanel.add(adminDs,gbc);
         
         gbc.gridx = 0;
         gbc.gridy = 1;
         topPanel.add(jButton1,gbc);
         
         jButton1.addActionListener(new ActionListener() {

        	    @Override
        	    public void actionPerformed(ActionEvent evt) {
        	    	 jButton1ActionPerformed(evt);
        	    }
        	});
       
         gbc.gridx=0;
         gbc.gridy = 2;
         topPanel.add(deleteBtn,gbc);
                  deleteBtn.addActionListener(new ActionListener() {


         @Override     	    public void actionPerformed(ActionEvent evt) {
    	    	deleteBtnActionPerformed(evt);
    	    }
     	});
        
        return topPanel;
    }


    private JPanel createBottomPanel() {
       
        JPanel bottomPanel = new JPanel(new GridBagLayout());
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
   	 GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;
        gbc.insets.top = 5;
        
        
        bottomPanel.add(updateBtn,gbc);
        
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        bottomPanel.add(jButton2,gbc);
        
        jButton2.addActionListener(new ActionListener() {

       	    @Override
       	    public void actionPerformed(ActionEvent evt) {
       	    	 jButton2ActionPerformed(evt);
       	    }
       	});
         
        return bottomPanel;
    }

    public JScrollPane fetch(){
    	
    	jScrollPane1 = new JScrollPane();
        secDao=new SecretaryDaoImpl();
        secList=new ArrayList<>();
           secList=secDao.getAll();
     
         if (secList !=null){
             
       jtable1.setVisible(true);
    jtable1.setModel(new FinalTableModel(secList));
    jScrollPane1.setViewportView(jtable1);
    jtable1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
         }
         return jScrollPane1; 
  
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {
        setVisible(false);
        Addbranch ad=new Addbranch();
        ad.setVisible(true);
    }
    
    
    private void jButton2ActionPerformed(ActionEvent evt) {
        WriteReadFile.writeFile(secList);
        System.exit(0);
    }
    
    private void deleteBtnActionPerformed(ActionEvent evt) {
        boolean result=secDao.delete(sec);
        if(result){

            JOptionPane.showMessageDialog(null,"Deleted Successful");
            name.setText("");
            password.setText("");
            phonenum.setText("");
            username.setText("");
            webadd.setText("");
            address.setText("");
            email.setText("");
            jtable1.setModel(new FinalTableModel(SecretaryDaoImpl.secList));
        }
        else{
            JOptionPane.showMessageDialog(null,"Cannot Delete");
        }

    }
    
    protected void initDetail(int selectedRow) {
        sec = secList.get(jtable1.convertRowIndexToModel(selectedRow));
     
        name.setText(sec.getBranch().getName());
        password.setText(sec.getPassword());
        phonenum.setText(sec.getBranch().getPhonenum());
        username.setText(sec.getUserName());
        webadd.setText(sec.getBranch().getWebadd());
        address.setText(sec.getBranch().getAddress());
        email.setText(sec.getBranch().getEmail());
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
      
    	initDetail(jtable1.getSelectedRow());
    }
    
    
    private void updateBtnActionPerformed(ActionEvent evt) {
        Branch b=new Branch(address.getText(),email.getText(),name.getText(),webadd.getText(),phonenum.getText());

        Secretary s=new Secretary(sec.getId(),username.getText(),
            password.getText(),b);

        boolean result=secDao.delete(sec);

        if(result){
            secDao.insert(s);
            JOptionPane.showMessageDialog(null,"Update Successful");
            name.setText("");
            password.setText("");
            phonenum.setText("");
            username.setText("");
            webadd.setText("");
            address.setText("");
            email.setText("");
            
//            jtable1.setModel(new FinalTableModel(secList));
//            jScrollPane1.setViewportView(jtable1);
            jtable1.setModel(new FinalTableModel(SecretaryDaoImpl.secList));
        }
        else{
            JOptionPane.showMessageDialog(null,"Cannot Update");
        }

    }
    
    
    
}
