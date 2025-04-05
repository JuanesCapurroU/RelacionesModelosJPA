package com.example.ProyectoArquitectura.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToMany(mappedBy = "proyectos")
    private List<Profesor> profesores;

    public Proyectos() {
    }

    public Proyectos(Long id, String titulo, List<Profesor> profesores) {
        this.id = id;
        this.titulo = titulo;
        this.profesores = profesores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", profesores=" + profesores +
                '}';
    }
}
