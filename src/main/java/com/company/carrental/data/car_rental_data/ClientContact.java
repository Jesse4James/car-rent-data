package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Contact")
public class ClientContact {

    private Integer clientContactId;
    private Integer clientId;
    private Integer contactTypeId;
    private Long contactNumber;
    private Character isPrimary; 
    

    @ManyToOne
    ClientMaster clientMaster;

@ManyToOne
@JoinColumn(name="FK_Client_Id")
public ClientMaster getClientMaster() {
        return clientMaster;
}
public void setClientMaster(ClientMaster clientMaster) {
        this.clientMaster = clientMaster;
}
    
    @Id
    @Column(name = "Client_Contact_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getClientContactId() {
        return clientContactId;
    }
    public void setClientContactId(Integer clientContactId) {
        this.clientContactId = clientContactId;
    }
    
    
    @Column(name= "Contact_Number",nullable=false)
    public Long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    @Column(name= "Is_sPrimary",nullable=false)
    public Character getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(Character isPrimary) {
        this.isPrimary = isPrimary;
    }
    
    
    
}
