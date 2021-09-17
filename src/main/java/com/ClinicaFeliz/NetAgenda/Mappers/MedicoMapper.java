package com.ClinicaFeliz.NetAgenda.Mappers;

import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Requests.CadastraMedicoRequest;
import org.springframework.stereotype.Component;

@Component
public class MedicoMapper {

    public Medico toDomainFromRequest (CadastraMedicoRequest request){
        return (Medico.builder()
                .identificador_medico(request.getIdentificado_medico())
                .categoria(request.getCategoria())
                .data_nascimento(request.getData_nascimento())
                .nome(request.getNome())
                .build());
    }

}
