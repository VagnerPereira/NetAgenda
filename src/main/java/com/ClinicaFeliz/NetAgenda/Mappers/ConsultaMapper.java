package com.ClinicaFeliz.NetAgenda.Mappers;

import com.ClinicaFeliz.NetAgenda.Domain.Consulta;
import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import com.ClinicaFeliz.NetAgenda.Requests.AgendaConsultaRequest;
import org.springframework.stereotype.Component;

@Component
public class ConsultaMapper {
    public Consulta toDomainFromRequest(AgendaConsultaRequest agendaConsultaRequest, Medico medico, Paciente paciente){
        return (Consulta.builder()
                .data(agendaConsultaRequest.getData())
                .laudo(null)
                .medico(medico)
                .paciente(paciente)
                .isConcluida(false)
                .build());
    }
}
