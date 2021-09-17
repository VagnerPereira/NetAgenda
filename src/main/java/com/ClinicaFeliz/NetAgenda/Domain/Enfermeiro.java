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
@DiscriminatorValue(value="Tipo1")
public class Enfermeiro extends Profissional{

    @Column(name = "identificador_enfermagem")
    private long identificador_enfermagem;
}
