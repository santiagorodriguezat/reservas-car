package com.usergio.reservascar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Car")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private int idCar;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String brand;
    @Column(length = 5, name = "modelo")
    private int year;
    @Column(length = 250)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_gama")
    @JsonIgnoreProperties({"cars"})
    private GamaModel gama;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "car")
    @JsonIgnoreProperties({"client","car"})
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "car")
    private List<ReservationModel> reservations;
}