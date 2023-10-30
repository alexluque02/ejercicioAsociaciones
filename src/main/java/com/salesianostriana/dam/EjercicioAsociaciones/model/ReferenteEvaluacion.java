package com.salesianostriana.dam.EjercicioAsociaciones.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class ReferenteEvaluacion {

    @Id
    @GeneratedValue
    private Long codReferente;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;
}
