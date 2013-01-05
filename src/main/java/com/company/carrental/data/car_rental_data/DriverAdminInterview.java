package com.company.carrental.data.car_rental_data;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Admin_Interview")
public class DriverAdminInterview {
    
    private Integer driverAdminInterviewId;
    private Integer driverId;
    private Integer userId;
    private Date scheduledDate;
    private Timestamp scheduledTime;
    private Date actualDate;
    private Timestamp actualTime;
    private String remark;
    private Integer ratingId;
    private String status;
    
    
    @Id
    @Column(name = "Driver_Admin_Interview_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriverAdminInterviewId() {
        return driverAdminInterviewId;
    }
    public void setDriverAdminInterviewId(Integer driverAdminInterviewId) {
        this.driverAdminInterviewId = driverAdminInterviewId;
    }
    
    
    @Column(name= "Scheduled_Date",nullable=false)
    public Date getScheduledDate() {
        return scheduledDate;
    }
    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }
    
    @Column(name= "Scheduled_Time",nullable=false)
    public Timestamp getScheduledTime() {
        return scheduledTime;
    }
    public void setScheduledTime(Timestamp scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
    
    @Column(name= "Actual_Date",nullable=false)
    public Date getActualDate() {
        return actualDate;
    }
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }
    
    @Column(name= "Actual_Time",nullable=false)
    public Timestamp getActualTime() {
        return actualTime;
    }
    public void setActualTime(Timestamp actualTime) {
        this.actualTime = actualTime;
    }
    
    @Column(name= "Remark",nullable=false)
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
    @Column(name= "Status",nullable=false)
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
