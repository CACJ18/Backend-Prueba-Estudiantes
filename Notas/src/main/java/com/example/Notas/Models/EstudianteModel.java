package com.example.Notas.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class EstudianteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(unique = true, nullable = false)
    private String nombres;
    @Column(unique = true, nullable = false)
    private String apellidos;
    @Column(unique = true, nullable = false)
    private String correo;
    @Column(unique = true, nullable = false)
    private String telefono;

    @ManyToOne
    @JoinColumn(name="asignatura_id")
    private AsignaturaModel asignaturaModel;
    @ManyToOne
    @JoinColumn(name="grado_id")
    private GradoModel gradoModel;
    @ManyToOne
    @JoinColumn(name="docente_id")
    private DocenteModel docenteModel;

    //Constructor por Default
    public EstudianteModel() {

    }

    public EstudianteModel(String nombres, String apellidos, String correo, String telefono,
     AsignaturaModel asignaturaModel, GradoModel gradoModel, DocenteModel docenteModel) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.asignaturaModel = asignaturaModel;
        this.gradoModel = gradoModel;
        this.docenteModel = docenteModel;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public AsignaturaModel getAsignaturaModel() {
        return this.asignaturaModel;
    }
    public void setAsignaturaModel(AsignaturaModel asignaturaModel) {
        this.asignaturaModel = asignaturaModel;
    }


    public GradoModel getGradoModel() {
        return this.gradoModel;
    }
    public void setGradoModel(GradoModel gradoModel) {
        this.gradoModel = gradoModel;
    }


    public DocenteModel getDocenteModel() {
        return this.docenteModel;
    }
    public void setDocenteModel(DocenteModel docenteModel) {
        this.docenteModel = docenteModel;
    }
}
