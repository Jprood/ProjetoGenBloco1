package bloco1;

public class Usuario {
	
	private String nome, nomeInstituicao;

	public Usuario(String nome, String nomeInstituicao) {
		super();
		this.nome = nome;
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
}
