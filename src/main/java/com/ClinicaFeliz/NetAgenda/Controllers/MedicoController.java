package com.ClinicaFeliz.NetAgenda.Controllers;

import com.ClinicaFeliz.NetAgenda.Requests.CadastraMedicoRequest;
import com.ClinicaFeliz.NetAgenda.Services.Medico.CadastrarMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    CadastrarMedicoService cadastrarMedicoService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void CadastraMedico (@RequestBody CadastraMedicoRequest request) {
        cadastrarMedicoService.CadastrarMedico(request);
    }
}
