package com.joel.mySpringBootApp.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joel.mySpringBootApp.configuration.Pages;
import com.joel.mySpringBootApp.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {

    public List<Post> getPosts(){
        ArrayList<Post> post = new ArrayList<>();
        post.add(new Post(1,"Michael Gary Scott es un personaje ficticio y el protagonista de la comedia de situación de NBC, The Office, interpretado por Steve Carell.","http://localhost:8080/img/Michael-Scott.avif",new Date(0),"Michael Scott"));
        post.add(new Post(2,"Kevin Malone es un personaje ficticio de la serie de televisión estadounidense The Office. Fue interpretado por Brian Baumgartner.","http://localhost:8080/img/Kevin-Malone.jpg",new Date(0),"Kevin Malone"));
        post.add(new Post(3,"Dwight Kurt Schrute es un personaje ficticio de The Office interpretado por Rainn Wilson. Vendedor de más alto rango, y asistente del gerente regional","http://localhost:8080/img/Dwight-Schrute.jpeg",new Date(0),"Dwight Schrute"));
        post.add(new Post(4,"Stanley Hudson es un personaje ficticio interpretado por Leslie David Baker en la serie de televisión The Office. Es vendedor en Dunder Mifflin Scranton.","http://localhost:8080/img/Stanley-hudson.avif",new Date(0),"Stanley Hudson"));
        return post;
    }

    //se le pueden indicar diversas rutas por medio de un arreglo
    @GetMapping(path = {"/"})
    public String saludar(Model model){
        model.addAttribute("posts", this.getPosts());
        return "index";
    }

    // @GetMapping("/public")
    // public ModelAndView post(){
    //     ModelAndView modelAndView = new ModelAndView(Pages.HOME);
    //     model.addObject("posts", this.getPosts());
    //     return modelAndView;
    // }

    @GetMapping(path = {"/post"})
    public ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name ="id", required = false) int id){

        ModelAndView modelAndView = new ModelAndView(Pages.POST);

        List<Post> postFiltrado = this.getPosts().stream().filter( (p) -> { return p.getId() == id; }).collect(Collectors.toList());

        modelAndView.addObject("post", postFiltrado.get(0));
        return modelAndView;
    }
        
    
}
