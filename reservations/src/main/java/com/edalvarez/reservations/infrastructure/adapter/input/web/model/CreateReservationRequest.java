package com.edalvarez.reservations.infrastructure.adapter.input.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateReservationRequest {
    private String startDate;
    private String endDate;
}
