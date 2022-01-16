package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;

public class Contact implements Serializable {
    private String email;//shrini@test.com
    private String primaryPhone;//1234567890
    private String alternatePhone;//1234567890
    private String notificationPreference;//SmsPrimary

    public String getEmail() {
        return email;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public String getAlternatePhone() {
        return alternatePhone;
    }

    public String getNotificationPreference() {
        return notificationPreference;
    }

    public Contact(String email, String primaryPhone, String alternatePhone, String notificationPreference) {
        this.email = email;
        this.primaryPhone = primaryPhone;
        this.alternatePhone = alternatePhone;
        this.notificationPreference = notificationPreference;
    }

    public Contact() {
    }
}
