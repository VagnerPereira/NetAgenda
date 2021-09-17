package com.ClinicaFeliz.NetAgenda.Services.Medico;

import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Mappers.MedicoMapper;
import com.ClinicaFeliz.NetAgenda.Repository.MedicoRepository;
import com.ClinicaFeliz.NetAgenda.Requests.CadastraMedicoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastrarMedicoServiceImpl implements CadastrarMedicoService{

    @Autowired
    MedicoMapper medicoMapper;

    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public void CadastrarMedico(CadastraMedicoRequest request) {
        Medico medico = medicoMapper.toDomainFromRequest(request);
        medicoRepository.save(medico);
    }
}
