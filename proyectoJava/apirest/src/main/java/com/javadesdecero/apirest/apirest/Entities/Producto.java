package com.javadesdecero.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


}
