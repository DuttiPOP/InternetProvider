package com.hyper_wave.internetprovider.objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String country;
    private String city;
    private String region;
    private String street;
    private String house;
    private String apartment;
    private String Zip;

}
