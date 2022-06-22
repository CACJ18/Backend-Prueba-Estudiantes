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
@Table(name = "docentes")
public class DocenteModel {
    
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
    @JoinColumn(name="estudiante_id")
    private EstudianteModel estudianteModel;
    //private GradoModel gradoModel;
    @ManyToOne
    @JoinColumn(name="asignatura_id")
    private AsignaturaModel asignaturaModel;

    //Contructor por Default
    public DocenteModel() {
        
    }

    public DocenteModel(String nombres, String apellidos, String correo, String telefono,
     EstudianteModel estudianteModel, AsignaturaModel asignaturaModel) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.estudianteModel = estudianteModel;
        //this.gradoModel = gradoModel;
        this.asignaturaModel = asignaturaModel;
    }


    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getNombres() {
        return this.nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getCorreo() {
        return this.correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public EstudianteModel getEstudianteModel() {
        return this.estudianteModel;
    }
    public void setEstudianteModel(EstudianteModel estudianteModel) {
        this.estudianteModel = estudianteModel;
    }


    //public GradoModel getGradoModel() {
    //    return this.gradoModel;
    //}
    //public void setGradoModel(GradoModel gradoModel) {
    //    this.gradoModel = gradoModel;
    //}


    public AsignaturaModel getAsignaturaModel() {
        return this.asignaturaModel;
    }
    public void setAsignaturaModel(AsignaturaModel asignaturaModel) {
        this.asignaturaModel = asignaturaModel;
    }
}
