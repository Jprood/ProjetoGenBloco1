package bloco1;

public class PerguntasHistoria extends Perguntas{

	public PerguntasHistoria(int codigo, String pergunta, String resposta1, String resposta2, String resposta3,
			String resposta4, int respostaCorreta) {
		super(codigo, pergunta, resposta1, resposta2, resposta3, resposta4, respostaCorreta);
	}
	
	PerguntasHistoria historia1 = new PerguntasHistoria(1, "Como � chamada a Conjura��o Baiana?", 
	"Revolta dos Alfaiates", "Guerra da Cisplatina", "Cabanagem", "Balaiada", 1);

	
}
