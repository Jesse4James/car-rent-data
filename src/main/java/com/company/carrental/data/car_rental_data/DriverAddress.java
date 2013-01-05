package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Address")
public class DriverAddress {
    private Integer driverAddressId;
    private String addressType;
    private String address;
    private Integer areaId;
    
    @ManyToOne
    DriverMaster driverMaster;
    
    @ManyToOne
    @JoinColumn(name="FK_Driver_Id")
    public DriverMaster getDriverMaster() {
            return driverMaster;
    }
    public void setDriverMaster(DriverMaster driverMaster) {
            this.driverMaster = driverMaster;
    }

    @Id
    @Column(name="Driver_Address_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriverAddressId() {
        return driverAddressId;
    }
    public void setDriverAddressId(Integer driverAddressId) {
        this.driverAddressId = driverAddressId;
    }
    @Column(name= "Address_Type",nullable=false)
    public String getAddressType() {
        return addressType;
    }
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
    
    @Column(name= "Address",nullable=false)
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name= "Area_Id",nullable=false)
    public Integer getAreaId() {
        return areaId;
    }
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
    
    

}
