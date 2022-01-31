package com.curso.maquinaExpendedora.domain;



public class TestMaquina {

	public static void main(String[] args) {
		Maquina maquina = new Maquina();
		Refresco refresco;
		maquina.addRefresco("CocaCola", 2);
		maquina.addRefresco("Fanta Naranja", 2);
		maquina.addRefresco("RedBull", 2.8);
		maquina.addRefresco("Aquarius", 2.5);
		maquina.addRefresco("Cocacola", 2);
		maquina.addRefresco("Cocacola", 2);
		maquina.addRefresco("Cocacola", 2);
		maquina.addRefresco("Cocacola", 2);
		maquina.addRefresco("Cocacola", 2);
		maquina.addRefresco("Cocacola", 2);
		
		 for ( int i = 0; i < maquina.getNumOfRefresco(); i++ ) {
	            Refresco refrescos = maquina.getRefresco(i);
	            
	            System.out.println("Refresco [" + (i+1) + "] es "
	                    + refrescos.getNombre()
	                    + ", " + refrescos.getPrecio());
	        }

	}

}
