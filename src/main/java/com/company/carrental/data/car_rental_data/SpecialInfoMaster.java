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
@Table(name = "Special_Info_Master")
public class SpecialInfoMaster {

    
    private Integer specialInfoId;
    private String specialInfoName;
    
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
    @Column(name = "Special_Info_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getSpecialInfoId() {
        return specialInfoId;
    }
    public void setSpecialInfoId(Integer specialInfoId) {
        this.specialInfoId = specialInfoId;
    }
    
    @Column(name= "Special_Info_Name",nullable=false)
    public String getSpecialInfoName() {
        return specialInfoName;
    }
    public void setSpecialInfoName(String specialInfoName) {
        this.specialInfoName = specialInfoName;
    }
    
    
    
    
}
