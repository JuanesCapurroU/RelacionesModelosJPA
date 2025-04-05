package com.example.ProyectoArquitectura.models;

import jakarta.persistence.*;

@Entity
public class Despacho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreDeDespacho;
    private String ubicacion;

    @OneToOne(mappedBy = "despacho")
    private Profesor profesor;

    public Despacho(long id, String nombreDeDespacho, String ubicacion, Profesor profesor) {
        this.id = id;
        this.nombreDeDespacho = nombreDeDespacho;
        this.ubicacion = ubicacion;
        this.profesor = profesor;
    }

    public Despacho() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreDeDespacho() {
        return nombreDeDespacho;
    }

    public void setNombreDeDespacho(String nombreDeDespacho) {
        this.nombreDeDespacho = nombreDeDespacho;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Despacho{" +
                "id=" + id +
                ", nombreDeDespacho='" + nombreDeDespacho + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
