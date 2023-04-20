package com.joel.mySpringBootApp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.mySpringBootApp.model.Post;
import com.joel.mySpringBootApp.services.PostService;

@Service("serviceDecorado")
public class PostServiceDecoradoImpl implements PostService{

    @Autowired
    private PostServiceImpl postServiceImpl;
    
    @Autowired
    PostServiceImplDos postServiceImplDos;

    @Override
    public List<Post> validacion(List<Post> posts) {
        posts = postServiceImpl.validacion(posts);
        posts = postServiceImplDos.validacion(posts);
        for (Post post : posts) {
            if (post.getDescripcion() == null) {
                throw new NullPointerException("La descripcion es null");  
            }
        }
        for (Post post : posts) {
            if (post.getFecha() == null) {
                throw new NullPointerException("La fecha es null");  
            }
        }
        System.out.println("esta es la clase decorada");
        return posts;
    }
    
}
