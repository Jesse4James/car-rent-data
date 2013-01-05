package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Driver_Contact")
public class DriverContact {
    private Integer driverContactId;
    private String contactType;
    private Integer contactNumber;
    private Boolean isPrimary;
    
    @OneToOne
    @JoinColumn(name= "Contact_Type_Id")
    private ContactTypeMaster contactTypeMaster;
    
    @OneToOne
    @JoinColumn(name= "Driver_Id")
    //private DriverMaster driverMaster;
    
    
   
    @ManyToOne
    DriverMaster driverMaster;
    
    @ManyToOne
    @JoinColumn(name="FK_Driver_Id")
    public DriverMaster getDriverMaster() {
            return driverMaster;
    }
    public void setDriverMaster(DriverMaster driverMaster) {
            this.driverMaster = driverMaster;
    }
    
    @Id
    @Column(name = "Driver_Contact_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriverContactId() {
        return driverContactId;
    }
    public void setDriverContactId(Integer driverContactId) {
        this.driverContactId = driverContactId;
    }
    @Column(name= "Contact_Type",nullable=false)
    public String getContactType() {
        return contactType;
    }
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    
    @Column(name= "Contact_Number",nullable=false)
    public Integer getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    @Column(name= "Is_Primary",nullable=false)
    public Boolean getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
    
    

}
