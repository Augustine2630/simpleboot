package com.example.simpleboot.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "traj")
@Data
@Getter
@Setter
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "end_x")
    private int endX;
    @Column(name = "end_y")
    private int endY;

    @Column(name="cart_serial")
    private int cartSerial;

    public Coordinates() {
    }
}
