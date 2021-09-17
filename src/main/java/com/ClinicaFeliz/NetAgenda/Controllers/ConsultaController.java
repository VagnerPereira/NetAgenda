package com.ClinicaFeliz.NetAgenda.Controllers;

import com.ClinicaFeliz.NetAgenda.Requests.AgendaConsultaRequest;
import com.ClinicaFeliz.NetAgenda.Services.Consulta.AgendaConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    AgendaConsultaService agendaConsultaService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void AgendaConsulta(AgendaConsultaRequest agendaConsultaRequest){
        agendaConsultaService.AgendarConsulta(agendaConsultaRequest);
    }

}
