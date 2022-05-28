package com.example.simpleboot.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "traj")
@Getter
@Setter
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getCartSerial() {
        return cartSerial;
    }

    public void setCartSerial(int cartSerial) {
        this.cartSerial = cartSerial;
    }

    @Column(name = "end_x")
    private int endX;
    @Column(name = "end_y")
    private int endY;
    @Column(name="cart_serial")
    private int cartSerial;

    public Coordinates() {
    }
}
