package com.example.ProyectoArquitectura.repositories;

import com.example.ProyectoArquitectura.models.Asignaturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturasRepository extends JpaRepository<Asignaturas, Long> {
}
