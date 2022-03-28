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

    @Column(name = "start_x")
    private int startX;
    @Column(name = "start_y")
    private int startY;
    @Column(name = "end_x")
    private int endX;
    @Column(name = "end_y")
    private int endY;

    public Coordinates() {
    }
}
