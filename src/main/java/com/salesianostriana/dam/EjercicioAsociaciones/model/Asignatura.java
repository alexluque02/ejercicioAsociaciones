package com.salesianostriana.dam.EjercicioAsociaciones.model;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.SetAttribute;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Asignatura {

    @Id
    @GeneratedValue
    private int id;

    private String nombre;

    private int horas;

    private String descripcion;

    @OneToMany(mappedBy = "asignatura")
    private Set<Instrumento> instrumentos;

    @OneToMany(mappedBy = "asignatura")
    private Set<ReferenteEvaluacion> referentesEvaluacion;

    public void addInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
        instrumento.setAsignatura(this);
    }

    public void removeInstrumento(Instrumento instrumento){
        instrumentos.remove(instrumento);
        instrumento.setAsignatura(null);
    }

    public void addReferente(ReferenteEvaluacion referenteEvaluacion){
        referentesEvaluacion.add(referenteEvaluacion);
        referenteEvaluacion.setAsignatura(this);
    }

    public void removeReferente(ReferenteEvaluacion referenteEvaluacion){
        referentesEvaluacion.remove(referenteEvaluacion);
        referenteEvaluacion.setAsignatura(null);
    }
}
