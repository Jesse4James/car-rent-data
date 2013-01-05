package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Special_Info")
public class SpecialInfo {

    
    private Integer specialInfoId;
    private String specialInfoName;
    
    @Id
    @Column(name = "Special_Info_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getSpecialInfoId() {
        return specialInfoId;
    }
    public void setSpecialInfoId(Integer specialInfoId) {
        this.specialInfoId = specialInfoId;
    }
    
    @Column(name= "Special_Info_Name",nullable=false)
    public String getSpecialInfoName() {
        return specialInfoName;
    }
    public void setSpecialInfoName(String specialInfoName) {
        this.specialInfoName = specialInfoName;
    }
    
    
    
    
}
