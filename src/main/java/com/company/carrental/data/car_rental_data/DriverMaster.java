package com.company.carrental.data.car_rental_data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "Driver_Master")
public class DriverMaster {

    private Integer driverId;
    private String driverFullName;
    private Character gender;
    private Date DOB;
    private Float totalExperience;
    private Integer pimaryContactNumber;
    private Integer currentAreaId;
    private String licenceNo;
    private String licenceType;
    private Date licenceExpiryDate;
    private Boolean jobPrefIndividual;
    private Boolean jobPrefCorporate;
    private Boolean jobPrefTemporary;
    private Boolean jobPrefPermanent;
    private Boolean jobPrefAdhoc;
    private Boolean carTypeAutomatic;
    private Boolean carTypeManual;
    private Integer ratingId;
    private String refereceName;
    private Integer referenceNumber;
    private String medicalHistory;
    private String accidentHistory;
    
    @OneToOne
    @JoinColumn(name= "Area_Id")
    private AreaMaster areaMaster;
    
    @OneToOne
    @JoinColumn(name= "Rating_Id")
    private RatingMaster ratingMaster;
    
    @CollectionOfElements
    Set<DriverCarTypes> driverCarTypes  = new HashSet<DriverCarTypes>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverCarTypes> getDriverCarTypes() {
            return driverCarTypes;
    }
    public void setDriverCarTypes(Set<DriverCarTypes> driverCarTypes) {
            this.driverCarTypes = driverCarTypes;
    }
    
    @CollectionOfElements
    Set<DriverContact> driverContact  = new HashSet<DriverContact>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverContact> getDriverContact() {
            return driverContact;
    }
    public void setDriverContact(Set<DriverContact> driverContact) {
            this.driverContact = driverContact;
    }
    
    @CollectionOfElements
    Set<DriverAddress> driverAddress  = new HashSet<DriverAddress>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverAddress> getDriverAddress() {
            return driverAddress;
    }
    public void setDriverAddress(Set<DriverAddress> driverAddress) {
            this.driverAddress = driverAddress;
    }
    
    @CollectionOfElements
    Set<DriverEducation> driverEducation  = new HashSet<DriverEducation>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverEducation> getDriverEducation() {
            return driverEducation;
    }
    public void setDriverEducation(Set<DriverEducation> driverEducation) {
            this.driverEducation = driverEducation;
    }
    
    @CollectionOfElements
    Set<DriverEmployment> driverEmployment  = new HashSet<DriverEmployment>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverEmployment> getDriverEmployment() {
            return driverEmployment;
    }
    public void setDriverEmployment(Set<DriverEmployment> driverEmployment) {
            this.driverEmployment = driverEmployment;
    }
    
    @CollectionOfElements
    Set<DriverBackgroundCheck> driverBackgroundCheck  = new HashSet<DriverBackgroundCheck>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverBackgroundCheck> getDriverBackgroundCheck() {
            return driverBackgroundCheck;
    }
    public void setDriverBackgroundCheck(Set<DriverBackgroundCheck> driverBackgroundCheck) {
            this.driverBackgroundCheck = driverBackgroundCheck;
    }
    
    @CollectionOfElements
    Set<DriversDocuments> driversDocuments  = new HashSet<DriversDocuments>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriversDocuments> getDriversDocuments() {
            return driversDocuments;
    }
    public void setDriversDocuments(Set<DriversDocuments> driversDocuments) {
            this.driversDocuments = driversDocuments;
    }
    
    @CollectionOfElements
    Set<DriverAreaPreference> driverAreaPreference  = new HashSet<DriverAreaPreference>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverAreaPreference> getDriverAreaPreference() {
            return driverAreaPreference;
    }
    public void setDriverAreaPreference(Set<DriverAreaPreference> driverAreaPreference) {
            this.driverAreaPreference = driverAreaPreference;
    }
    
    @CollectionOfElements
    Set<DriverJobPreference> driverJobPreference  = new HashSet<DriverJobPreference>();
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="FK_Driver_Id")
    public Set<DriverJobPreference> getDriverJobPreference() {
            return driverJobPreference;
    }
    public void setDriverJobPreference(Set<DriverJobPreference> driverJobPreference) {
            this.driverJobPreference = driverJobPreference;
    }
    

    @Id
    @Column(name = "Driver_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    
    @Column(name= "Driver_Full_Name",nullable=false)
    public String getDriverFullName() {
        return driverFullName;
    }

    public void setDriverFullName(String driverFullName) {
        this.driverFullName = driverFullName;
    }

    @Column(name= "Gender",nullable=false)
    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Column(name= "DOB",nullable=false)
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date dOB) {
        DOB = dOB;
    }

    @Column(name= "Total_Experience",nullable=true)
    public Float getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(Float totalExperience) {
        this.totalExperience = totalExperience;
    }

    @Column(name= "Primary_Contact_Number",nullable=false)
    public Integer getPimaryContactNumber() {
        return pimaryContactNumber;
    }

    public void setPimaryContactNumber(Integer pimaryContactNumber) {
        this.pimaryContactNumber = pimaryContactNumber;
    }

  
    @Column(name= "Licence_No",nullable=false)
    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    @Column(name= "Licence_Type",nullable=false)
    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    @Column(name= "Licence_Expiry_Date",nullable=false)
    public Date getLicenceExpiryDate() {
        return licenceExpiryDate;
    }

    public void setLicenceExpiryDate(Date licenceExpiryDate) {
        this.licenceExpiryDate = licenceExpiryDate;
    }

    @Column(name= "Job_Pref_Individual",nullable=false)
    public Boolean getJobPrefIndividual() {
        return jobPrefIndividual;
    }

    public void setJobPrefIndividual(Boolean jobPrefIndividual) {
        this.jobPrefIndividual = jobPrefIndividual;
    }

    @Column(name= "Job_Pref_Corporate",nullable=false)
    public Boolean getJobPrefCorporate() {
        return jobPrefCorporate;
    }

    public void setJobPrefCorporate(Boolean jobPrefCorporate) {
        this.jobPrefCorporate = jobPrefCorporate;
    }

    @Column(name= "Job_Pref_Temporary",nullable=false)
    public Boolean getJobPrefTemporary() {
        return jobPrefTemporary;
    }

    public void setJobPrefTemporary(Boolean jobPrefTemporary) {
        this.jobPrefTemporary = jobPrefTemporary;
    }

    @Column(name= "Job_Pref_Permanent",nullable=false)
    public Boolean getJobPrefPermanent() {
        return jobPrefPermanent;
    }

    public void setJobPrefPermanent(Boolean jobPrefPermanent) {
        this.jobPrefPermanent = jobPrefPermanent;
    }

    @Column(name= "Job_Pref_Adhoc",nullable=false)
    public Boolean getJobPrefAdhoc() {
        return jobPrefAdhoc;
    }

    public void setJobPrefAdhoc(Boolean jobPrefAdhoc) {
        this.jobPrefAdhoc = jobPrefAdhoc;
    }

    @Column(name= "Car_Type_Automatic",nullable=false)
    public Boolean getCarTypeAutomatic() {
        return carTypeAutomatic;
    }

    public void setCarTypeAutomatic(Boolean carTypeAutomatic) {
        this.carTypeAutomatic = carTypeAutomatic;
    }

    @Column(name= "Car_Type_Manual",nullable=false)
    public Boolean getCarTypeManual() {
        return carTypeManual;
    }

    public void setCarTypeManual(Boolean carTypeManual) {
        this.carTypeManual = carTypeManual;
    }
    
    
    @Column(name= "Reference_Name",nullable=true)
    public String getRefereceName() {
        return refereceName;
    }

    public void setRefereceName(String refereceName) {
        this.refereceName = refereceName;
    }

    @Column(name= "Reference_Number",nullable=true)
    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Column(name= "Medical_History",nullable=true)
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Column(name= "Accident_History",nullable=false)
    public String getAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(String accidentHistory) {
        this.accidentHistory = accidentHistory;
    }

       // Category category;

    // Set<Ingredient> ingredients = new HashSet<Ingredient>();

    // @ManyToMany
    // @JoinTable(name="PRODUCT_INGREDIENTS",
    // joinColumns=@JoinColumn(name="FK_PRODUCTID"),
    // inverseJoinColumns=@JoinColumn(name="FK_INGREDIENTID")
    // )
    // public Set<Ingredient> getIngredients() {
    // return ingredients;
    // }
    // public void setIngredients(Set<Ingredient> ingredients) {
    // this.ingredients = ingredients;
    // }
    //
    //
    // @ManyToOne
    // @JoinColumn(name="FK_CATEGORYID")
    // public Category getCategory() {
    // return category;
    // }
    // public void setCategory(Category category) {
    // this.category = category;
    // }

    // @Id
    // @Column(name="Driver_Id")
    // @GeneratedValue(strategy=GenerationType.AUTO)
    // public int getProductId() {
    // return productId;
    // }
    // public void setProductId(int productId) {
    // this.productId = productId;
    // }
    //
    // @Column(length=15,nullable=false)
    // public String getName() {
    // return name;
    // }
    // public void setName(String name) {
    // this.name = name;
    // }
    //
    // @Transient
    // public double getUnitPrice() {
    // return unitPrice;
    // }
    // public void setUnitPrice(double unitPrice) {
    // this.unitPrice = unitPrice;
    // }

}
