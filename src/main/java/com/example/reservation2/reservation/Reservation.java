package com.example.reservation2.reservation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private boolean done;

    public Reservation(String name) {
        this.name = name;
        this.done = false;
    }

    public Reservation() {
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
