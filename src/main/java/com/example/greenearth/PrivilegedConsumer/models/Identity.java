package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;
import java.util.Date;

public class Identity implements Serializable {
    // identity;//
    private String ssn;//
    private String alternateSsn;//
    private String idType;//DriversLicense
    private Long driversLicenseNumber;//123456789
    private Date driversLicenseExpirationDate;//2021-03-30T10;//01;//13.587Z
    private int stateIdNumber;//12345
    private Date stateIdExpirationDate;//2021-03-30T10;//01;//13.587Z
    private String profilePhotoUrl;//abcabc

    public String getSsn() {
        return ssn;
    }

    public String getAlternateSsn() {
        return alternateSsn;
    }

    public Identity(String ssn, String alternateSsn, String idType, Long driversLicenseNumber, Date driversLicenseExpirationDate, int stateIdNumber, Date stateIdExpirationDate, String profilePhotoUrl) {
        this.ssn = ssn;
        this.alternateSsn = alternateSsn;
        this.idType = idType;
        this.driversLicenseNumber = driversLicenseNumber;
        this.driversLicenseExpirationDate = driversLicenseExpirationDate;
        this.stateIdNumber = stateIdNumber;
        this.stateIdExpirationDate = stateIdExpirationDate;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public Identity() {
    }

    public String getIdType() {
        return idType;
    }

    public Long getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    public Date getDriversLicenseExpirationDate() {
        return driversLicenseExpirationDate;
    }

    public int getStateIdNumber() {
        return stateIdNumber;
    }

    public Date getStateIdExpirationDate() {
        return stateIdExpirationDate;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }
}
