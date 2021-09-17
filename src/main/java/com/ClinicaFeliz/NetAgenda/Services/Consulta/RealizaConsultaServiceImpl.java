package com.ClinicaFeliz.NetAgenda.Services.Consulta;

import com.ClinicaFeliz.NetAgenda.Domain.Consulta;
import com.ClinicaFeliz.NetAgenda.Repository.ConsultaRepository;
import com.ClinicaFeliz.NetAgenda.Requests.RealizaConsultaRequest;
import com.ClinicaFeliz.NetAgenda.Validators.ConsultaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealizaConsultaServiceImpl implements RealizaConsultaService{

    @Autowired
    ConsultaRepository consultaRepository;

    @Autowired
    ConsultaValidator consultaValidator;

    @Override
    public void RealizarConsulta(RealizaConsultaRequest request) {
        Consulta consulta = consultaRepository.getById(request.getIdConsulta());
        consultaValidator.ExisteConsultaValidator(consulta);

        consulta.setConcluida(true);
        consulta.setLaudo(request.getLaudo());

        consultaRepository.save(consulta);
    }
}
