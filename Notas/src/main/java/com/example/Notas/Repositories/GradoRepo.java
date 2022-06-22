package com.example.Notas.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Notas.Models.GradoModel;

@Repository
public interface GradoRepo extends CrudRepository<GradoModel, Long>{
    
}
