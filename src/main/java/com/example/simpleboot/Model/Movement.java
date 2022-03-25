package com.example.simpleboot.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movement")
@Data
public class Movement{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "start_x")
    private int startX;
    @Column(name = "start_y")
    private int startY;


    public Movement() {
    }
}
