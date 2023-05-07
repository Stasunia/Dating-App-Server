package com.stas.server.entities;

import javax.persistence.*;


@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "clientId")
    private long id;

    @MapsId
    @OneToOne(cascade = CascadeType.ALL)
    private User user;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    public Client(){

    }

    public Client(long id, User user, String name, String description) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


