package com.clinica.dto.schedule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public record ScheduleResponseDTO(
    UUID id,
    UUID professionalId,
    String professionalName,
    LocalDate date,
    LocalTime time,
    LocalDateTime created
) {}