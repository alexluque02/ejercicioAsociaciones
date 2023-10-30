package com.salesianostriana.dam.EjercicioAsociaciones.repository;

import com.salesianostriana.dam.EjercicioAsociaciones.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Long, Alumno> {
}
