package Operacoes;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		//Estrutura de repetição while
		while(numero <= 3) { //Verifica e depois executa o código
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		int numero2 = 0;
		do {//Primeiro executa e depois verifica
			
			System.out.println("O número atual é: " + numero2);
			numero2++;
		}while(numero2 <= 10);
	}
}
