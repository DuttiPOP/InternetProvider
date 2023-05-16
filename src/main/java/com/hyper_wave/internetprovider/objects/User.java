package com.hyper_wave.internetprovider.objects;

import jakarta.persistence.*;

@Entity
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    @Embedded
    private Passport passport;
    @Embedded
    private Address address;

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Address getAddress() {
        return address;
    }
}
