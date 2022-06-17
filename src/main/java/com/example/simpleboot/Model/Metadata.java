////spring модель сущности metadata в базе данных
package com.example.simpleboot.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "metadata")
@Getter
@Setter
public class Metadata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "meta_data")
    private String hashMetadata;

    @Column(name = "cart_serial")
    private String cartSerial;

}
