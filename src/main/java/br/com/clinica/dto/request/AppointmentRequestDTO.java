package com.clinica.dto.appointment;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record AppointmentRequestDTO(
    @NotNull(message = "O ID do paciente é obrigatório")
    UUID patientId,

    @NotNull(message = "O ID do profissional é obrigatório")
    UUID professionalId,

    @NotNull(message = "A data é obrigatória")
    @FutureOrPresent(message = "A data do agendamento deve ser atual ou futura")
    LocalDate date,

    @NotNull(message = "O horário é obrigatório")
    LocalTime time,

    @NotNull(message = "O ID do status é obrigatório")
    UUID statusId,

    @Size(max = 500, message = "As observações devem ter no máximo 500 caracteres")
    String notes
) {}