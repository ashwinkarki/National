/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.npsc.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ashwin
 */
public class House implements Serializable{
    
    private int id;
    private String address;
    private int rooms;
    private int sellingPrice;
    private int soldPrice;
    private int noOfFloors;
    private boolean garden;
    private boolean garage;
    
    private Secretary secretary;

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
    
    
   

    public int getId() {
        return id;
    }

   
    
    

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

   


 

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(int soldPrice) {
        this.soldPrice = soldPrice;
    }

   
    public House() {
    }

    public House(String address, int rooms, int sellingPrice, int soldPrice, int noOfFloors, boolean garden, boolean garage) {
        
        this.address = address;
        this.rooms = rooms;
        this.sellingPrice = sellingPrice;
        this.soldPrice = soldPrice;
        this.noOfFloors = noOfFloors;
      
        this.garden = garden;
        this.garage = garage;
       
    }

    public House(String address, int rooms, int sellingPrice, int noOfFloors, boolean garden, boolean garage) {
       
        this.address = address;
        this.rooms = rooms;
        this.sellingPrice = sellingPrice;
        this.noOfFloors = noOfFloors;
        this.garden = garden;
        this.garage = garage;
    }

    public House(int id, String address, int rooms, int sellingPrice, int noOfFloors, boolean garden, boolean garage,Secretary sec) {
        this.id = id;
        this.address = address;
        this.rooms = rooms;
        this.sellingPrice = sellingPrice;
        this.noOfFloors = noOfFloors;
        this.garden = garden;
        this.garage = garage;
        this.secretary=sec;
    }
    
    
    
    

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", address=" + address + ", rooms=" + rooms + ", sellingPrice=" + sellingPrice + ", soldPrice=" + soldPrice + ", noOfFloors=" + noOfFloors + ", garden=" + garden + ", garage=" + garage + ", secretary=" + secretary + '}';
    }

    public House(int id, String address, int rooms, int sellingPrice, int soldPrice, int noOfFloors, boolean garden, boolean garage, Secretary secretary) {
        this.id = id;
        this.address = address;
        this.rooms = rooms;
        this.sellingPrice = sellingPrice;
        this.soldPrice = soldPrice;
        this.noOfFloors = noOfFloors;
        this.garden = garden;
        this.garage = garage;
        this.secretary = secretary;
    }

    
   
    
    
}
