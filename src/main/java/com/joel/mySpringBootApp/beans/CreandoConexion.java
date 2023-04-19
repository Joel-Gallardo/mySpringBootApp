package com.joel.mySpringBootApp.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.joel.mySpringBootApp.model.Conexion;
import com.joel.mySpringBootApp.model.Usuario;

@Component
public class CreandoConexion {


    @Bean(name = "BeanUsuario")
    public Usuario getUsuario(){
        return new Usuario();
    }

    @Bean(name = "beanConexion")
    public Conexion getConexion() {
        Conexion conexion = new Conexion();
        conexion.setDb("mysql");
        conexion.setUrl("localhost");
        return conexion;
    }
}
