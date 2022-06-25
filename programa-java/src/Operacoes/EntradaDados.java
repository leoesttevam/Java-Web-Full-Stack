package Operacoes;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		double car = Double.parseDouble(carros);
		double person = Double.parseDouble(pessoas);
		
		int divisao = (int) (car / person);
		
		double resto = car % person;
		
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
	}
}
