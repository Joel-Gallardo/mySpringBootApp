package com.joel.mySpringBootApp.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joel.mySpringBootApp.components.PostComponent;
import com.joel.mySpringBootApp.configuration.Pages;
import com.joel.mySpringBootApp.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {

    @Autowired
    private PostComponent _postComponent;

    //se le pueden indicar diversas rutas por medio de un arreglo
    @GetMapping(path = {"/"})
    public String saludar(Model model){
        model.addAttribute("posts", this._postComponent.getPosts());
        return "index";
    }

    // @GetMapping("/public")
    // public ModelAndView post(){
    //     ModelAndView modelAndView = new ModelAndView(Pages.HOME);
    //     model.addObject("posts", this.getPosts());
    //     return modelAndView;
    // }

    @GetMapping(path = {"/post", "/post/p/{post}"})
    public ModelAndView getPostIndividual(
        //@RequestParam(defaultValue = "1", name ="id", required = false) 
        @PathVariable(required =  true, name = "post") int id){

        ModelAndView modelAndView = new ModelAndView(Pages.POST);

        List<Post> postFiltrado = this._postComponent.getPosts().stream().filter( (p) -> { return p.getId() == id; }).collect(Collectors.toList());

        modelAndView.addObject("post", postFiltrado.get(0));
        return modelAndView;
    }

    @GetMapping("/postNew")
    public ModelAndView getForm() {
        return new ModelAndView("form").addObject("post", new Post());
    }
    
    @PostMapping("/addNewPost")
    public String addNewPost(Post post, Model model){
        List<Post> posts = this._postComponent.getPosts();
        posts.add(post);
        model.addAttribute("posts", posts);
        return "index";
    }
    
}
