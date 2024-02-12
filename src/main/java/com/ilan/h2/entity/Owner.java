package com.ilan.h2.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "OWNER_DETAILS")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Blog> blogList;

}
