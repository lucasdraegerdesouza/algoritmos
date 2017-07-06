package java_static;

import orientacao_a_objetos.Contas;

public class teste_contador {
	public static void main(String[] args) {
		
		
		Contas conta = new Contas();
		System.out.println("id da conta 1"+conta.id);
		
		Contas conta2 = new Contas();
		System.out.println("id da conta 2"+conta2.id);
		
		Contas.zeraContador();
		System.out.println("Zerei o contador = "+Contas.contador);
		
		
	}
}
