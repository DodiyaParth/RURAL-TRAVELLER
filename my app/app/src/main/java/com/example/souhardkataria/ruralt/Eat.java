package com.example.souhardkataria.ruralt;

import java.io.Serializable;

public class Eat implements Serializable {

    public Eat(){}
    int id,rating;
    String Name,Address;
    long Contact;

    public Eat(int id, int rating, String name, String address, long contact) {
        this.id = id;
        this.rating = rating;
        Name = name;
        Address = address;
        Contact = contact;
    }


}
