package com.edalvarez.reservations.domain.usecase;

import com.edalvarez.reservations.domain.model.Reservation;
import com.edalvarez.reservations.domain.model.gateway.ReservationGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationUseCase {

    private ReservationGateway reservationGateway;

    public Mono<Reservation> createReservation(Reservation reservation) {
        return reservationGateway.createReservation(Reservation.builder()
                .createdAt(LocalDateTime.now())
                .id(UUID.randomUUID())
                .status("CREATED")
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .build());
    }

}
