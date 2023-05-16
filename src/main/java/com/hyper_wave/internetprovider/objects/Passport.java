package com.hyper_wave.internetprovider.objects;

import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public class Passport {
    private Integer series;
    private Integer number;
    private String issuedBy;
    private Date whenIssued;
    private String departmentCode;

}
