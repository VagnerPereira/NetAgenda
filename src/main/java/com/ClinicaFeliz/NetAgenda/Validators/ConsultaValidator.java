package com.ClinicaFeliz.NetAgenda.Validators;

import com.ClinicaFeliz.NetAgenda.Domain.Consulta;
import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import com.ClinicaFeliz.NetAgenda.Exceptions.ComponenteNaoEncontradoException;
import org.springframework.stereotype.Component;

@Component
public class ConsultaValidator {

    public void CriaConsultaValidator(Medico medico, Paciente paciente){
        if(paciente == null){
            throw new ComponenteNaoEncontradoException("Paciente não encontrado no banco");
        }else if(medico == null){
            throw new ComponenteNaoEncontradoException("Medico não encontrado no banco");
        }
    }

    public void ExisteConsultaValidator(Consulta consulta){
        if(consulta == null){
            throw new ComponenteNaoEncontradoException("Consulta não encontrada no banco");
        }
    }

}
