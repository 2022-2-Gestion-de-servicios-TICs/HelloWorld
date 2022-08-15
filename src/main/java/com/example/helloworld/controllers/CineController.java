package com.example.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/cines")
public class CineController {

    @GetMapping(value = {"/listar", ""})
    @ResponseBody
    public String listar(@RequestParam("edad") String edad,
                         @RequestParam("nombre") String nombre,
                         @RequestParam(name = "apellido", required = false) String apellido) {
        System.out.println("nombre= " + nombre);
        System.out.println("apellido= " + apellido);
        try{
            int num = Integer.parseInt(edad);
            System.out.println("edad=" + edad);
        }catch ( NumberFormatException e){
            System.out.println("El número no es numero pe");
        }
        return "<h2>Lista cines</h2>";
    }

    @GetMapping("/crear/{nombre}/{apellido}")
    public String crear(@PathVariable(value="nombre",required = false) String nombre,
                        @PathVariable(value = "apellido") String apellido) {
        System.out.println("nombre= " + nombre);
        System.out.println("apellido= " + apellido);
        return "wau";
    }

    @GetMapping("/registro")
    public String registro(){
        return "cines/registro";
    }
}
