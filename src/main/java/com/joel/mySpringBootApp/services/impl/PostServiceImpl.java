package com.joel.mySpringBootApp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joel.mySpringBootApp.model.Post;
import com.joel.mySpringBootApp.services.PostService;

@Service("serviceUno")
public class PostServiceImpl implements PostService{

    @Override
    public List<Post> validacion(List<Post> posts) {
        System.out.println("primer service");
        for (Post post : posts) {
            if (post.getTitulo() == null) {
                throw new NullPointerException("El titulo es null");
            }
        }
        return posts;
    }

}
