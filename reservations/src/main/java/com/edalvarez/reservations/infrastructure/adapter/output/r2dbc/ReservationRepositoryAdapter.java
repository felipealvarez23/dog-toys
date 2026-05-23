package com.edalvarez.reservations.infrastructure.adapter.output.r2dbc;

import com.edalvarez.reservations.infrastructure.adapter.output.r2dbc.model.ReservationData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface ReservationRepositoryAdapter extends ReactiveCrudRepository<ReservationData, UUID> {
}
