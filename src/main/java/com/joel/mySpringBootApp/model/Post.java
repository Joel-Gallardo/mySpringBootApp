package com.joel.mySpringBootApp.model;

import java.util.Date;

public class Post {
	private int id;
	private String descripcion;
	private String urlImg = "https://i.pinimg.com/originals/1a/15/43/1a154308f860e52f9b706b8c218442ca.jpg";
	private Date fecha = new Date(0);
	private String titulo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Post(int id, String descripcion, String urlImg, Date fecha, String titulo) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	public Post() {
		
	}
	
	
	
}
