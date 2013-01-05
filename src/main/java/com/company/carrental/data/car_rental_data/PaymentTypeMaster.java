package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment_Type_Master")
public class PaymentTypeMaster {
    
    private Integer paymentTypeMasterId;
    private String paymentTypeMasterName;
    
    @Id
    @Column(name = "Payment_Type_Master_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getPaymentTypeMasterId() {
        return paymentTypeMasterId;
    }
    public void setPaymentTypeMasterId(Integer paymentTypeMasterId) {
        this.paymentTypeMasterId = paymentTypeMasterId;
    }
    
    @Column(name= "Payment_Type_Master_Name",nullable=false)
    public String getPaymentTypeMasterName() {
        return paymentTypeMasterName;
    }
    public void setPaymentTypeMasterName(String paymentTypeMasterName) {
        this.paymentTypeMasterName = paymentTypeMasterName;
    }
    
    

}
