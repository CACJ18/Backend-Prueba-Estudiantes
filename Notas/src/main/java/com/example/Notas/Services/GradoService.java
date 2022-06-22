package com.example.Notas.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Notas.Models.GradoModel;
import com.example.Notas.Repositories.GradoRepo;

@Service
public class GradoService {
    
    @Autowired
    GradoRepo gradoRepo;

    public ArrayList<GradoModel> obtenerGrado(){
        return (ArrayList<GradoModel>) gradoRepo.findAll(); 
    }
}
