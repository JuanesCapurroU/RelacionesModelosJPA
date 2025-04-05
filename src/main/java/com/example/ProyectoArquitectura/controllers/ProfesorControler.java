package com.example.ProyectoArquitectura.controllers;

import com.example.ProyectoArquitectura.models.Profesor;
import com.example.ProyectoArquitectura.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorControler {

    @Autowired
    public ProfesorService profesorService;

    @PostMapping("/guardar")
    public Profesor guardar(@RequestBody Profesor profesor){
        return profesorService.guardar(profesor);

    }
    @GetMapping("/listar")
    public List<Profesor> listar(){
        return profesorService.listar();
    }

}
