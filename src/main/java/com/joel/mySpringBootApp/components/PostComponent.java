package com.joel.mySpringBootApp.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.joel.mySpringBootApp.model.Post;

@Component("com.joel.mySpringBootApp.components.PostComponent")
public class PostComponent {
    
    public List<Post> getPosts(){
        ArrayList<Post> post = new ArrayList<>();
        post.add(new Post(1,"Michael Gary Scott es un personaje ficticio y el protagonista de la comedia de situación de NBC, The Office, interpretado por Steve Carell.","http://localhost:8080/img/Michael-Scott.avif",new Date(),"Michael Scott"));
        post.add(new Post(2,"Kevin Malone es un personaje ficticio de la serie de televisión estadounidense The Office. Fue interpretado por Brian Baumgartner.","http://localhost:8080/img/Kevin-Malone.jpg",new Date(),"Kevin Malone"));
        post.add(new Post(3,"Dwight Kurt Schrute es un personaje ficticio de The Office interpretado por Rainn Wilson. Vendedor de más alto rango, y asistente del gerente regional","http://localhost:8080/img/Dwight-Schrute.jpeg",new Date(),"Dwight Schrute"));
        post.add(new Post(4,"Stanley Hudson es un personaje ficticio interpretado por Leslie David Baker en la serie de televisión The Office. Es vendedor en Dunder Mifflin Scranton.","http://localhost:8080/img/Stanley-hudson.avif",new Date(),"Stanley Hudson"));
        return post;
    }
}
