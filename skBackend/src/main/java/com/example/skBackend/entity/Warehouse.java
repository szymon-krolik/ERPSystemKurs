package com.example.skBackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWareHouse;

    @Column
    private String name;

    @ManyToMany(mappedBy = "warehouse")
    Set<Item> items;
}
