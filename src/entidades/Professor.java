package entidades;

public class Professor extends Usuario {
	
	private String especializacao;

	public Professor(){
	}

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

	@Override
	public void agradecer(){
		System.out.println("Obrigado " + getNome() + "! por utilizar o nosso sitema para ajudar seus alunos da instituicao " + getNomeInstituicao());
	}

}
