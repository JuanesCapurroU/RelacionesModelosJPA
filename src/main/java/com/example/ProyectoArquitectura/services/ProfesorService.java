package com.example.ProyectoArquitectura.services;

import com.example.ProyectoArquitectura.models.Profesor;
import com.example.ProyectoArquitectura.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired //Inyectar el repositorio para poder usarlo
    public ProfesorRepository ProfesorRepository;

    public Profesor guardar(Profesor profesor){
        return ProfesorRepository.save(profesor);

    }

    public List<Profesor> listar(){
        return ProfesorRepository.findAll();
    }

}
