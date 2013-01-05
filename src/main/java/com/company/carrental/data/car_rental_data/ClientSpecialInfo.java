package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Special_Info")
public class ClientSpecialInfo {
    
    private Integer specialInfoId;
    private Integer clientId;
    private String infoValue;
    private String remarks;
    
    
    @Id
    @Column(name = "Special_Info_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getSpecialInfoId() {
        return specialInfoId;
    }
    public void setSpecialInfoId(Integer specialInfoId) {
        this.specialInfoId = specialInfoId;
    }
    @Column(name= "Info_Value",nullable=false)
    public String getInfoValue() {
        return infoValue;
    }
    public void setInfoValue(String infoValue) {
        this.infoValue = infoValue;
    }
    
    @Column(name= "Remarks",nullable=false)
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    

}
