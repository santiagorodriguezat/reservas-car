package com.usergio.reservascar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idMessage;
    @Column(name = "text",length = 250)
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "id_car")
    @JsonIgnoreProperties({"messages","reservations"})
    private CarModel car;

    @ManyToOne
    @JoinColumn(name = "id_client")
    @JsonIgnoreProperties({"messages","reservations"})
    private ClientModel client;

}
