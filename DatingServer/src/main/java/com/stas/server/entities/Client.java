package com.stas.server.entities;

import com.stas.server.enums.Gender;
import com.stas.server.enums.Hobbies;
import com.stas.server.enums.LifeStatus;

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

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "city_of_residence")
    private String cityOfResidence;

    @Column(name = "age")
    private byte age;

    @Column(name = "hobbies")
    private Hobbies hobbies;

    @Column(name="life_status")
    private LifeStatus lifeStatus;



    public Client() {
    }

    public Client(long id, User user, String name, Gender gender, String description, String cityOfResidence, byte age, Hobbies hobbies, LifeStatus lifeStatus) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.gender = gender;
        this.description = description;
        this.cityOfResidence = cityOfResidence;
        this.age = age;
        this.hobbies = hobbies;
        this.lifeStatus = lifeStatus;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }
}

