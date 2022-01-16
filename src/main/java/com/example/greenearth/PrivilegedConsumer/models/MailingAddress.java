package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;

public class MailingAddress implements Serializable {
    private String addressCountry;
    private String address1;//abc
    private String address2;//abc
    private String state;//test
    private String city;//test
    private Long postalcode;//12345
    private String province;//test
    private String county;//test

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

    public Long getPostalcode() {
        return postalcode;
    }

    public String getProvince() {
        return province;
    }

    public String getCounty() {
        return county;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public MailingAddress(String addressCountry, String address1, String address2, String state, String city, Long postalcode, String province, String county) {
        this.addressCountry = addressCountry;
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.city = city;
        this.postalcode = postalcode;
        this.province = province;
        this.county = county;
    }

    public MailingAddress() {
    }
}
