package Operacoes;

public class Continue {

	public static void main(String[] args) {
		
		
		//Estrutura de repetição FOR e CONTINUE
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual é: " + numero);
			if(numero == 9 || numero == 3 || numero == 5) {
				System.out.println("Obaaaa, encontrei o número " + numero);
				continue;
			}
			
			System.out.println(" Processando laço de repetição");
		}
	}
}
