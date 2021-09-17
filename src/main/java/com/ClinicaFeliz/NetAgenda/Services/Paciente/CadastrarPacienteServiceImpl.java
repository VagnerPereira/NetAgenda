package com.ClinicaFeliz.NetAgenda.Services.Paciente;

import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import com.ClinicaFeliz.NetAgenda.Mappers.PacienteMapper;
import com.ClinicaFeliz.NetAgenda.Repository.PacienteRepository;
import com.ClinicaFeliz.NetAgenda.Requests.CriaPacienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarPacienteServiceImpl implements CadastrarPacienteService{

    @Autowired
    PacienteMapper pacienteMapper;

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public void CadastrarPaciente(CriaPacienteRequest request) {
        Paciente paciente = pacienteMapper.toDomainFromRequest(request);
        pacienteRepository.save(paciente);
    }

}
