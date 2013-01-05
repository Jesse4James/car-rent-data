package com.company.carrental.data.car_rental_data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "Driver_Application")
public class DriverApplication {
    private Integer applicationId;
    private String applicationNo;
    private Date applicationDate;
    private Integer driverId;
    private Float expectedSalary;
    private Integer userId;
    private Integer applicationStatusId;
    private String applicationRemarks;
    
    
    @OneToOne
    @JoinColumn(name= "Driver_Id")
    private DriverMaster driverMaster;
    
     @OneToOne
    @JoinColumn(name= "User_Id")
    private User user;
    
     @OneToOne
    @JoinColumn(name= "Application_Status_Id")
    private ApplicationStatusMaster applicationStatusMaster;
     
     @CollectionOfElements
     Set<ApplicationStatusHistory> applicationStatusHistory  = new HashSet<ApplicationStatusHistory>();
     @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
     @JoinColumn(name="FK_Application_Id")
     public Set<ApplicationStatusHistory> getApplicationStatusHistory() {
             return applicationStatusHistory;
     }
     public void setApplicationStatusHistory(Set<ApplicationStatusHistory> applicationStatusHistory) {
             this.applicationStatusHistory = applicationStatusHistory;
     }
    
   
    
    @Id
    @Column(name = "Application_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
    
    @Column(name= "Application_No",nullable=false)
    public String getApplicationNo() {
        return applicationNo;
    }
    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }
    
    @Column(name= "Application_Date",nullable=false)
    public Date getApplicationDate() {
        return applicationDate;
    }
    
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
    
    @Column(name= "Expected_Salary",nullable=false)
    public Float getExpectedSalary() {
        return expectedSalary;
    }
    public void setExpectedSalary(Float expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
    
    @Column(name= "Application_Remarks",nullable=false)
    public String getApplicationRemarks() {
        return applicationRemarks;
    }
    public void setApplicationRemarks(String applicationRemarks) {
        this.applicationRemarks = applicationRemarks;
    }
    
    

}
