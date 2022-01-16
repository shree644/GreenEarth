package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;

public class ResidenceAddress implements Serializable {
    private String addressCountry;
    private String address1;//test
    private String address2;//test
    private String state;//test
    private String city;//test
    private long postalcode;//123456
    private String province;//test
    private String county;//test

    public ResidenceAddress(String addressCountry, String address1, String address2, String state, String city, long postalcode, String province, String county) {
        this.addressCountry = addressCountry;
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.city = city;
        this.postalcode = postalcode;
        this.province = province;
        this.county = county;
    }

    public ResidenceAddress() {
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public long getPostalcode() {
        return postalcode;
    }

    public String getProvince() {
        return province;
    }

    public String getCounty() {
        return county;
    }


}
