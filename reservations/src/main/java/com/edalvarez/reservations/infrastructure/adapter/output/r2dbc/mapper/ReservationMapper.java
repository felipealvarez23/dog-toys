package com.edalvarez.reservations.infrastructure.adapter.output.r2dbc.mapper;

import com.edalvarez.reservations.domain.model.Reservation;
import com.edalvarez.reservations.infrastructure.adapter.output.r2dbc.model.ReservationData;

import java.time.LocalDateTime;

public class ReservationMapper {

    public static ReservationData toEntity(Reservation reservation) {
        return ReservationData.builder()
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .status(reservation.getStatus())
                .build();
    }

    public static Reservation toDomain(ReservationData reservation) {
        return Reservation.builder()
                .id(reservation.getId())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .createdAt(reservation.getCreatedAt())
                .updatedAt(reservation.getUpdatedAt())
                .status(reservation.getStatus())
                .build();
    }
}
