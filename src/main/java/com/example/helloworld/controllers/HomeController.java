package com.example.helloworld.controllers;

import com.example.helloworld.entities.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(value = "/miau")
    public String emp(){
        return "cines/lista";
    }

    @PostMapping(value = "/wau")
    public String wau(){
        return "wau";
    }

    @PostMapping(value = "/persona/guardar")
    public String guardarPersona(@RequestParam("nombre") String nombre,
                                 @RequestParam("apellido") String apellido,
                                 @RequestParam("dni") String dni,
                                 Model model){
        //guardamos en BD
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);

        model.addAttribute("nombre",nombre);
        model.addAttribute("apel",apellido);
        model.addAttribute("dni",dni);
        model.addAttribute("edad", 30);

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        model.addAttribute("persona",persona);

        return "cines/success";
    }

}
