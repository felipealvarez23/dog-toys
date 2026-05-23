package com.edalvarez.reservations.domain.model.gateway;

import com.edalvarez.reservations.domain.model.Reservation;
import reactor.core.publisher.Mono;

public interface ReservationGateway {
    Mono<Reservation> createReservation(Reservation reservation);
}
