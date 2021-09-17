package com.ClinicaFeliz.NetAgenda.Domain;

import com.ClinicaFeliz.NetAgenda.enums.NomeExame;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
@SequenceGenerator(name = "seq_exame", sequenceName = "seq_exame", allocationSize = 1)
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_exame")
    private  long id;

    @Column(name = "exame")
    @Enumerated(EnumType.STRING)
    private NomeExame exame;

    @OneToOne
    private Profissional examinador;

    @OneToOne
    private Paciente paciente;

    @Column(name = "data")
    private LocalDateTime data;
}
