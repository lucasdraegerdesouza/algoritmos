package Exercicios_lista2_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verificar_apostas {
	
	public static void main(String[] args) {
	
		ArrayList<String> resultado = new ArrayList<String>();
		resultado.add("2, 9, 10, 11, 25, 59");
		
		
		ArrayList<String> apostas = new ArrayList<String>();  
		//apostas.add("2, 9, 10, 11, 25, 59");
		apostas.add("2, 9, 10, 5, 14, 59");
		//apostas.add("12, 15, 30, 38, 39, 40");
		//apostas.add("3, 5, 6, 10, 11, 12");
		//apostas.add("2, 4, 8, 26, 35, 38");
		for (String x : resultado) {
			System.out.println(apostas);
			System.out.println(resultado);
		}
					
	}

	

}
	

