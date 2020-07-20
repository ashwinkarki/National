/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.entity;

import java.io.Serializable;

/**
 *
 * @author Ashwin
 */
public class Secretary implements Serializable {
     
    private int id;
    private String userName;
    private String password;
    private Branch branch;

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Secretary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Secretary{" + "id=" + id + ", userName=" + userName + ", password=" + password + ", branch=" + branch + '}';
    }

    public Secretary(int id, String userName, String password, Branch branch) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.branch = branch;
    }
    
    
     
}
