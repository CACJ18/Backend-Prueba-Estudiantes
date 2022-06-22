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
@Table(name = "asignaturas")
public class AsignaturaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(unique = true, nullable = false)
    private String nombre;
    @Column(unique = true, nullable = false)
    private int nota;

    @ManyToOne
    @JoinColumn(name="estudiante_id")
    private EstudianteModel estudianteModel;
    @ManyToOne
    @JoinColumn(name="docente_id")
    private DocenteModel docenteModel;
    //private GradoModel gradoModel;
    
    //Constructor por Default
    public AsignaturaModel() {
        
    }

    public AsignaturaModel(String nombre, int nota, EstudianteModel estudianteModel,
     DocenteModel docenteModel) {
        this.nombre = nombre;
        this.nota = nota;
        this.estudianteModel = estudianteModel;
        this.docenteModel = docenteModel;
        //this.gradoModel = gradoModel;
    }


    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNota() {
        return this.nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }


    public EstudianteModel getEstudianteModel() {
        return this.estudianteModel;
    }
    public void setEstudianteModel(EstudianteModel estudianteModel) {
        this.estudianteModel = estudianteModel;
    }


    public DocenteModel getDocenteModel() {
        return this.docenteModel;
    }
    public void setDocenteModel(DocenteModel docenteModel) {
        this.docenteModel = docenteModel;
    }
}
