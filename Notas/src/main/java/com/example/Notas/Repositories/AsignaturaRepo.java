package com.example.Notas.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Notas.Models.AsignaturaModel;

@Repository
public interface AsignaturaRepo extends CrudRepository<AsignaturaModel, Long>{
    
}
