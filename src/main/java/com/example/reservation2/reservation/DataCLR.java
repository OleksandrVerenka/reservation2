package com.example.reservation2.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DataCLR implements CommandLineRunner {

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Mark", "Stefan", "Oleksandr")
                .forEach(s -> reservationRepository.save(new Reservation(s)));
    }
}
