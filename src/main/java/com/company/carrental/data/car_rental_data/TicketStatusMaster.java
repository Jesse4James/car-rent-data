package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Status_Master")
public class TicketStatusMaster {
    
    private Integer ticketStatusId;
    private String ticketStatusName;
    
    @Id
    @Column(name = "Ticket_Status_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getTicketStatusId() {
        return ticketStatusId;
    }
    public void setTicketStatusId(Integer ticketStatusId) {
        this.ticketStatusId = ticketStatusId;
    }
    
    @Column(name= "Ticket_Status_Name",nullable=false)
    public String getTicketStatusName() {
        return ticketStatusName;
    }
    public void setTicketStatusName(String ticketStatusName) {
        this.ticketStatusName = ticketStatusName;
    }
    
    


}
