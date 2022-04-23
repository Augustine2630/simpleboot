package com.example.simpleboot.Model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Data
@Table(name = "bots")
public class MobileBot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(min = 1001, max = 9999)
    @Column(name = "cart_serial")
    private int cartSerial;

    @NotNull
    @Column(name = "department")
    private String department;


    public MobileBot() {

    }
}
