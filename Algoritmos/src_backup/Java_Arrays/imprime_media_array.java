package Java_Arrays;

public class imprime_media_array {
		public static void main(String[] args) {
		
			//chamei a classe array
			array ma = new array();
			
			int soma = 0;
			double media = 0;
			
			for (int numero : ma.numeros) {
				soma = soma + numero;							
			}
			
			media = soma / ma.numeros.length;
			
			System.out.println(media);
					
		}
}
