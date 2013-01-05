package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_Documents_List")
public class DriverDocumentsList {
    
    private Integer documentId;
    private String documentName;
    private Boolean isMandatory;
    
    @Id
    @Column(name = "Document_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDocumentId() {
        return documentId;
    }
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }
    
    @Column(name= "Document_Name",nullable=false)
    public String getDocumentName() {
        return documentName;
    }
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
    
    @Column(name= "Is_Mandatory",nullable=false)
    public Boolean getIsMandatory() {
        return isMandatory;
    }
    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }
    
    
    
}
