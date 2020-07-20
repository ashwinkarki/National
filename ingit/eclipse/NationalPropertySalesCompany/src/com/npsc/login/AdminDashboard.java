package com.npsc.login;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class AdminDashboard extends JFrame {
	
	 final static boolean shouldFill = true;
	    final static boolean shouldWeightX = true;
	    final static boolean RIGHT_TO_LEFT = false;
 
    private static JPanel panel,subPanel1,panel2,panel3;
    
    public AdminDashboard() {
    	
    	 
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          add(createTopPanel(), BorderLayout.PAGE_START);
          add(createMainPanel(), BorderLayout.CENTER);
          add(createBottomPanel(), BorderLayout.PAGE_END);
          pack();
          setLocationByPlatform(true);
          setVisible(true);

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
        JLabel userLabel = new JLabel("User");
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        JTextField userTextField = new JTextField(6);
        formPanel.add(userTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwordLabel = new JLabel("Password");
        formPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(6);
        formPanel.add(passwordField, gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton loginButton = new JButton("login");
        formPanel.add(loginButton, gbc);

        gbc.gridx = 1;
        JButton registerButton = new JButton("register");
        formPanel.add(registerButton, gbc);

        return formPanel;
    }

    private JPanel createTablePanel() {
        JPanel tablePanel = new JPanel();
        JLabel hello55 = new JLabel("Hello55");
        tablePanel.add(hello55);
        return tablePanel;
    }

    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel();
        JLabel hello11 = new JLabel("hello11");
        topPanel.add(hello11);
        return topPanel;
    }


    private JPanel createBottomPanel() {
        JPanel bottomPanel = new JPanel();
        JLabel hello33 = new JLabel("hello33");
        bottomPanel.add(hello33);
        return bottomPanel;
    }

  
}
