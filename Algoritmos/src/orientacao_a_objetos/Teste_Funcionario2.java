package orientacao_a_objetos;

import java.util.Scanner;

public class Teste_Funcionario2 {
	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	Funcionario fun = new Funcionario("");
	
	System.out.println("Digite o nome");
	fun.nome = scanner.nextLine();
	
		
	int aux = 1;
	while (aux != 0){
		System.out.println("1-Alterar nome, 2 alterar salario, 3 visualizar dados, 0 para sair");
		aux = Integer.parseInt(scanner.nextLine());
		
		switch (aux){
		
		case 0:
			break;
		
		case 1:
			System.out.println("Digite o nome");
			fun.nome = scanner.nextLine();
			break;
		case 2:
			System.out.println("Digite o salario");
			fun.salario = Double.parseDouble(scanner.nextLine());
			break;
		case 3:
			System.out.println(fun.consultarDados());
			break;
		
		default:
			System.out.println("Operação Invalida!");
			break;
		}
	}
		
	scanner.close();
	}
}
