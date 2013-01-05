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
@Table(name = "Client_Address")
public class ClientAddress {
    
    private Integer clientAddressId;
    private Integer clientId;
    private Integer addressTypeId;
    private String address;
    private Integer areaId;
    
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
    @Column(name = "Client_Address_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getClientAddressId() {
        return clientAddressId;
    }
    public void setClientAddressId(Integer clientAddressId) {
        this.clientAddressId = clientAddressId;
    }
    
    
    @Column(name= "Address",nullable=false)
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    

}
