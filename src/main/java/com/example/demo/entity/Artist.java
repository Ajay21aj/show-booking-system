package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="shows")
public class Artist {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column(name ="price")
    private int price ;
    @Column(name ="name")
    private String name;
    @Column(name ="time")
    private String time;
    @Column(name ="seats")
    private int seats;


    // define getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
// define constructor

    public Artist() {

    }

    public Artist(int id,int price,int seats,String name,String time){
        this.id=id;
        this.price=price;
        this.name=name;
        this.time = time;
        this.seats = seats;
    }


    // define toString


    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", seats=" + seats +
                '}';
    }
}
