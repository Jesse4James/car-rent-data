package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Type_Master")
public class ClientTypeMaster {
    
    private Integer clientTypeId;
    private String clientTypeName;
    
    @Id
    @Column(name = "Client_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getClientTypeId() {
        return clientTypeId;
    }
    public void setClientTypeId(Integer clientTypeId) {
        this.clientTypeId = clientTypeId;
    }
    
    @Column(name= "Client_Type_Name",nullable=false)
    public String getClientTypeName() {
        return clientTypeName;
    }
    public void setClientTypeName(String clientTypeName) {
        this.clientTypeName = clientTypeName;
    }
    
    


}
