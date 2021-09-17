package com.ClinicaFeliz.NetAgenda.Domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@SequenceGenerator(name = "seq_consulta", sequenceName = "seq_consulta", allocationSize = 1)
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_consulta")
    private  long id;

    @OneToOne
    private Medico medico;

    @OneToOne
    private Paciente paciente;

    @Column(name = "concluida")
    private boolean isConcluida;

    @OneToOne
    private Laudo laudo;

    @Column(name = "data", columnDefinition = "TIMESTAMP")
    private LocalDateTime data;
}







