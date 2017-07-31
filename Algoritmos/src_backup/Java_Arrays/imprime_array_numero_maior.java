package Java_Arrays;

public class imprime_array_numero_maior {
	public static void main(String[] args) {
		//chamei a classe media_array
		array ma = new array();
		
		int maior = 0;
		
		for (int  numero : ma.numeros) {
			if (numero > maior){
				maior = numero;
			}
		}
		System.out.println(maior);
	}

}
