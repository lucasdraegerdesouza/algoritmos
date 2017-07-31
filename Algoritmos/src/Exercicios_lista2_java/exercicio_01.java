package Exercicios_lista2_java;

public class exercicio_01 {
	public static void main(String[] args) {
		//apostas mega-sena
		int[] aposta1 = new int[] {2, 9, 10, 11, 25, 59};
		int[] aposta2 = new int[] {2, 9, 10, 5, 14, 59};
		int[] aposta3 = new int[] {12, 15, 30, 38, 39, 40};
		int[] aposta4 = new int[] {3, 5, 6, 10, 11, 12};
		int[] aposta5 = new int[] {2, 4, 8, 26, 35, 38};
		
		//resultado mega-sena
		int[] resultado = new int[] {59, 25, 11, 9, 10, 2};
		
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado.length; j++) {
				if (resultado[i] == aposta1[j]) {
					System.out.println("Aposta 1 Numeros iguais "+resultado[i]+" = "+aposta1[j]);
					break;				
					}
				if (resultado[i] == aposta2[j]) {
					System.out.println("\nAposta 2 Numeros iguais "+resultado[i]+" = "+aposta2[j]);
					break;				
					}
				if (resultado[i] == aposta3[j]) {
					System.out.println("\nAposta 3 Numeros iguais "+resultado[i]+" = "+aposta3[j]);
					break;				
					}
				if (resultado[i] == aposta4[j]) {
					System.out.println("\nAposta 4 Numeros iguais "+resultado[i]+" = "+aposta4[j]);
					break;				
					}
				if (resultado[i] == aposta5[j]) {
					System.out.println("\nAposta 5 Numeros iguais "+resultado[i]+" = "+aposta5[j]);
					break;				
					}
				}
			}
		}
		
	}
	

