package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Application_Status_History")
public class ApplicationStatusHistory {
    private Integer applicationStatusHistoryId;
    private Integer applicationId;
    private Integer fromStatus;
    private Integer toStatus;
    private Date date;
    private String remarks;
   
    
    @OneToOne
    @JoinColumn(name= "Application_Status_Id")
    private ApplicationStatusMaster applicationStatusMaster;
    
    @OneToOne
    @JoinColumn(name= "Driver_Id")
    private DriverMaster driverMaster;
    
    @ManyToOne
    DriverApplication driverApplication;
    
    @ManyToOne
    @JoinColumn(name="FK_Application_Id")
    public DriverApplication getDriverApplication() {
            return driverApplication;
    }
    public void setDriverApplication(DriverApplication driverApplication) {
            this.driverApplication = driverApplication;
    }
    
    @Id
    @Column(name = "Application_Status_History_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getApplicationStatusHistoryId() {
        return applicationStatusHistoryId;
    }
    public void setApplicationStatusHistoryId(Integer applicationStatusHistoryId) {
        this.applicationStatusHistoryId = applicationStatusHistoryId;
    }
    
    
    @Column(name= "Date",nullable=false)
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Column(name= "Remarks",nullable=false)
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    

}
