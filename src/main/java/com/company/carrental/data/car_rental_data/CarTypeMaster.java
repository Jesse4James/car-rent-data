package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car_Type_Master")
public class CarTypeMaster {
    
    private Integer carTypeId; 
    private String carTypeName; 
    private String specification;
    
    @Id
    @Column(name = "Car_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getCarTypeId() {
        return carTypeId;
    }
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }
    
    @Column(name= "Car_Type_Name",nullable=false)
    public String getCarTypeName() {
        return carTypeName;
    }
    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }
    
    @Column(name= "Specification",nullable=false)
    public String getSpecification() {
        return specification;
    }
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    


}
