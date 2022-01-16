package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;

public class IdentityVerification implements Serializable {
    private int pin; //123
    private SecurityQuestion securityQuestion1;
    private SecurityQuestion securityQuestion2;
    private SecurityQuestion securityQuestion3;
    private int photoId1;//123
    private int photoId2;//123

    public SecurityQuestion getSecurityQuestion1() {
        return securityQuestion1;
    }

    public SecurityQuestion getSecurityQuestion2() {
        return securityQuestion2;
    }

    public SecurityQuestion getSecurityQuestion3() {
        return securityQuestion3;
    }



    public int getPin() {
        return pin;
    }



    public int getPhotoId1() {
        return photoId1;
    }

    public int getPhotoId2() {
        return photoId2;
    }

    public IdentityVerification(int pin, SecurityQuestion securityQuestion1, SecurityQuestion securityQuestion2, SecurityQuestion securityQuestion3, int photoId1, int photoId2) {
        this.pin = pin;
        this.securityQuestion1 = securityQuestion1;
        this.securityQuestion2 = securityQuestion2;
        this.securityQuestion3 = securityQuestion3;
        this.photoId1 = photoId1;
        this.photoId2 = photoId2;
    }

    public IdentityVerification() {
    }
}
