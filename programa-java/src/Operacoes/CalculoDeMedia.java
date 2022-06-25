package Operacoes;

import javax.swing.JOptionPane;

public class CalculoDeMedia {

	public static void main(String[] args) {
		
		//Vai mostra uma caixa de mensagem pedido a notas do alunos.
		String nota1 = JOptionPane.showInputDialog("Informe a Primeira nota ");
		String nota2 = JOptionPane.showInputDialog("Informe a Segunda nota ");
		String nota3 = JOptionPane.showInputDialog("Informe a Terceira nota ");
		String nota4 = JOptionPane.showInputDialog("Informe a Quarta nota ");
		
		//Aqui estamos convertendo os String por Double. 
		double nNota1 = Double.parseDouble(nota1);
		double nNota2 = Double.parseDouble(nota2);
		double nNota3 = Double.parseDouble(nota3);
		double nNota4 = Double.parseDouble(nota4);
		
		//Estamos fazendo a soma das 4 notas e dividindo por 4.
		double media = (nNota1 + nNota2 + nNota3 + nNota4) / 4;
		
		//Vai mostra os resultado da media das notas
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "A media do Aluno é: " + media + ", aluno aprovado!");
		}else if(media >= 5 && media <= 6) {
			JOptionPane.showMessageDialog(null, "A media do Aluno é: " + media + ", aluno está em recuperação");
		}else {
			JOptionPane.showMessageDialog(null, "A media do Aluno é: " + media + ", o aluno foi reprovado");
		}
	}
}
