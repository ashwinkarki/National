/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao;

import com.npsc.entity.Secretary;

/**
 *
 * @author Ashwin
 */
public interface SecretaryDAO  extends GenericDAO<Secretary>{

    public int getMaximumid();

    public boolean getSec(String userName, String password);
    
}

