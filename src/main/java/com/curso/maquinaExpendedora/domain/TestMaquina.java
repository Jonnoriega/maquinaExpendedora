package com.curso.maquinaExpendedora.domain;

import java.util.Scanner;

public class TestMaquina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina maquina =null;
		Refresco refresco;
		int seleccion;
		int recaudacion=0;
		Integer dinero=0;
		int cambios=0;
		
		
		
		 
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
			System.out.println("****Seleccione opcion****");
			System.out.println("*-----------------------*");
			System.out.println("*       1-Reponer       *");
			System.out.println("*       2-Comprar       *");
			System.out.println("*   3-Ver Recaudacion   *");
			System.out.println("*     4-Ver Cambios     *");
			System.out.println("*        5-Salir        *");
			System.out.println("*************************");
			System.out.println("");
			seleccion = sc.nextInt();
			if(seleccion==1) {
				System.out.println("Productos repuestos!");
				System.out.println("");
				maquina = new Maquina();
				maquina.addRefresco("CocaCola", 180, 2);
				maquina.addRefresco("Fanta Naranja", 150, 2);
				maquina.addRefresco("Fanta Limon", 150, 2);
				maquina.addRefresco("RedBull", 150, 2);
				maquina.addRefresco("Aquarius", 250, 2);
				maquina.addRefresco("Nestea", 250, 2 );
				maquina.addRefresco("Agua", 100, 2);
				maquina.addRefresco("Batido", 150, 2);
				maquina.addRefresco("Zumo naranja", 200, 2);
				maquina.addRefresco("Zumo melocoton", 200, 2);
				cambios=500;
				
			}else if(seleccion==2) {
				if(maquina==null) {
					System.out.println("Maquina vacia, hay que reponer");
					System.out.println(" ");
					
				}else {
				System.out.println("Productos de Maquina Jon Ander S.A.");
				System.out.println("");
				 for ( int i = 0; i < maquina.getNumOfRefresco(); i++ ) {
			            Refresco refrescos = maquina.getRefresco(i);
			            
			            System.out.println("Introduzca [" + (i+1) + "] para comprar "
			                    + refrescos.getNombre()
			                    + ", " + refrescos.getPrecio() +" Cetavos "
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
						System.out.println("Producto seleccionado: "+maquina.getRefresco(seleccion).getNombre());
						System.out.println("Precio del producto: "+maquina.getRefresco(seleccion).getPrecio());
						System.out.println("Introduzca dinero:");
						dinero=sc.nextInt();
						Integer PreciPro= maquina.getRefresco(seleccion).getPrecio();
						if(dinero<maquina.getRefresco(seleccion).getPrecio()) {
							System.out.println("Lo sentimos, dinero insuficiente, vuelva pronto");
							
						}else if(PreciPro.equals(dinero)) {
							System.out.println("Muchas gracias por su visita, recoja el producto");
							recaudacion+=maquina.getRefresco(seleccion).getPrecio();
							can=maquina.getRefresco(seleccion).getCantidad();
							can--;
							maquina.getRefresco(seleccion).setCantidad(can);
							//cambios-=cambi;
							cambios+=maquina.getRefresco(seleccion).getPrecio();
							
						}else if(dinero>maquina.getRefresco(seleccion).getPrecio()) {
							int cambi =dinero-maquina.getRefresco(seleccion).getPrecio();
							
							if(cambios>cambi) {
								System.out.println("Su cambio es: " + cambi);
								System.out.println("Muchas gracias por su visita, recoja el producto");
								System.out.println("");
								recaudacion+=maquina.getRefresco(seleccion).getPrecio();
								can=maquina.getRefresco(seleccion).getCantidad();
								can--;
								maquina.getRefresco(seleccion).setCantidad(can);
								//cambios-=cambi;
								cambios+=maquina.getRefresco(seleccion).getPrecio();
							
							
							}else {
								System.out.println(" ");
								System.out.println("Lo sentimos maquina con cambios insuficientes");
								System.out.println("Vuelva a intentarlo con menos dinero");
								System.out.println(" ");
							}
						}
						
					}
				}
			}else if(seleccion==3) {
				System.out.println("La recaudacion es: "+recaudacion+ " Centavos");
				System.out.println(" ");
				
			}else if(seleccion==4) {
				System.out.println("Los cambios son: "+cambios+ " Centavos");
				System.out.println(" ");
				
			}else if(seleccion==5) {
				System.out.println("Salimos");
				break;
			}else {
				System.out.println("Opcion incorrecta");
			}
		}
		

	}

}
