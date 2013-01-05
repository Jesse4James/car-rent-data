package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address_Type_Master")
public class AddressTypeMaster {

    
    private Integer addressTypeId;
    private String addressTypeName;
    
    @Id
    @Column(name = "Address_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getAddressTypeId() {
        return addressTypeId;
    }
    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }
    
    @Column(name= "Address_Type_Name",nullable=false)
    public String getAddressTypeName() {
        return addressTypeName;
    }
    public void setAddressTypeName(String addressTypeName) {
        this.addressTypeName = addressTypeName;
    }
    
    

}
