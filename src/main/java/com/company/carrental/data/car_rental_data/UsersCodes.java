package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UsersCodes")
public class UsersCodes {
    
    private String Code;
    
    @Id
    @Column(name= "Code",nullable=false)
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }
    
    

}
