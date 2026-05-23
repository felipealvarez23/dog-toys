package com.edalvarez.reservations.infrastructure.adapter.input.web;

import com.edalvarez.reservations.domain.model.Reservation;
import com.edalvarez.reservations.domain.usecase.ReservationUseCase;
import com.edalvarez.reservations.infrastructure.adapter.input.web.model.CreateReservationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    private final ReservationUseCase useCase;

    @PostMapping
    public Mono<Reservation> createReservation(@RequestBody CreateReservationRequest request) {
        var reservation = Reservation.builder()
                .startDate(LocalDateTime.parse(request.getStartDate()))
                .endDate(LocalDateTime.parse(request.getEndDate()))
                .build();
        return useCase.createReservation(reservation);
    }
}
