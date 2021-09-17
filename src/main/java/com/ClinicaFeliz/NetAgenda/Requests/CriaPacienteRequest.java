package com.ClinicaFeliz.NetAgenda.Requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CriaPacienteRequest {

    @NotNull
    private String nome;

    @NotNull
    private LocalDate data_nascimento;

}
