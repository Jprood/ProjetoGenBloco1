package mock;

import entidades.Perguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerguntasMock {

	Scanner sc = new Scanner(System.in);

	public PerguntasMock() {

		adicionarPerguntas();
	}


	public List<Perguntas> listaHistoria = new ArrayList<>();
	public List<Perguntas> listaPortugues = new ArrayList<>();
	public List<Perguntas> listaMatematica = new ArrayList<>();

	Perguntas historia1 = new Perguntas("Como e chamada a Conjuracao Baiana?", "A)Revolta dos Alfaiates",
			"B)Guerra da Cisplatina", "C)Cabanagem", "D)Balaiada", 'a');

	Perguntas historia2 = new Perguntas(
			"Entre as principais caracterasticas comuns aos povos da Mesopotamia destacava-se a crenca:",
			"A)As religioes monoteistas, pois acreditavam em um unico deus",
			"B)As religioes politeistas, pois acreditavam em varios deuses ligados a natureza.",
			"C)As religioes politeistas, pois acreditavam em um unico deus.",
			"D)Nao tinham nenhuma religiao e nao acreditavam em deuses.", 'b');

	Perguntas portugues1 = new Perguntas(
			"(Instituto Legatus - 2014 - Prefeitura de Curralinhos - PI - Motorista) - Assinale a alternativa em que todas as palavras foram grafadas corretamente:",
			"A)paralisar, pesquizar, ironizar.", "B)altez, empreza, francesa.", "C)cuscus, chimpanze, encharcar.",
			"D)incenso, obsessao, excecao.", 'd');

	Perguntas portugues2 = new Perguntas(
			"( OBJETIVA - 2016 - Agente Administrativo) - Assinalar a alternativa que preenche a lacuna abaixo CORRETAMENTE: As mulheres ------ devem saber a hora de dizer nao.",
			"A)mesmos", "B)mesma", "C)mesmas", "D)mesmo", 'c');

	Perguntas matematica1 = new Perguntas(
			"Uma turma tem 36 alunos e cada um deles tem um numero de 1 a 36 na lista de chamada. Ontem, a professora chamou Lia ao quadro-negro e mais os outros seis alunos cujos numeros eram multiplos do numero de Lia. Qual foi o maior numero chamado?",
			"A)14", "B)35", "C)32", "D)35", 'd');

	Perguntas matematica2 = new Perguntas(
			"Marcia decidiu ofertar um lanche as pessoas em situacao de rua na sua cidade. Para isso, ela decidiu confeccionar sanduiches e foi ate a padaria perto da sua casa, onde o kg de pao frances custa R$ 12,00. Sabendo que Marcia possuia R$ 42,00 para comprar paes, quantos quilos ela conseguiu comprar?",
			"A)4,5kg", "B)3,5kg", "C)4kg", "D)3kg", 'b');

	public void adicionarPerguntas() {

		listaHistoria.add(historia1);
		listaHistoria.add(historia2);
		listaPortugues.add(portugues1);
		listaPortugues.add(portugues2);
		listaMatematica.add(matematica1);
		listaMatematica.add(matematica2);
	}

	public void responderHistoria() {

		for (Perguntas lista : listaHistoria) {

			System.out.print(listaHistoria.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
			System.out.print("\nEscolha a alternativa: ");
			char alternativa = sc.next().charAt(0);

			if (alternativa == lista.getRespostaCorreta()) {

				System.out.println("Resposta Correta!!!");
			} else {

				System.out.println("Resposta Errada!!!");
			}
		}
	}

	public void responderPortugues() {

		for (Perguntas lista : listaPortugues) {
			
			System.out.print(listaPortugues.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
			System.out.print("\nEscolha a alternativa: ");
			char alternativa = sc.next().charAt(0);

			if (alternativa == lista.getRespostaCorreta()) {

				System.out.println("Resposta Correta!!!");
			} else {

				System.out.println("Resposta Errada!!!");
			}
		}
	}

	public void responderMatematica() {

		for (Perguntas lista : listaMatematica) {

			System.out.print(listaMatematica.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
			System.out.print("\nEscolha a alternativa: ");
			char alternativa = sc.next().charAt(0);

			if (alternativa == lista.getRespostaCorreta()) {

				System.out.println("Resposta Correta!!!");
			} else {

				System.out.println("Resposta Errada!!!");
			}	
		}
	}
	public void listarHistoria() {
		
		for (Perguntas lista: listaHistoria) {
			
			System.out.print(listaHistoria.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
		}
	}
	public void listarPortugues() {
		
		for (Perguntas lista: listaPortugues) {
			
			System.out.print(listaPortugues.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
		}
		
	}
	public void listarMatematica() {
		
		for (Perguntas lista: listaMatematica) {
			
			System.out.print(listaMatematica.indexOf(lista)+ 1+ "-");
			System.out.println(lista);
		}
	}

}
