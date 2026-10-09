package com.clinica.dto.appointment;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public record AppointmentStatusUpdateRequestDTO(
    @NotNull(message = "O ID do novo status é obrigatório")
    UUID statusId
) {}