package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Job_Preference")
public class DriverJobPreference {
    
    private Integer driverId;
    private Integer jobTypeId;
    private Integer preferenceOrder;
    @Id
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

    
    @Column(name= "Preference_Order",nullable=false)
    public Integer getPreferenceOrder() {
        return preferenceOrder;
    }
    public void setPreferenceOrder(Integer preferenceOrder) {
        this.preferenceOrder = preferenceOrder;
    } 
    
    

}
