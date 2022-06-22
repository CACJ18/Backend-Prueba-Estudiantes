package com.example.Notas.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Notas.Models.DocenteModel;
import com.example.Notas.Repositories.DocenteRepo;

@Service
public class DocenteService {
    
    @Autowired
    DocenteRepo docenteRepo;

    //Guarda a cada Docente.
    public DocenteModel guardarDocenteModel(DocenteModel docenteModel){
        return docenteRepo.save(docenteModel);
    }

    public ArrayList<DocenteModel> obtenerDocente(){
        return (ArrayList<DocenteModel>) docenteRepo.findAll();
    }

    //Eliminamos un docente.
    public void eliminarEstudianteModel(DocenteModel docenteModel){
        docenteRepo.delete(docenteModel);
    }

    //Eliminamos un docente por ID.
    public void eliminarIdDocenteModel(Long id){
        docenteRepo.deleteById(id);
    }

    public void actualizarDocente(DocenteModel docenteModel, long id){
        docenteRepo.save(docenteModel);
    }
}
