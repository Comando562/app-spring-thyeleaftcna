package com.moyastudio.appsimple.app_spring_thyeleaftcna.controller;

import com.moyastudio.appsimple.app_spring_thyeleaftcna.entities.Persona;
import com.moyastudio.appsimple.app_spring_thyeleaftcna.service.impl.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    //La clase model se utiliza para transferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas=personaService.obtenerTodas();
        model.addAttribute("ListarPersonas", personas);
        return "listar";
    }
}
