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
@Table(name = "Client_Master")
public class ClientMaster {

    private Integer clientId;
    private String clientFullName;
    private Integer primaryContact;
    private Integer clientAreaId;
    private Date relationshipDate;
    private String emailId;
    private Integer clientTypeId;
    
    @OneToOne
    @JoinColumn(name= "Area_Id")
    private AreaMaster areaMaster;
    
    @OneToOne
    @JoinColumn(name= "Client_Type_Id")
    private ClientTypeMaster clientTypeMaster;
    
    @CollectionOfElements
    Set<ClientContact> clientContact  = new HashSet<ClientContact>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Client_Id")
    public Set<ClientContact> getClientContact() {
            return clientContact;
    }
    public void setClientContact(Set<ClientContact> clientContact) {
            this.clientContact = clientContact;
    }
    
    @CollectionOfElements
    Set<ClientAddress> clientAddress  = new HashSet<ClientAddress>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Client_Id")
    public Set<ClientAddress> getClientAddress() {
            return clientAddress;
    }
    public void setClientAddress(Set<ClientAddress> clientAddress) {
            this.clientAddress = clientAddress;
    }
    
    @CollectionOfElements
    Set<SpecialInfoMaster> specialInfoMaster  = new HashSet<SpecialInfoMaster>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Client_Id")
    public Set<SpecialInfoMaster> getSpecialInfoMaster() {
            return specialInfoMaster;
    }
    public void setSpecialInfoMaster(Set<SpecialInfoMaster> specialInfoMaster) {
            this.specialInfoMaster = specialInfoMaster;
    }
    
    
    
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
    
    
    
    
}
