package OrientacaoObj;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno {
	
	//Esses s?o os atributos do Aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serie;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	//cria os dados namemoria, sendo o padr?o do java.
	public Aluno() { 
		
	}
	
	public Aluno(String nomeP) {
		nome = nomeP;
	}
	
	public Aluno (String nomeP, int idadeP) {
		nome = nomeP;
		idade = idadeP;
	}
	
	//Veremos o metodos SETTERS e GETTERS do Objeto.
	//SET ? para adicionar ou receber dados para os atributos.
	//GET ? para resgatar ou obter o valor do atributos.
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

		//M?todo que retorna a m?dia do aluno.
		public double getMediaNota() {
				double soma = 0.0;
			for(Disciplina disciplina : disciplinas) {
				soma += disciplina.getNota();
			}
			return soma / disciplinas.size();
		}
		
		public String getStatus() {
			double media = this.getMediaNota();
			
			if(media > 7) {
				return StatusAluno.APROVADO;
			}else if(media >= 5 && media >=6 ){
				return StatusAluno.RECUPERACAO;
			}else {
				return StatusAluno.REPROVADO;
			}
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serie=" + serie + ", disciplina=" + disciplinas + "]";
		}
		
	
}
