package com.company.carrental.data.car_rental_data;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "User")
public class User {
  
    private Integer userId;
    private String userFName;
    private String userLName;
    private String userFullName;
    private String employeeId;
    private Integer userContactNo;
    private String emailId;
    
    
    @CollectionOfElements
    Set<Codifiers> codifiers  = new HashSet<Codifiers>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_USER_ID")
    public Set<Codifiers> getCodifiers() {
            return codifiers;
    }
    public void setCodifiers(Set<Codifiers> codifiers) {
            this.codifiers = codifiers;
    }
    
    @Id
    @Column(name = "User_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Column(name= "User_FName",nullable=false)
    public String getUserFName() {
        return userFName;
    }
    public void setUserFName(String userFName) {
        this.userFName = userFName;
    }
    
    @Column(name= "User_LName",nullable=false)
    public String getUserLName() {
        return userLName;
    }
    public void setUserLName(String userLName) {
        this.userLName = userLName;
    }
    
    @Column(name= "User_FullName",nullable=false)
    public String getUserFullName() {
        return userFullName;
    }
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
    
    @Column(name= "Employee_Id",nullable=false)
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name= "User_Contact_No",nullable=false)
    public Integer getUserContactNo() {
        return userContactNo;
    }
    public void setUserContactNo(Integer userContactNo) {
        this.userContactNo = userContactNo;
    }
    
    @Column(name= "Email_Id")
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
   
    
}
