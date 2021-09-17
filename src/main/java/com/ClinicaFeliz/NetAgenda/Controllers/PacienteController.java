package com.ClinicaFeliz.NetAgenda.Controllers;

import com.ClinicaFeliz.NetAgenda.Requests.CriaPacienteRequest;
import com.ClinicaFeliz.NetAgenda.Services.Paciente.CadastrarPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    CadastrarPacienteService cadastrarPacienteService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void CadastraPaciente(@RequestBody CriaPacienteRequest request) {
        cadastrarPacienteService.CadastrarPaciente(request);
    }

}
