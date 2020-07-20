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
public class SaleFlats implements Serializable{
    
    private int id;
    private Flat flat;
    private Secretary sec;

    public int getId() {
        return id;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    
    public void setId(int id) {
        this.id = id;
    }

   
    public Secretary getSec() {
        return sec;
    }

    public void setSec(Secretary sec) {
        this.sec = sec;
    }

    public SaleFlats(int id, Flat flat, Secretary sec) {
        this.id = id;
        this.flat = flat;
        this.sec = sec;
    }

    public SaleFlats(Flat flat, Secretary sec) {
        this.flat = flat;
        this.sec = sec;
    }

    
    
    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", house=" + flat + ", sec=" + sec + '}';
    }
    
    
    
}
