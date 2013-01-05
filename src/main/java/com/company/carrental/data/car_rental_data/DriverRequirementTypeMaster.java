package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Requirement_Type_Master")
public class DriverRequirementTypeMaster {
    
    private Integer driverRequirementTypeId;
    private String driverRequirementTypeName;
    
    @Id
    @Column(name = "Driver_Requirement_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriverRequirementTypeId() {
        return driverRequirementTypeId;
    }
    public void setDriverRequirementTypeId(Integer driverRequirementTypeId) {
        this.driverRequirementTypeId = driverRequirementTypeId;
    }
    
    @Column(name= "Driver_Requirement_Type_Name",nullable=false)
    public String getDriverRequirementTypeName() {
        return driverRequirementTypeName;
    }
    public void setDriverRequirementTypeName(String driverRequirementTypeName) {
        this.driverRequirementTypeName = driverRequirementTypeName;
    } 
    
    


}
