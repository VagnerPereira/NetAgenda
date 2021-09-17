package com.ClinicaFeliz.NetAgenda.Services.Consulta;

import com.ClinicaFeliz.NetAgenda.Domain.Consulta;
import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import com.ClinicaFeliz.NetAgenda.Mappers.ConsultaMapper;
import com.ClinicaFeliz.NetAgenda.Repository.ConsultaRepository;
import com.ClinicaFeliz.NetAgenda.Repository.MedicoRepository;
import com.ClinicaFeliz.NetAgenda.Repository.PacienteRepository;
import com.ClinicaFeliz.NetAgenda.Requests.AgendaConsultaRequest;
import com.ClinicaFeliz.NetAgenda.Validators.ConsultaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaConsultaImpl implements AgendaConsultaService{

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    ConsultaValidator consultaValidator;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    ConsultaRepository consultaRepository;

    @Autowired
    ConsultaMapper consultaMapper;

    @Override
    public void AgendarConsulta(AgendaConsultaRequest agendaConsultaRequest) {
        Paciente paciente = pacienteRepository.getById(agendaConsultaRequest.getPacienteId());
        Medico medico = medicoRepository.getById(agendaConsultaRequest.getMedicoId());
        consultaValidator.CriaConsultaValidator(medico, paciente);

        Consulta consulta = consultaMapper.toDomainFromRequest(agendaConsultaRequest, medico, paciente);
        consultaRepository.save(consulta);
    }

}
