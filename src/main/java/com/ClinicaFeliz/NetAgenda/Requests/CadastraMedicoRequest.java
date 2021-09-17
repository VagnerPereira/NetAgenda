package com.ClinicaFeliz.NetAgenda.Requests;

import com.ClinicaFeliz.NetAgenda.enums.Categoria;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CadastraMedicoRequest {

    @NotNull
    private String nome;

    @NotNull
    private LocalDate data_nascimento;

    @NotNull
    private String identificado_medico;

    @NotNull
    private Categoria categoria;
}
