package com.usergio.reservascar.controller;

import com.usergio.reservascar.model.ReservationModel;
import com.usergio.reservascar.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> obtenerReservas(){return reservationService.obtenerReservas(); }
    @PostMapping("/save")
    public List<ReservationModel> crearReserva(@RequestBody ReservationModel reservation) {
        reservationService.crear(reservation);
        return obtenerReservas();
    }
}
