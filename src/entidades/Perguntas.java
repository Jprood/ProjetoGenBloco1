package entidades;

public class Perguntas {
	//Tributos da classe Perguntas
	private String pergunta, resposta1, resposta2, resposta3, resposta4;
	
	private char respostaCorreta;

	public Perguntas(){//constructor generico
	}

	//Constructor da classe Perguntas
	public Perguntas( String pergunta, String resposta1, String resposta2, 
		String resposta3, String resposta4, char respostaCorreta) {
		super();
		this.pergunta = pergunta;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.respostaCorreta = respostaCorreta;
	}
	//Metodos utilizados
	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta1() {
		return resposta1;
	}

	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}

	public String getResposta2() {
		return resposta2;
	}

	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}

	public String getResposta3() {
		return resposta3;
	}

	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}

	public String getResposta4() {
		return resposta4;
	}

	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}


	public char getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(char respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
	//metodo generico para classe, assume para o objeto a forma de como mostrar na tela 
	@Override
	public String toString() {
		return pergunta+ "\n"+ resposta1+ "\n"+ resposta2+ "\n"+ resposta3+ "\n"+ resposta4;
	}
	
	

}
