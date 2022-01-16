package com.example.greenearth.PrivilegedConsumer.models;


import java.io.Serializable;

public class Name implements Serializable {

    private String firstName;//
    private String middleName;//
    private String lastName;//
    private String suffix;//

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Name() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }
}
