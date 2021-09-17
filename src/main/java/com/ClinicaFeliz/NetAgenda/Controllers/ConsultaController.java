package com.ClinicaFeliz.NetAgenda.Controllers;

import com.ClinicaFeliz.NetAgenda.Requests.AgendaConsultaRequest;
import com.ClinicaFeliz.NetAgenda.Requests.RealizaConsultaRequest;
import com.ClinicaFeliz.NetAgenda.Services.Consulta.AgendaConsultaService;
import com.ClinicaFeliz.NetAgenda.Services.Consulta.RealizaConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    AgendaConsultaService agendaConsultaService;

    @Autowired
    RealizaConsultaService realizaConsultaService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void AgendaConsulta(AgendaConsultaRequest agendaConsultaRequest){
        agendaConsultaService.AgendarConsulta(agendaConsultaRequest);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void RealizaConsulta(RealizaConsultaRequest realizaConsultaRequest){
        realizaConsultaService.RealizarConsulta(realizaConsultaRequest);
    }

}
