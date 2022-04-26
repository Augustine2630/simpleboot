package com.example.simpleboot.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "traj")
@Data
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "x")
    private int startX;
    @Column(name = "y")
    private int startY;
    @Column(name = "e_x")
    private int endX;
    @Column(name = "e_y")
    private int endY;

    @Column(name="cart_serial")
    private int cartSerial;

    public Coordinates() {
    }
}
