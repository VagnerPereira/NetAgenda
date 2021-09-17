package com.ClinicaFeliz.NetAgenda.Repository;

import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Medico save (Medico medico);
    Medico getById(long id);

}
