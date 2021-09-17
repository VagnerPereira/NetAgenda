package com.ClinicaFeliz.NetAgenda.Domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
@SequenceGenerator(name = "seq_laudo", sequenceName = "seq_laudo", allocationSize = 1)
public class Laudo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_laudo")
    private long Id;

    @Column(name = "nome")
    private String descricao;
}
