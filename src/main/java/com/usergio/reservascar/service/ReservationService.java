package com.usergio.reservascar.service;

import com.usergio.reservascar.model.ReservationModel;
import com.usergio.reservascar.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> obtenerReservas(){ return  reservationRepository.findAll(); }

    public void crear(ReservationModel reservation){
        if(!reservationRepository.existsById(reservation.getId())){
            reservationRepository.save(reservation);
        }
    }
}
