package com.ClinicaFeliz.NetAgenda.Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class AgendaConsultaRequest {
    @NotNull
    private long medicoId;

    @NotNull
    private long pacienteId;

    @NotNull
    private LocalDateTime data;
}
