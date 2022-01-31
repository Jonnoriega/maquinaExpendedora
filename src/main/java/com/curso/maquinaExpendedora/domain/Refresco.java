package com.curso.maquinaExpendedora.domain;



public class Refresco {

	private String nombre;
	private int precio;
	private int cantidad;
//	private Maquina[] maquina;
//	private int numberOfRefresh;
	
	public Refresco(String n, int p, int c ) {
	    this.nombre = n;
	    this.precio = p;
	    this.cantidad = c;
//	   maquina = new Maquina[10];
//	   numberOfRefresh = 0;
	  }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
