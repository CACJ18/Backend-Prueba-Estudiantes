package com.example.Notas.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Notas.Models.AsignaturaModel;
import com.example.Notas.Repositories.AsignaturaRepo;

@Service
public class AsignaturaService {
    
    @Autowired
    AsignaturaRepo asignaturaRepo;

    public ArrayList<AsignaturaModel> obtenerAsignatura(){
        return (ArrayList<AsignaturaModel>) asignaturaRepo.findAll();
    }

    public AsignaturaModel guardarAsignaturaModel(AsignaturaModel asignaturaModel){
        return asignaturaRepo.save(asignaturaModel);
    }

    //Obtenimos las asignaturas de un docente por Id
    public ArrayList<AsignaturaModel> findAllByTeacher(Long id){
        ArrayList<AsignaturaModel> asignaturaRespuesta = new ArrayList<>();
        ArrayList<AsignaturaModel> asignatura = (ArrayList<AsignaturaModel>) asignaturaRepo.findAll();
        for (int i=0; i<asignatura.size(); i++){
            if (asignatura.get(i).getDocenteModel().getId() == id){
                asignaturaRespuesta.add(asignatura.get(i));
            }
        }
        return asignaturaRespuesta; 
    }

    //Obtenemos las asignaturas de un estudiante por Nombre
    public ArrayList<AsignaturaModel> findAllByStudent(String nombre){
        ArrayList<AsignaturaModel> asignaturaRespuesta = new ArrayList<>();
        ArrayList<AsignaturaModel> asignatura = (ArrayList<AsignaturaModel>) asignaturaRepo.findAll();
        for(int i=0; i<asignatura.size(); i++){
            if(asignatura.get(i).getEstudianteModel().getNombres() == nombre){
                asignaturaRespuesta.add(asignatura.get(i));
            }
        }
        return asignaturaRespuesta; 
    }
}
