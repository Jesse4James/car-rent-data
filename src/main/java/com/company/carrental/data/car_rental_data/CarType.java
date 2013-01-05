package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Car_Type")
public class CarType {
    
    private Boolean Hatchback;
    private Boolean Sedane;
    private Boolean SUV;
    private Boolean MUV;
    private Boolean MPV;
    private Boolean Jeep;
    private Boolean Bus;
    private Boolean Truck;
    private Boolean miniTraveller;
    
    @Column(name= "Hatchback")
    public Boolean getHatchback() {
        return Hatchback;
    }
    public void setHatchback(Boolean hatchback) {
        Hatchback = hatchback;
    }
    
    @Column(name= "Sedane")
    public Boolean getSedane() {
        return Sedane;
    }
    public void setSedane(Boolean sedane) {
        Sedane = sedane;
    }
    
    @Column(name= "SUV")
    public Boolean getSUV() {
        return SUV;
    }
    public void setSUV(Boolean sUV) {
        SUV = sUV;
    }
    
    @Column(name= "MUV")
    public Boolean getMUV() {
        return MUV;
    }
    public void setMUV(Boolean mUV) {
        MUV = mUV;
    }
    
    @Column(name= "MPV")
    public Boolean getMPV() {
        return MPV;
    }
    public void setMPV(Boolean mPV) {
        MPV = mPV;
    }
    
    @Column(name= "Jeep")
    public Boolean getJeep() {
        return Jeep;
    }
    public void setJeep(Boolean jeep) {
        Jeep = jeep;
    }
    
    @Column(name= "Bus")
    public Boolean getBus() {
        return Bus;
    }
    public void setBus(Boolean bus) {
        Bus = bus;
    }
    
    @Column(name= "Truck")
    public Boolean getTruck() {
        return Truck;
    }
    public void setTruck(Boolean truck) {
        Truck = truck;
    }
    public Boolean getMiniTraveller() {
        return miniTraveller;
    }
    public void setMiniTraveller(Boolean miniTraveller) {
        this.miniTraveller = miniTraveller;
    }
    
    
    
    
    

}
