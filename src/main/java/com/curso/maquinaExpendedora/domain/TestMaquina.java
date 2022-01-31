package com.curso.maquinaExpendedora.domain;

import java.util.Scanner;

public class TestMaquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina maquina = new Maquina();
		Refresco refresco;
		int seleccion;
		
		
		maquina.addRefresco("CocaCola", 1.8, 2);
		maquina.addRefresco("Fanta Naranja", 1.5, 2);
		maquina.addRefresco("Fanta Limon", 1.5, 2);
		maquina.addRefresco("RedBull", 2.8, 2);
		maquina.addRefresco("Aquarius", 2.5, 2);
		maquina.addRefresco("Nestea", 2.5, 2 );
		maquina.addRefresco("Agua", 1, 2);
		maquina.addRefresco("Batido", 1.5, 2);
		maquina.addRefresco("Zumo naranja", 2, 2);
		maquina.addRefresco("Zumo melocoton", 2, 2);
		
		
		 
		System.out.println("Seleccione producto");
		System.out.println("");
		 for ( int i = 0; i < maquina.getNumOfRefresco(); i++ ) {
	            Refresco refrescos = maquina.getRefresco(i);
	            
	            System.out.println("Refresco [" + (i+1) + "] es "
	                    + refrescos.getNombre()
	                    + ", " + refrescos.getPrecio()
	                    + ", " + refrescos.getCantidad()
	            		);
	        }
		 
		System.out.println("");
		System.out.println("Seleccione numero de producto");
		System.out.println("");
		seleccion = sc.nextInt();
		seleccion--;
		if(seleccion<1|| seleccion>10) {
			System.out.println("introduzca cantidad valida");
		}else {
		System.out.println( maquina.getRefresco(seleccion).getNombre());
		}
		 

	}

}
