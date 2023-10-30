package com.salesianostriana.dam.EjercicioAsociaciones.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre, apellidos, email, telefono;
    private LocalDate fechaNacimiento;

    @ManyToMany
    @JoinTable(name = "alumno_asignatura",
    joinColumns = @JoinColumn(name = "alumno_id"),
    inverseJoinColumns = @JoinColumn(name = "asignatura_id"))
    private Set<Asignatura> asignaturas;

    @OneToMany(mappedBy = "alumno")
    private Set<Calificacion> calificaciones;

    public void addCalificacion(Calificacion calificacion){
        calificaciones.add(calificacion);
        calificacion.setAlumno(this);
    }

    public void removeCalificacion(Calificacion calificacion){
        calificaciones.remove(calificacion);
        calificacion.setAlumno(null);
    }
}
