package com.edalvarez.reservations.infrastructure.adapter.output.r2dbc;

import com.edalvarez.reservations.domain.model.Reservation;
import com.edalvarez.reservations.domain.model.gateway.ReservationGateway;
import com.edalvarez.reservations.infrastructure.adapter.output.r2dbc.mapper.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import static com.edalvarez.reservations.infrastructure.adapter.output.r2dbc.mapper.ReservationMapper.toEntity;


@Repository
@RequiredArgsConstructor
public class ReservationAdapter implements ReservationGateway {

    private final ReservationRepositoryAdapter reactiveAdapter;

    @Override
    public Mono<Reservation> createReservation(Reservation reservation) {
        return reactiveAdapter.save(toEntity(reservation))
                .map(ReservationMapper::toDomain);
    }
}
