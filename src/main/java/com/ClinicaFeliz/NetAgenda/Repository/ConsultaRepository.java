package com.ClinicaFeliz.NetAgenda.Repository;

import com.ClinicaFeliz.NetAgenda.Domain.Consulta;
import com.ClinicaFeliz.NetAgenda.Domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    Consulta save (Consulta consulta);
    Consulta getById(long id);
}
