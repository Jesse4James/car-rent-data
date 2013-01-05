package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Status_History")
public class TicketStatusHistory {

    private Integer ticketStatusHistoryId;
    private Integer ticketId; 
    private String fromStatus;
    private String toStatus;
    private Date date;
    private String remarks;
    
    @ManyToOne
    TicketMaster ticketMaster;

    @ManyToOne
    @JoinColumn(name="FK_Ticket_Id")
    public TicketMaster getTicketMaster() {
        return ticketMaster;
    }
    public void setTicketMaster(TicketMaster ticketMaster) {
        this.ticketMaster = ticketMaster;
    }

    
    
    @Id
    @Column(name = "Ticket_Status_History_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getTicketStatusHistoryId() {
        return ticketStatusHistoryId;
    }
    public void setTicketStatusHistoryId(Integer ticketStatusHistoryId) {
        this.ticketStatusHistoryId = ticketStatusHistoryId;
    }
    
    
    @Column(name= "From_Status",nullable=false)
    public String getFromStatus() {
        return fromStatus;
    }
    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }
    
    
    @Column(name= "To_Status",nullable=false)
    public String getToStatus() {
        return toStatus;
    }
    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }
    
    
    @Column(name= "get_Date",nullable=false)
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
