package entidades;

public class Aluno extends Usuario {
	
	private String escolaridade;
	private int idade;

	public Aluno(){
	}

	public Aluno(String nome, String nomeInstituicao) {
		super(nome, nomeInstituicao);
	}

	public Aluno(String nome, String nomeInstituicao, int idade) {
		super(nome, nomeInstituicao);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public void agradecer() {
		if(!getNomeInstituicao().equals("X")) {
			System.out.println("Obrigado " + getNome() + " por utilizar o programa, a " + getNomeInstituicao() + " te preparou muito bem!");
		}else {
			System.out.println("Obrigado por utilizar o servico");
		}
	}


}
