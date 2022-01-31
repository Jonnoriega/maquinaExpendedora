package com.curso.maquinaExpendedora.domain;

import java.util.Scanner;

public class TestMaquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina maquina =null;
		Refresco refresco;
		int seleccion;
		
		
		
		
		
		
		 
		/*System.out.println("Seleccione producto");
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
		}*/
		
		
		
		
		for(int ii=0; ii!=3; ) {
			System.out.println("Seleccione opcion");
			System.out.println("");
			System.out.println("1-reponer");
			System.out.println("2-comprar");
			System.out.println("3-salir");
			System.out.println("");
			seleccion = sc.nextInt();
			if(seleccion==1) {
				System.out.println("reponemos");
				System.out.println("");
				maquina = new Maquina();
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
				
			}else if(seleccion==2) {
				if(maquina==null) {
					System.out.println("Maquina vacia, hay que reponer");
					
				}else {
				System.out.println("compramos");
				System.out.println("");
				 for ( int i = 0; i < maquina.getNumOfRefresco(); i++ ) {
			            Refresco refrescos = maquina.getRefresco(i);
			            
			            System.out.println("Refresco [" + (i+1) + "] es "
			                    + refrescos.getNombre()
			                    + ", " + refrescos.getPrecio()
			                    + ", Cantidad " + refrescos.getCantidad()
			            		);
			        }
				 
					System.out.println("");
					System.out.println("Seleccione numero de producto");
					System.out.println("");
					seleccion = sc.nextInt();
					
					if (seleccion < 1 || seleccion > 10) {
						System.out.println("introduzca cantidad valida");
					}else if(maquina.getRefresco(seleccion-1).getCantidad()<1){
						
						System.out.println("Produto agotado, elija otro producto");
					} else {
						seleccion--;
						int can;
						
						
						can=maquina.getRefresco(seleccion).getCantidad();
						can--;
						maquina.getRefresco(seleccion).setCantidad(can);
						System.out.println(maquina.getRefresco(seleccion).getNombre());
					}
				}
			
			}else if(seleccion==3) {
				System.out.println("Salimos");
				break;
			}else {
				System.out.println("Opcion incorrecta");
			}
		}
		

	}

}
