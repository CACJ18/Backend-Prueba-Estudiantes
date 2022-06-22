package com.example.Notas.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Notas.Models.DocenteModel;

@Repository
public interface DocenteRepo extends CrudRepository<DocenteModel, Long>{
    
}
