package com.ClinicaFeliz.NetAgenda.Requests;

import com.ClinicaFeliz.NetAgenda.Domain.Laudo;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RealizaConsultaRequest {

    @NotNull
    private long idConsulta;

    @NotNull
    private Laudo laudo;

}
