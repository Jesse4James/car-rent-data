package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


import javax.persistence.ManyToOne;



@Entity
@Table(name = "Codifiers")
public class Codifiers {

    
    private Integer codifiersId;
    private String codifiersShortName;
    private String codifiersName;
   
    @ManyToOne
    User user;
    
    @ManyToOne
    @JoinColumn(name="FK_USER_ID")
    public User getUser() {
            return user;
    }
    public void setUser(User user) {
            this.user = user;
    }
    
    
    @Id
    @Column(name="Codifiers_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getCodifiersId() {
        return codifiersId;
    }
    public void setCodifiersId(Integer codifiersId) {
        this.codifiersId = codifiersId;
    }
    
    @Column(name= "Codifiers_ShortName",nullable=false)
    public String getCodifiersShortName() {
        return codifiersShortName;
    }
    public void setCodifiersShortName(String codifiersShortName) {
        this.codifiersShortName = codifiersShortName;
    }
    
    @Column(name= "Codifiers_Name",nullable=false)
    public String getCodifiersName() {
        return codifiersName;
    }
    public void setCodifiersName(String codifiersName) {
        this.codifiersName = codifiersName;
    }
    
   /* @ManyToOne
    @JoinColumn(name="FK_CATEGORYID")
    public Category getCategory() {
            return category;
    }
    public void setCategory(Category category) {
            this.category = category;
    }
    */
    
}
