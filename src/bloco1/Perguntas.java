package bloco1;

public class Perguntas {
	
	private String pergunta, resposta1, resposta2, resposta3, resposta4;
	private int codigo, respostaCorreta;
	
	public Perguntas(int codigo, String pergunta, String resposta1, String resposta2, 
		String resposta3, String resposta4, int respostaCorreta) {
		super();
		this.codigo = codigo;
		this.pergunta = pergunta;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.respostaCorreta = respostaCorreta;
	}
	
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(int respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

}
