package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
    
    private Integer ticketId;
    private String driverRequirementType;
    private Date scheduledStartDate;
    private Date scheduledEndDate;
    private Date actualStartDate;
    private Date actualEndDate;
    private Integer noOfDays;
    private String dutyType;
    private String vehicleType;
    private String vehicleModel;
    private Integer vehicleNumber;
    private Float dutyHours;
    private Float salary;
    private Date reportingDate;
    private Float reportingTime;
    private String contactName;
    private String ticketStatus;
    private String preferences; 
    private Float estimatedTicketCost;
    private String paymentStatus;
    
    @Id
    @Column(name = "Ticket_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getTicketId() {
        return ticketId;
    }
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }
    
    @Column(name= "Driver_Requirement_Type",nullable=false)
    public String getDriverRequirementType() {
        return driverRequirementType;
    }
    public void setDriverRequirementType(String driverRequirementType) {
        this.driverRequirementType = driverRequirementType;
    }
    
    @Column(name= "Scheduled_Start_Date",nullable=false)
    public Date getScheduledStartDate() {
        return scheduledStartDate;
    }
    public void setScheduledStartDate(Date scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }
    
    @Column(name= "Scheduled_End_Date",nullable=false)
    public Date getScheduledEndDate() {
        return scheduledEndDate;
    }
    public void setScheduledEndDate(Date scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }
    
    @Column(name= "Actual_Start_Date",nullable=false)
    public Date getActualStartDate() {
        return actualStartDate;
    }
    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
    
    @Column(name= "Actual_End_Date",nullable=false)
    public Date getActualEndDate() {
        return actualEndDate;
    }
    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }
    
    @Column(name= "No_Of_Days",nullable=false)
    public Integer getNoOfDays() {
        return noOfDays;
    }
    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }
    
    @Column(name= "Duty_Type",nullable=false)
    public String getDutyType() {
        return dutyType;
    }
    public void setDutyType(String dutyType) {
        this.dutyType = dutyType;
    }
    
    @Column(name= "Vehicle_Type",nullable=false)
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    @Column(name= "VehicleModel",nullable=false)
    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    
    @Column(name= "Vehicle_Number",nullable=false)
    public Integer getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    @Column(name= "Duty_Hours",nullable=false)
    public Float getDutyHours() {
        return dutyHours;
    }
    public void setDutyHours(Float dutyHours) {
        this.dutyHours = dutyHours;
    }
    
    @Column(name= "Salary",nullable=false)
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    
    @Column(name= "Reporting_Date",nullable=false)
    public Date getReportingDate() {
        return reportingDate;
    }
    public void setReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
    }
    
    @Column(name= "Reporting_Time",nullable=false)
    public Float getReportingTime() {
        return reportingTime;
    }
    public void setReportingTime(Float reportingTime) {
        this.reportingTime = reportingTime;
    }
    
    @Column(name= "Contact_Name",nullable=false)
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
    @Column(name= "Ticket_Status",nullable=false)
    public String getTicketStatus() {
        return ticketStatus;
    }
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
    
    @Column(name= "Preferences",nullable=false)
    public String getPreferences() {
        return preferences;
    }
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    
    @Column(name= "Estimated_Ticket_Cost",nullable=false)
    public Float getEstimatedTicketCost() {
        return estimatedTicketCost;
    }
    public void setEstimatedTicketCost(Float estimatedTicketCost) {
        this.estimatedTicketCost = estimatedTicketCost;
    }
    
    @Column(name= "Payment_Status",nullable=false)
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
    
    

}
