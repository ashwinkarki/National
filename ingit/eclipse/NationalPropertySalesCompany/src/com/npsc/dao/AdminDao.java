/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao;

import com.npsc.entity.Administrator;

/**
 *
 * @author Ashwin
 */
public interface AdminDao {
    
    public boolean getAdmin(String username,String pw);
    
}
