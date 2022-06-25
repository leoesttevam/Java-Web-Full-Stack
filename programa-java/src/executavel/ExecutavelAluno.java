package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import OrientacaoObj.Aluno;
import OrientacaoObj.Disciplina;
import constantes.StatusAluno;

public class ExecutavelAluno {
	
	//Main é um metodo auto executavel em Java.g
	public static void main(String[] args) {
		
		//Objeto ainda não existe na memoria.
		//Aluno aluno;
		
		
		//aluno1 é uma referencia para o objeto Aluno
		//new Aluno() é uma instancia (Criação de Objeto)
		//Agora temos um objeto real na memoria pois ele está iniciado pelo new.
		//Aluno aluno1 = new Aluno();//Aqui será o João
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o login");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//Uma lista que dentro dela termos uma chave que identifica uma sequencia de valores também.
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno " + qtd + " ?");
		String idade = JOptionPane.showInputDialog("Informe o idade do aluno?");
		String nascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno?");
		String registro = JOptionPane.showInputDialog("Informe o registro geral do aluno?");
		String cpf = JOptionPane.showInputDialog("Informe o cpf do aluno?");
		String mae = JOptionPane.showInputDialog("Informe o nome da mãe do aluno?");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai do aluno?");
		String matri = JOptionPane.showInputDialog("Informe a data da matricula do aluno?");
		String escola = JOptionPane.showInputDialog("Informe o nome da escola do aluno?");
		String serie = JOptionPane.showInputDialog("Informe a serie do aluno?");
		
		Aluno aluno1 = new Aluno();//Aqui será o João
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(registro);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matri);
		aluno1.setNomeEscola(escola);
		aluno1.setSerie(serie);
		
		for(int pos = 1; pos <= 5; pos++) {
			String materia = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String nota = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(materia);
			disciplina.setNota(Double.parseDouble(nota));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha =JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		int posicao = 1;
		if(escolha == 0) {//Opção SIM e 0;
			
			int continuarRemover = 0;
			
			while(continuarRemover == 0) {
				String disciplinaRemove = JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2, 3, ou 4 ?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemove).intValue() -posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		
		alunos.add(aluno1);
	    }
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for(Aluno aluno : alunos) {
			
			if(aluno.getStatus().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getStatus().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if(aluno.getStatus().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("- - - - - - Lista dos aprovados - - - - - -");
		for(Aluno aluno : alunos) {
			System.out.println("Resultado = " + aluno.getStatus() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("- - - - - - Lista em recuperação - - - - - -");
		for(Aluno aluno : alunos) {
			System.out.println("Resultado = " + aluno.getStatus() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("- - - - - - Lista dos reprovados - - - - - -");
		for(Aluno aluno : alunos) {
			System.out.println("Resultado = " + aluno.getStatus() + " com média de = " + aluno.getMediaNota());
		}
		
		}
  }
}
