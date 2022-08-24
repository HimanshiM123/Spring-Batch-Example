package com.bridgelabz.springbatch.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
public class Candidate {
    @Id
    private Long id;
    private String cicId;
    private String fullName;
    private String email;
    private String mobileNum;
    private String hiredDate;
    private String degree;
    private String aggregatePercentage;
    private String city;
    private String state;
    private String status;
    private String passedOutYear;
    private String candidateStatus;
    private String preferredJobLocation;

}
