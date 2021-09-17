package com.ClinicaFeliz.NetAgenda.Domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "seq_profissional", sequenceName = "seq_profissional", allocationSize = 1)
public class Profissional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profissional")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate data_nascimento;

    public Profissional (String nome, LocalDate data_nascimento){
        this.data_nascimento = data_nascimento;
        this.nome = nome;
    }
}
