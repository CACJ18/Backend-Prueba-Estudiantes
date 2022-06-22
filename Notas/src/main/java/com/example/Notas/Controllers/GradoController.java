package com.example.Notas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Notas.Services.GradoService;

@RestController
@RequestMapping("/grados/")
public class GradoController {
    
    @Autowired
    GradoService gradoService;

    
}
