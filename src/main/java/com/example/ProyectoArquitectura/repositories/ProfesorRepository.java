package com.example.ProyectoArquitectura.repositories;

import com.example.ProyectoArquitectura.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {


}
