package java_static;

import orientacao_a_objetos.Contas;

public class teste_contador {
	public static void main(String[] args) {
		
		System.out.println(Contas.contador);
		Contas conta = new Contas();
		System.out.println(conta.id);
		
		Contas conta2 = new Contas();
		System.out.println(conta2.id);
		
		Contas.zeraContador();
		System.out.println(Contas.contador);
		
		
	}
}
