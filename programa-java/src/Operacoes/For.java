package Operacoes;

public class For {
	
	public static void main(String[] args) {
		
		//Estrutura de repetição FOR E CONTINUE
		
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual é: " + numero);
			if(numero == 7) {
				System.out.println("Obaaaa, encontrei o número 7");
				System.out.println("Estou parando de executar...");
				break;
			}
		}
	}
}
