package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Area_List")
public class AreaList {

    
    private Integer areaId;
    private String areaName;
    private Integer pinCode;
    private String nearestArea1;
    private String nearestArea2;
    private String nearestArea3;
    
    @Id
    @Column(name = "Area_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getAreaId() {
        return areaId;
    }
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
    
    @Column(name= "Area_Name",nullable=false)
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    
    @Column(name= "Pin_Code",nullable=false)
    public Integer getPinCode() {
        return pinCode;
    }
    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
    
    @Column(name= "Nearest_Area1",nullable=false)
    public String getNearestArea1() {
        return nearestArea1;
    }
    public void setNearestArea1(String nearestArea1) {
        this.nearestArea1 = nearestArea1;
    }
    
    @Column(name= "Nearest_Area2",nullable=false)
    public String getNearestArea2() {
        return nearestArea2;
    }
    public void setNearestArea2(String nearestArea2) {
        this.nearestArea2 = nearestArea2;
    }
    
    @Column(name= "Nearest_Area3",nullable=false)
    public String getNearestArea3() {
        return nearestArea3;
    }
    public void setNearestArea3(String nearestArea3) {
        this.nearestArea3 = nearestArea3;
    }
    
    
}
