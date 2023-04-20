package com.joel.mySpringBootApp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joel.mySpringBootApp.model.Post;
import com.joel.mySpringBootApp.services.PostService;

@Service("serviceDos")
public class PostServiceImplDos  implements PostService{

    @Override
    public List<Post> validacion(List<Post> posts) {
        System.out.println("segundo service");
        for (Post post : posts) {
            if (post.getId() == 0) {
                throw new NullPointerException("El id es 0");  
            }
        }
        return posts;
    }
    
}
