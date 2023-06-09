package com.usergio.reservascar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idClient;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String password;
    @Column(length = 250)
    private String name;
    @Column(length = 3)
    private byte age;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
    @JsonIgnoreProperties({"gama"})
    private List<MessageModel> messages;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
    @JsonIgnoreProperties({"client"})
    private List<ReservationModel> reservations;

}
