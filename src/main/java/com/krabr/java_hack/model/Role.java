package com.krabr.java_hack.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@Table(name = "role")
public class Role {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(name="NAME", nullable = false)
    private String name;

    @Getter
    @Setter
    @Column(name="DESCRIPTION", nullable = false)
    private String description;

}
