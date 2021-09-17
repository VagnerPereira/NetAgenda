package com.ClinicaFeliz.NetAgenda.Mappers;

import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import com.ClinicaFeliz.NetAgenda.Requests.CriaPacienteRequest;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper {

    public Paciente toDomainFromRequest (CriaPacienteRequest request){
        return (Paciente.builder()
                .nome(request.getNome())
                .data_nascimento(request.getData_nascimento())
                .build());
    }

}
