package com.example.greenearth.PrivilegedConsumer.models;

import java.io.Serializable;

public class Demographic implements Serializable {
    private String gender;
    private String ethnicity;//Hispanic
    private boolean handicap;//true
    private String education;//AdvancedCollegeDegree

    public Demographic(String gender, String ethnicity, boolean handicap, String education) {
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.handicap = handicap;
        this.education = education;
    }

    public Demographic() {
    }

    public String getGender() {
        return gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public String getEducation() {
        return education;
    }
}
