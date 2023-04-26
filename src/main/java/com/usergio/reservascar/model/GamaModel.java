package com.usergio.reservascar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Gamas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 45)
    private String name;
    @Column(length = 250)
    private String description;
}
