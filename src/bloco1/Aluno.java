package bloco1;

public class Aluno extends Usuario {
	
	private String escolaridade;
	private int idade, pontuacao;

	public Aluno(){
	}
	
	public Aluno(String nome, String nomeInstituicao, String escolaridade, int idade) {
		super(nome, nomeInstituicao);
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pontuacao = 0;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
