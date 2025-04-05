package com.example.ProyectoArquitectura.controllers;

import com.example.ProyectoArquitectura.models.Asignaturas;
import com.example.ProyectoArquitectura.services.AsignaturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturasService asignaturasService;

    @PostMapping("/guardar")
    public Asignaturas guardar(@RequestBody Asignaturas asignatura) {
        return asignaturasService.guardar(asignatura);
    }

    @GetMapping("/listar")
    public List<Asignaturas> listar() {
        return asignaturasService.listar();
    }
}
