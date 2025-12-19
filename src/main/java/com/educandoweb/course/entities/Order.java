package com.educandoweb.course.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_Order" )
public class Order implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momennt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order(){
    }

    public Order(Long id, Instant momennt, User client) {
        this.id = id;
        this.momennt = momennt;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Instant getMomennt() {
        return momennt;
    }

    public void setMomennt(Instant momennt) {
        this.momennt = momennt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
