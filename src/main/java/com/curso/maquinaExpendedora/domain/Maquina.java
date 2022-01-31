package com.curso.maquinaExpendedora.domain;


public class Maquina {
		private Refresco[] refrescos;
		private int numberOfRefresco;
		
		
		public Maquina() {
			    refrescos = new Refresco[10];
			    numberOfRefresco = 0;
			  }
		
		 public void addRefresco(String n, double p) {
			    int i = numberOfRefresco++;
			    refrescos[i] = new Refresco(n, p);
			 }
		 
		
		 public int getNumOfRefresco() {
			    return numberOfRefresco;
			  }
		 
		 public Refresco getRefresco(int index) {
			    return refrescos[index];
			  }
}
