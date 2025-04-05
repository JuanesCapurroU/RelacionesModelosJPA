package com.example.ProyectoArquitectura.models;

import jakarta.persistence.*;

@Entity
public class Asignaturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    public Asignaturas() {
    }

    public Asignaturas(long id, String nombre, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
