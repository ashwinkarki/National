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
public class Sale implements Serializable{
    
    private int id;
    private House house;
    private Secretary sec;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Secretary getSec() {
        return sec;
    }

    public void setSec(Secretary sec) {
        this.sec = sec;
    }

    public Sale(int id, House house, Secretary sec) {
        this.id = id;
        this.house = house;
        this.sec = sec;
    }

    public Sale(House house, Secretary sec) {
        this.house = house;
        this.sec = sec;
    }

    
    
    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", house=" + house + ", sec=" + sec + '}';
    }
    
    
    
}
