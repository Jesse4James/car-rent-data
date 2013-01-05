package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contact_Type_Master")
public class ContactTypeMaster {
    
    private Integer contactTypeId;
    private String contactTypeName;
    
    @Id
    @Column(name = "Contact_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getContactTypeId() {
        return contactTypeId;
    }
    public void setContactTypeId(Integer contactTypeId) {
        this.contactTypeId = contactTypeId;
    }
    
    @Column(name= "Contact_Type_Name",nullable=false)
    public String getContactTypeName() {
        return contactTypeName;
    }
    public void setContactTypeName(String contactTypeName) {
        this.contactTypeName = contactTypeName;
    }
    
    


}
