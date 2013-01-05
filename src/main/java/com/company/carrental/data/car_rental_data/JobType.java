package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Job_Type")
public class JobType {
    
    private Integer jobTypeId;
    private String jobTypeName;    
    private String jobDescription;
    
    @Id
    @Column(name = "Job_Type_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getJobTypeId() {
        return jobTypeId;
    }
    public void setJobTypeId(Integer jobTypeId) {
        this.jobTypeId = jobTypeId;
    }
    
    @Column(name= "Job_Type_Name",nullable=false)
    public String getJobTypeName() {
        return jobTypeName;
    }
    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }
    
    @Column(name= "Job_Description",nullable=false)
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    
    
    

}
