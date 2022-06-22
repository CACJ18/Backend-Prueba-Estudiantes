package com.example.Notas.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Notas.Models.DocenteModel;
import com.example.Notas.Services.DocenteService;

@RestController
@RequestMapping("/docentes/")
public class DocenteController {
    
    @Autowired
    DocenteService docenteService;

    @GetMapping
    public ArrayList<DocenteModel> obtenerDocente(){
        return docenteService.obtenerDocente();
    }

    @PostMapping
    public DocenteModel guardarDocenteModel(@RequestBody DocenteModel docenteModel){
        return docenteService.guardarDocenteModel(docenteModel);
    }
}
