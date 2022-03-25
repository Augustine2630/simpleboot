package com.example.simpleboot.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bots")
public class MobileBot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cart_serial")
    private int cartSerial;

    @Column(name = "department")
    private String department;


}
