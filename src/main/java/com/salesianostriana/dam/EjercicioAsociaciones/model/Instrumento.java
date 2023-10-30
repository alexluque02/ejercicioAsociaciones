package com.salesianostriana.dam.EjercicioAsociaciones.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Instrumento {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate fecha;

    private String nombre;

    private List<String> contenidos;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;

    @ManyToMany
    @JoinTable(name = "instrumento_referente",
    joinColumns = @JoinColumn(name = "instrumento_id"),
    inverseJoinColumns = @JoinColumn(name = "referente_id"))
    private Set<ReferenteEvaluacion> referentesEvaluacion;


}
