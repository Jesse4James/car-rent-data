package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Application_Status_Master")
public class ApplicationStatusMaster {
    
    private Integer applicationStatusId;
    private String applicationStatusName;
    
    @Id
    @Column(name = "Application_Status_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getApplicationStatusId() {
        return applicationStatusId;
    }
    public void setApplicationStatusId(Integer applicationStatusId) {
        this.applicationStatusId = applicationStatusId;
    }
    
    @Column(name= "Application_Status_Name",nullable=false)
    public String getApplicationStatusName() {
        return applicationStatusName;
    }
    public void setApplicationStatusName(String applicationStatusName) {
        this.applicationStatusName = applicationStatusName;
    }
    
    


}
