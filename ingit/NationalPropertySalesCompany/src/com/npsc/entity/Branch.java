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
public class Branch implements Serializable{
   private  String address;
 private String  email;
 private  String  name;
  private String webadd;
 private  String phonenum;

    public Branch(String address, String email, String name, String webadd, String phonenum) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.webadd = webadd;
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebadd() {
        return webadd;
    }

    public void setWebadd(String webadd) {
        this.webadd = webadd;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "Branch{" + "address=" + address + ", email=" + email + ", name=" + name + ", webadd=" + webadd + ", phonenum=" + phonenum + '}';
    }
    
    
 
 
}
