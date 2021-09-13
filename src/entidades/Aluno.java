package entidades;

public class Aluno extends Usuario {//Criação da classe Aluno
	
	private String escolaridade;// Definição dos atributos de Aluno
	private int idade;

	public Aluno(){//construtor generico 
	}

	public Aluno(String nome, String nomeInstituicao) {//Construtor da classe aluno
		super(nome, nomeInstituicao);
	}

	public Aluno(String nome, String nomeInstituicao, int idade) {//Utilizando metodos da classe Usuario
		super(nome, nomeInstituicao);
		this.idade = idade;
	}

	public int getIdade() {//demais metodos da classe Aluno
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//polimorfismo da classe agradecer
	@Override
	public void agradecer() {
		if(!getNomeInstituicao().equals("X")) {
			System.out.println("Obrigado " + getNome() + " por utilizar o programa, a " + getNomeInstituicao() + " te preparou muito bem!");
		}else {
			System.out.println("Obrigado por utilizar o servico");
		}
	}


}
