package com.example.ProyectoArquitectura.models;

import jakarta.persistence.*;

import java.util.List;

@Entity //Se va a convertir en una tabla en la base de datos
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String correo;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Asignaturas> asignaturas;

    @OneToOne
    @JoinColumn(name = "despacho_id")
    private Despacho despacho;

    @ManyToMany
    @JoinTable(
            name = "profesor_proyectos",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "proyectos_id")
    )
    private List<Proyectos> proyectos;

    public Profesor() {
    }

    public Profesor(long id, String nombre, String apellido, String profesion, String correo, List<Asignaturas> asignaturas, Despacho despacho, List<Proyectos> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.correo = correo;
        this.asignaturas = asignaturas;
        this.despacho = despacho;
        this.proyectos = proyectos;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public List<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", profesion='" + profesion + '\'' +
                ", correo='" + correo + '\'' +
                ", asignaturas=" + asignaturas +
                ", despacho=" + despacho +
                ", proyectos=" + proyectos +
                '}';
    }
}
