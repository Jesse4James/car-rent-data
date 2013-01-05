package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Feedback")
public class TicketFeedback {
    private Integer ticketFeedbackId;
    private Integer ticketId;
    private Float custRatingForDriver;
    private String custRemarksForDriver;
    private Float custRatingForTrip;
    private String custRemarksForTrip;
    private String driverRemarksForCust;
    private Float driverRatingForCust;
    private String adminNotes;
    
    @Id
    @Column(name = "Ticket_Feedback_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getTicketFeedbackId() {
        return ticketFeedbackId;
    }
    public void setTicketFeedbackId(Integer ticketFeedbackId) {
        this.ticketFeedbackId = ticketFeedbackId;
    }
    
    
    @Column(name= "Cust_Remarks_For_Driver",nullable=false)
    public String getCustRemarksForDriver() {
        return custRemarksForDriver;
    }
    public void setCustRemarksForDriver(String custRemarksForDriver) {
        this.custRemarksForDriver = custRemarksForDriver;
    }
    
    @Column(name= "Cust_Rating_For_Trip",nullable=false)
    public Float getCustRatingForTrip() {
        return custRatingForTrip;
    }
    public void setCustRatingForTrip(Float custRatingForTrip) {
        this.custRatingForTrip = custRatingForTrip;
    }
    
    @Column(name= "Cust_Remarks_For_Trip",nullable=false)
    public String getCustRemarksForTrip() {
        return custRemarksForTrip;
    }
    public void setCustRemarksForTrip(String custRemarksForTrip) {
        this.custRemarksForTrip = custRemarksForTrip;
    }
    
    @Column(name= "Driver_Remarks_For_Cust",nullable=false)
    public String getDriverRemarksForCust() {
        return driverRemarksForCust;
    }
    public void setDriverRemarksForCust(String driverRemarksForCust) {
        this.driverRemarksForCust = driverRemarksForCust;
    }
    
    @Column(name= "Driver_Rating_For_Cust",nullable=false)
    public Float getDriverRatingForCust() {
        return driverRatingForCust;
    }
    public void setDriverRatingForCust(Float driverRatingForCust) {
        this.driverRatingForCust = driverRatingForCust;
    }
    
    @Column(name= "Admin_Notes",nullable=false)
    public String getAdminNotes() {
        return adminNotes;
    }
    public void setAdminNotes(String adminNotes) {
        this.adminNotes = adminNotes;
    }
    
    

}
