package com.example.greenearth.PrivilegedConsumer.models;


import java.io.Serializable;

public class NewConsumer implements Serializable {
    private Name name;
    private Identity identity;
    private Contact contact;
    private IdentityVerification identityVerification;
    private ResidenceStatus residenceStatus;
    private MailingAddress mailingAddress;
    private ResidenceAddress residenceAddress;
    private Demographic demographic;

    public NewConsumer(Name name, Identity identity, Contact contact, IdentityVerification identityVerification, ResidenceStatus residenceStatus, MailingAddress mailingAddress, ResidenceAddress residenceAddress, Demographic demographic) {
        this.name = name;
        this.identity = identity;
        this.contact = contact;
        this.identityVerification = identityVerification;
        this.residenceStatus = residenceStatus;
        this.mailingAddress = mailingAddress;
        this.residenceAddress = residenceAddress;
        this.demographic = demographic;
    }

    public NewConsumer() {

    }

    public Name getName() {
        return name;
    }

    public Identity getIdentity() {
        return identity;
    }

    public Contact getContact() {
        return contact;
    }

    public IdentityVerification getIdentityVerification() {
        return identityVerification;
    }

    public ResidenceStatus getResidenceStatus() {
        return residenceStatus;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public ResidenceAddress getResidenceAddress() {
        return residenceAddress;
    }

    public Demographic getDemographic() {
        return demographic;
    }
}
