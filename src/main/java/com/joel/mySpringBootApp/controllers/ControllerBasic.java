package com.joel.mySpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class ControllerBasic {

    //se le pueden indicar diversas rutas por medio de un arreglo
    @GetMapping(path = {"/saludar", "/holamundo"})
    public String saludar(){
        return "index";
    }

}
