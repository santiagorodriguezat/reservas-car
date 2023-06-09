package com.usergio.reservascar.controller;

import com.usergio.reservascar.dbo.ReportDbo;
import com.usergio.reservascar.dbo.ReservationDbo;
import com.usergio.reservascar.dbo.ReportClientDbo;
import com.usergio.reservascar.model.MessageModel;
import com.usergio.reservascar.model.ReservationModel;
import com.usergio.reservascar.service.ReservationService;
import com.usergio.reservascar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ReservationModel> obtenerReservas(){return reservationService.obtenerReservas(); }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crearReserva(@RequestBody ReservationModel reservation) {
        reservationService.crear(reservation);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody ReservationDbo reservationDbo){
        reservationService.actualizar(reservationDbo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        reservationService.eliminar(id);
    }

    @GetMapping("/report-dates/{fechainicio}/{fechafin}")
    public List<ReservationModel> reportDate(@PathVariable String fechainicio, @PathVariable String fechafin) throws ParseException {
        return reservationService.reportDate(fechainicio,fechafin);
    }

    @GetMapping("/report-status")
    public ReportDbo reportStatus() {
        return reservationService.reportStatus();
    }

    @GetMapping("/report-clients")
    public List<ReportClientDbo> reportClients() {return clientService.reportClients(); }

}
