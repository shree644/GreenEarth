package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;
import java.util.Date;

public class ResidenceStatus implements Serializable {
    //residenceStatus;//
    private String citizenshipStatus;
    private String employmentStatus;
    private String registeredAlienNumber;//12345
    private Date registeredAlienNumberExpirationDate;//2021-03-30T10;//01;//13.587Z
    private String workVisaNumber;//12345
    private String workVisaExpirationDate;//2021-03-30T10;//01;//13.587Z

    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public String getRegisteredAlienNumber() {
        return registeredAlienNumber;
    }

    public Date getRegisteredAlienNumberExpirationDate() {
        return registeredAlienNumberExpirationDate;
    }
    public String getWorkVisaNumber() {
        return workVisaNumber;
    }

    public String getWorkVisaExpirationDate() {
        return workVisaExpirationDate;
    }

    public ResidenceStatus(String citizenshipStatus, String employmentStatus, String registeredAlienNumber, Date registeredAlienNumberExpirationDate, String workVisaNumber, String workVisaExpirationDate) {

        this.citizenshipStatus = citizenshipStatus;
        this.employmentStatus = employmentStatus;
        this.registeredAlienNumber = registeredAlienNumber;
        this.registeredAlienNumberExpirationDate = registeredAlienNumberExpirationDate;
        this.workVisaNumber = workVisaNumber;
        this.workVisaExpirationDate = workVisaExpirationDate;
    }

    public ResidenceStatus() {
    }
}
