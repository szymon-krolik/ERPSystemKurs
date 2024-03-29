package com.example.skBackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOperator;
    @Column
    private String login;

    @Column
    private String password;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idEmployee")
    private Employee employee;

}
