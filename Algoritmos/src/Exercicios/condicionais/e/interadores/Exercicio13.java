package Exercicios.condicionais.e.interadores;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
/*13.Escreva um algoritmo que o usuário entre com o salário
*da pessoa e imprima o salário líquido,
*segundo as informações abaixo,
*utilizando apenas um System.out.println:*/		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu salario:");
		double salariousr = scanner.nextDouble();
		
		/*a.Menor ou igual a R$ 600,00 é isento*/
		if (salariousr <= 600) {
			System.out.println("Salario isento");
		}else {
		/*b.Maior que R$ 600 e menor ou igual a R$ 1.200,00
		*o desconto é de 20%*/
			if (salariousr > 600 & salariousr <= 1200) {
				double desconto = (salariousr*20) / 100;
				salariousr = salariousr - desconto;
				System.out.println("Foi descontado 20% do seu salario, o seu salario liquido é de "+salariousr);
			}else {
/*c.Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00
 *o desconto é 25%*/				
				if (salariousr > 1200 & salariousr <= 2000) {
					double desconto = (salariousr*25) / 100;
					salariousr = salariousr - desconto;
					System.out.println("Foi descontado 25% do seu salario, o seu salario liquido é de "+salariousr);
				}else {
/*d.Maior que R$ 2000,00 o desconto é 30%*/
					if (salariousr > 2000) {
						double desconto = (salariousr*30) / 100;
						salariousr = salariousr - desconto;
						System.out.println("Foi descontado 30% do seu salario, o seu salario liquido é de "+salariousr);
					}
				}
			}
		}

		
		scanner.close();
	}
	

}
