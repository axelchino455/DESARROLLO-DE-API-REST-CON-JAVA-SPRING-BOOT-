package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")

public class UserModel {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firsName;
}
