package com.example.greenearth.PrivilegedConsumer.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrivilegedConsumer{
    @Id
    private int id;

    private NewConsumer newConsumer;

    public PrivilegedConsumer(int id, NewConsumer newConsumer) {
        this.id=id;
        this.newConsumer = newConsumer;
    }

    public PrivilegedConsumer() {

    }

    public int getId() {
        return id;
    }

    public NewConsumer getNewConsumer() {
        return newConsumer;
    }
}
