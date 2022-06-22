package com.example.Notas.Controllers;

import java.util.ArrayList;

import com.example.Notas.Models.EstudianteModel;
import com.example.Notas.Services.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes/")
public class EstudianteController {

    //Se realiza para tener acceso a los métodos de los servicios.
    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public ArrayList<EstudianteModel> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping
    public EstudianteModel guardarEstudianteModel(@RequestBody EstudianteModel estudianteModel){
        return estudianteService.guardarEstudianteModel(estudianteModel);
    }
}
