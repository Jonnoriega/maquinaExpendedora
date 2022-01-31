package com.curso.maquinaExpendedora.domain;



public class Refresco {

	private String nombre;
	private double precio;
//	private Maquina[] maquina;
//	private int numberOfRefresh;
	
	public Refresco(String n, double p ) {
	    this.nombre = n;
	    this.precio = p;
//	   maquina = new Maquina[10];
//	   numberOfRefresh = 0;
	  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
