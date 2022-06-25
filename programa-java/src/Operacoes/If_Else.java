package Operacoes;

public class If_Else {
	
	//Main é um metodo auto executavel em Java.
	public static void main(String[] args) {
		
		int mediaAluno = 70;
		String nome = "Leonardo";
		
		if(mediaAluno >= 70 && nome.equals("Leonardo")) {
			System.out.println("Parabens você está aprovado!");
		}
		else if(mediaAluno < 70) {
			System.out.println("Você está reprovado!");
		}else {
			System.out.println("Aluno não encontrado");
		}
	}
}
