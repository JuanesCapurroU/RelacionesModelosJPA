package com.example.ProyectoArquitectura.services;

import com.example.ProyectoArquitectura.models.Asignaturas;
import com.example.ProyectoArquitectura.repositories.AsignaturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturasService {

    @Autowired
    private AsignaturasRepository asignaturasRepository;

    public Asignaturas guardar(Asignaturas asignatura) {
        return asignaturasRepository.save(asignatura);
    }

    public List<Asignaturas> listar() {
        return asignaturasRepository.findAll();
    }
}
