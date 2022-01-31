package com.curso.maquinaExpendedora.domain;


public class Maquina {
		private Refresco[] refrescos;
		private int numberOfRefresco;
		
		
		public Maquina() {
			    refrescos = new Refresco[10];
			    numberOfRefresco = 0;
			  }
		
		 public void addRefresco(String n, int p, int c) {
			    int i = numberOfRefresco++;
			    refrescos[i] = new Refresco(n, p, c);
			 }
		 
		 public void comprarRefresco(String n, int p, int c, int index) {
			    int i = numberOfRefresco++;
			    refrescos[i] = new Refresco(n, p, c);
			    
			    
			    
			 }
		 
		
		 public int getNumOfRefresco() {
			    return numberOfRefresco;
			  }
		 
		 public Refresco getRefresco(int index) {
			    return refrescos[index];
			  }
}
