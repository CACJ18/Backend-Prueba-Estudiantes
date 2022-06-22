package com.example.Notas.Services;

import java.util.ArrayList;

import com.example.Notas.Models.EstudianteModel;
import com.example.Notas.Repositories.EstudianteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    
    @Autowired
    EstudianteRepo estudianteRepo; 

    //Guarda a cada Estudiante.
    public EstudianteModel guardarEstudianteModel(EstudianteModel estudianteModel){
        return estudianteRepo.save(estudianteModel);
    }

    //Nos entrega una lista de todos los Estudiantes.
    public ArrayList<EstudianteModel> obtenerEstudiantes(){
        return (ArrayList<EstudianteModel>) estudianteRepo.findAll();
    }

    //Eliminamos un estudiante.
    public void eliminarEstudianteModel(EstudianteModel estudianteModel){
        estudianteRepo.delete(estudianteModel);
    }

    //Eliminamos un estudiante por ID.
    public void eliminarIdEstudianteModel(Long id){
        estudianteRepo.deleteById(id);
    }

    public void actualizarEstudiante(EstudianteModel estudianteModel, long id){
        estudianteRepo.save(estudianteModel);
    }


}
