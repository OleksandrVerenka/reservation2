package com.example.reservation2.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    @GetMapping("/reservations/done/{id}")
    public Reservation getAllReservations(@PathVariable("id") Long id){
        Reservation reservation = reservationRepository.findById(id).get();
        reservation.setDone(true);
        reservationRepository.save(reservation);
        return reservation;
    }
}
