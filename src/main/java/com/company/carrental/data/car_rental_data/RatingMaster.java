package com.company.carrental.data.car_rental_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rating_Master")
public class RatingMaster {
    
    private Integer ratingId;
    private Integer ratingValue;
    
    
    @Id
    @Column(name = "Rating_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getRatingId() {
        return ratingId;
    }
    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }
    
    @Column(name= "Rating_Value",nullable=false)
    public Integer getRatingValue() {
        return ratingValue;
    }
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }
    

}
