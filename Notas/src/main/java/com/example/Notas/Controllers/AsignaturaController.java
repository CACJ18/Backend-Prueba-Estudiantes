package com.example.Notas.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Notas.Models.AsignaturaModel;
import com.example.Notas.Services.AsignaturaService;


@RestController
@RequestMapping("/asignaturas/")
public class AsignaturaController {
    
    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping
    public ArrayList<AsignaturaModel> obtenerAsignatura(){
        return asignaturaService.obtenerAsignatura();
    }

    @PostMapping
    public AsignaturaModel guardarAsignaturaModel(@RequestBody AsignaturaModel asignaturaModel){
        return asignaturaService.guardarAsignaturaModel(asignaturaModel);
    }

    @GetMapping("{id}")
    public ArrayList<AsignaturaModel> obtenerAsignaturaByTeacher(@PathVariable("id") Long idDocente){
        return asignaturaService.findAllByTeacher(idDocente);
    }

    @GetMapping("{nombre}")
    public ArrayList<AsignaturaModel> obtenerAsignaturaByStudent(@PathVariable("nombre") String nombreEstudiante){
        return asignaturaService.findAllByStudent(nombreEstudiante);
    }
    
}
