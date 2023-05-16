package com.hyper_wave.internetprovider.objects;

import java.util.Date;
import java.util.List;

public class Request {
    private Integer id;
    private Integer clientId;
    private Double price;
    private Date creationDate;
    private Date expirationDate;
    private Date paymentPeriod;
    private List<Service> services;
    private Boolean active;
    private String comment;

    public Integer getId() {
        return id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public Double getPrice() {
        return price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getPaymentPeriod() {
        return paymentPeriod;
    }

    public List<Service> getServices() {
        return services;
    }

    public Boolean getActive() {
        return active;
    }

    public String getComment() {
        return comment;
    }
}
