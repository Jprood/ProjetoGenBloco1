package bloco1;

public class Professor extends Usuario{
	
	private String especializacao;

	public Professor(String nome, String nomeInstituicao, String especializacao) {
		super(nome, nomeInstituicao);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
}
