package com.company.carrental.data.car_rental_data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Drivers_Documents")
public class DriversDocuments {
    private Integer driversDocumentsId;
    private Date submissionDate;
    private String documentStatus;
    
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
    @Column(name = "Drivers_Documents_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriversDocumentsId() {
        return driversDocumentsId;
    }
    public void setDriversDocumentsId(Integer driversDocumentsId) {
        this.driversDocumentsId = driversDocumentsId;
    }
    @Column(name= "Submission_Date",nullable=false)
    public Date getSubmissionDate() {
        return submissionDate;
    }
    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
    
    @Column(name= "Document_Status",nullable=false)
    public String getDocumentStatus() {
        return documentStatus;
    }
    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }
    
    

}
