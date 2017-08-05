package exercicio_lista3.numero_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {
	public static void main(String[] args) {
		
		Livros l1 = new Livros("Certificação Cisco CCNA 1 e 2", 150d, "123456", "Lucas Draeger de Souza");
		Livros l2 = new Livros("A cabana", 55d, "569236", "Desconhecido");
		CDs cd1 = new CDs("Michael Jackson", 50d, "654321", 15);
		DVDs dvd1 = new DVDs("A Lagoa Azul", 5d, "843591", 95d);
		
		List<Produtos> lProdutos = new ArrayList<>();
		lProdutos.add(l1);
		lProdutos.add(cd1);
		lProdutos.add(dvd1);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l1));
		
		for (Produtos produto : lProdutos) {
			System.out.println(produto.toString());
		}
		
		buscaProdutos(cd1, lProdutos);
		
		Collections.sort(lProdutos);
		
		System.out.println();
		
		for (Produtos produto : lProdutos) {
			System.out.println(produto.toString());
		}
		
		private static void buscaProdutos(Produtos produto, List<Produtos> Produtos) {
			for (Produtos prod : lProdutos) {
				if(prod.equals(produto)){
					
				}
			}
		}

	
	}

	private static void buscaProdutos(CDs cd1, List<Produtos> lProdutos) {
		// TODO Auto-generated method stub
		
	}
}
