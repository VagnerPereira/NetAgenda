package com.ClinicaFeliz.NetAgenda.Domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
@Entity
public class Enfermeiro extends Profissional{

    @Column(name = "identificador_enfermagem")
    private long identificador_enfermagem;
}
