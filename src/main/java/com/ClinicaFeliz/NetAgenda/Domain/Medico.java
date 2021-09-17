package com.ClinicaFeliz.NetAgenda.Domain;

import com.ClinicaFeliz.NetAgenda.enums.Categoria;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
@DiscriminatorValue(value="Tipo2")
public class Medico extends Profissional{

    @Column(name = "identificador_medico")
    private String identificador_medico;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Builder
    public Medico(String identificador_medico,
                  Categoria categoria, String nome, LocalDate data_nascimento){
        super(nome, data_nascimento);
        this.identificador_medico = identificador_medico;
        this.categoria = categoria;
    }
}
