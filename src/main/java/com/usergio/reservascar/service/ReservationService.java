package com.usergio.reservascar.service;

import com.usergio.reservascar.dbo.ReservationDbo;
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
        if(!reservationRepository.existsById(reservation.getIdReservation())){
            reservationRepository.save(reservation);
        }
    }

    public void actualizar(ReservationDbo reservationDbo){
        if(reservationRepository.existsById(reservationDbo.getIdReservation())){
            ReservationModel message = reservationRepository.findById(reservationDbo.getIdReservation()).get();
            message.setStartDate(reservationDbo.getStartDate());
            message.setDevolutionDate(reservationDbo.getDevolutionDate());
            message.setStatus("upgated");
            reservationRepository.save(message);
        }
    }

    public void eliminar(int id){
        reservationRepository.deleteById(id);
    }
}
