/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.dao;

import java.util.List;

/**
 *
 * @author Ashwin
 */
public interface GenericDAO<T> {
    
    public boolean insert(T t);
     public T update(T t);
      public boolean delete(T t);
    public List<T> getAll();
}
