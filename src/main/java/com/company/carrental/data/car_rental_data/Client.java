package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {

    private Integer clientId;
    private String clientFullName;
    private Integer primaryContact;
    private Date relationshipDate;
    private String emailId;
    private String clientType;
    
    @Id
    @Column(name = "Client_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getClientId() {
        return clientId;
    }
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    
    @Column(name= "Client_Full_Name",nullable=false)
    public String getClientFullName() {
        return clientFullName;
    }
    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }
    
    @Column(name= "Primary_Contact",nullable=false)
    public Integer getPrimaryContact() {
        return primaryContact;
    }
    public void setPrimaryContact(Integer primaryContact) {
        this.primaryContact = primaryContact;
    }
    
    @Column(name= "Relationship_Date",nullable=false)
    public Date getRelationshipDate() {
        return relationshipDate;
    }
    public void setRelationshipDate(Date relationshipDate) {
        this.relationshipDate = relationshipDate;
    }
    
    @Column(name= "Email_Id",nullable=false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Column(name= "Client_Type",nullable=false)
    public String getClientType() {
        return clientType;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    
    
}
