package com.ClinicaFeliz.NetAgenda.Repository;

import com.ClinicaFeliz.NetAgenda.Domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente save (Paciente paciente);
    Paciente getById(long id);
}
