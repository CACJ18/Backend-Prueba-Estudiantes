package com.example.Notas.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grados")
public class GradoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @Column(unique = true, nullable = false)
    private String grado;

    //private EstudianteModel estudianteModel;
    //private DocenteModel docenteModel;
    //private AsignaturaModel asignaturaModel;

    //Constructor por Default
    public GradoModel() {
        
    }

    public GradoModel(String grado ) {
        this.grado = grado;
        //this.estudianteModel = estudianteModel;
        //this.docenteModel = docenteModel;
        //this.asignaturaModel = asignaturaModel;
    }


    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getGrado() {
        return this.grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }


    
}
