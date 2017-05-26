package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite qual o clima");
		String climausr = scanner.next();
		
		System.out.println("Digite qual a temperatura");
		int tempusr = scanner.nextInt();
		
		/*a.Se estiver sol ela usara blusa*/
		switch (climausr) {
		case "sol":
			/*b.Se estiver sol e a temperatura estiver acima de 30° ela usará saia*/	
			if (tempusr > 30) {
					System.out.println("Você usara Blusa e Saia");
				}else {
					/*c.Se estiver sol e a temperatura estiver abaixo ou igual a 30° e maior ou igual a 23° ela usará shorts.*/
					if (tempusr <= 30 & tempusr >= 23) {
						System.out.println("Você usara Blusa e Shorts");	
					}else {
					/*d.Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça jeans.*/
						if (tempusr < 23) {
							System.out.println("Você usara Blusa e calça jeans");
						}
					}
				}
		case "nublado":
		/*e.Se estiver nublado e a temperatura estiver mais que 25° graus
		* ela usará vestido.*/
			if (tempusr > 25) {
				System.out.println("Você usara vestido");
			}else {
		/*f.Se estiver nublado e a temperatura estiver menor ou igual a 25°
		 *ela usará calça de moletom e sobretudo. */		
				if (tempusr <= 25) {
					System.out.println("Você usara calça de moletom e sobretudo");
				}
			}
		case "chovendo":
			
			if (tempusr <= 10) {
				System.out.println("Você usara bota, calça jeans, blusa e um casaco de lã");
			}else {
				if (tempusr > 10 & tempusr < 25) {
					System.out.println("Você usara bota, calça jeans e camisete");
				}else {
					if (tempusr >= 25) {
						System.out.println("Você usara bota, calça jeans e uma blusa regata");
					}					
				}
			}
		break;
		default:System.out.println("É melhor você ficar em casa");
		}
		
		scanner.close();
		
	}
}
