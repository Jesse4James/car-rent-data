package com.company.carrental.data.car_rental_data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Area_Preference")
public class DriverAreaPreference {
    
    private Integer driverId;
    private Integer areaId;
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


    
}
