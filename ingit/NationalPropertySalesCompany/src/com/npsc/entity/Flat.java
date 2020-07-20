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
public class Flat implements Serializable {
    private int id;
    private String address;
    private int noOfRooms;
    private int sellingPrice;
    private int soldPrice;
    private int floor;
    private int monthlyCharge;
    
    private Secretary sec;

    public Secretary getSec() {
        return sec;
    }

    public void setSec(Secretary sec) {
        this.sec = sec;
    }
    
    
//    private House house;
//
//    public House getHouse() {
//        return house;
//    }
//
//    public void setHouse(House house) {
//        this.house = house;
//    }
//    
    

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getMonthlyCharge() {
        return monthlyCharge;
    }

    public void setMonthlyCharge(int monthlyCharge) {
        this.monthlyCharge = monthlyCharge;
    }

    public Flat(String address, int noOfRooms, int sellingPrice, int soldPrice, int floor, int monthlyCharge, Secretary sec) {
     
      this.address = address;
        this.noOfRooms = noOfRooms;
        this.sellingPrice = sellingPrice;
        this.soldPrice = soldPrice;
        this.floor = floor;
        this.monthlyCharge = monthlyCharge;
        this.sec = sec;
    }

    public Flat(String address, int noOfRooms, int sellingPrice, int floor, int monthlyCharge) {
        this.address = address;
        this.noOfRooms = noOfRooms;
        this.sellingPrice = sellingPrice;
        this.floor = floor;
        this.monthlyCharge = monthlyCharge;
        this.sec = sec;
    }
    
    

    @Override
    public String toString() {
        return "Flat{" + "id=" + id + ", address=" + address + ", noOfRooms=" + noOfRooms + ", sellingPrice=" + sellingPrice + ", soldPrice=" + soldPrice + ", floor=" + floor + ", monthlyCharge=" + monthlyCharge + ", sec=" + sec + '}';
    }

    public Flat(int id, String address, int noOfRooms, int sellingPrice, int soldPrice, int floor, int monthlyCharge) {
        this.id = id;
        this.address = address;
        this.noOfRooms = noOfRooms;
        this.sellingPrice = sellingPrice;
        this.soldPrice = soldPrice;
        this.floor = floor;
        this.monthlyCharge = monthlyCharge;
    }

    public Flat(int id, String address, int noOfRooms, int sellingPrice, int floor, int monthlyCharge) {
        this.id = id;
        this.address = address;
        this.noOfRooms = noOfRooms;
        this.sellingPrice = sellingPrice;
        this.floor = floor;
        this.monthlyCharge = monthlyCharge;
        
    }
    
    
    
}
