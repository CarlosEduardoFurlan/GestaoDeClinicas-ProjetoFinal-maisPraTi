package com.clinica.dto.schedule;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record ScheduleRequestDTO(
    @NotNull(message = "O ID do profissional é obrigatório")
    UUID professionalId,

    @NotNull(message = "A data é obrigatória")
    @FutureOrPresent(message = "A data do horário deve ser atual ou futura")
    LocalDate date,

    @NotNull(message = "O horário é obrigatório")
    LocalTime time
) {}