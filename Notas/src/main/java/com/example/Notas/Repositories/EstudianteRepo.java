package com.example.Notas.Repositories;

import com.example.Notas.Models.EstudianteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepo extends CrudRepository<EstudianteModel, Long>{
    
}
