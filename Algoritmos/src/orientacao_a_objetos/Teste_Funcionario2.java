package orientacao_a_objetos;

import java.util.Scanner;

public class Teste_Funcionario2 {
	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	Funcionario fun = new Funcionario("Lucas");
	
	System.out.println("Digite o nome");
	fun.nome = scanner.nextLine();
	
		
	int aux = 0;
	while (aux == 0){
		System.out.println("Digite o nome");
		fun.nome = scanner.next();
		System.out.println("Digite o salario");
		fun.salario = scanner.nextInt();
		System.out.println(fun.consultarDados());
		
		System.out.println("Digite 0 para continuar ou 1 para encerrar");
		aux = scanner.nextInt();
	}
		
	scanner.close();
	}
}
