package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Car_Types")
public class DriverCarTypes {

    private Integer driverId;
    private Integer carTypeId;
    private Integer duration;
    private Date from;
    private Date to;
    
    
    @OneToOne
    @JoinColumn(name= "Car_Type_Id")
    private CarTypeMaster carTypeMaster;
    
    @OneToOne
    @JoinColumn(name= "Driver_Id")
    //private DriverMaster driverMaster;
    
    @ManyToOne
    DriverMaster driverMaster;
    @Id
    @ManyToOne
    @JoinColumn(name="FK_Driver_Id")
    public DriverMaster getDriverMaster() {
            return driverMaster;
    }
    public void setDriverMaster(DriverMaster driverMaster) {
            this.driverMaster = driverMaster;
    }
    
    @Column(name= "Duration",nullable=false)
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    @Column(name= "From",nullable=false)
    public Date getFrom() {
        return from;
    }
    public void setFrom(Date from) {
        this.from = from;
    }
    
    @Column(name= "To",nullable=false)
    public Date getTo() {
        return to;
    }
    public void setTo(Date to) {
        this.to = to;
    }
    
    
    
}
