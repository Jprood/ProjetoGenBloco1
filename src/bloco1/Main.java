package bloco1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		PerguntasMock perguntas = new PerguntasMock();
		int opcao;

		System.out.println(
				"******************************************************************************************************");
		// abertura
		System.out.println("Jogo de perguntas e respostas!!");
		// cadastro
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o nome da sua intituicao de ensino: ");
		String nomeInstituicao = sc.nextLine();
		System.out.print("Voce e aluno ou professor? ");
		String alunoProfessor = sc.nextLine();
		// Menu Aluno

		if (alunoProfessor.equals("aluno")) {

			System.out.print("Voce esta no ensino medio ou fundamental? ");
			String escolaridade = sc.nextLine();
			System.out.print("Qual a sua idade? ");
			int idade = sc.nextInt();

			Aluno aluno1 = new Aluno(nome, nomeInstituicao, escolaridade, idade);

			do {

				System.out.println(
						"******************************************************************************************************");
				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("Escolha a materia: ");
				sc.nextLine();
				String materia = sc.nextLine();
				if (materia.equals("historia")) {

					perguntas.responderHistoria();
				} else if (materia.equals("portugues")) {

					perguntas.responderPortugues();
				} else if (materia.equals("matematica")) {

					perguntas.responderMatematica();
				}

				System.out.println("Deseja continar a estudar? \n1-sim \n0-não:");
				opcao = sc.nextInt();

			} while (opcao != 0);
		}
		// Menu Professor
		if (alunoProfessor.equals("professor")) {
				
			System.out.print("Qual sua Especializacao?(historia, portugues, matematica):  ");
			String especializacao = sc.nextLine();

			Professor prof1 = new Professor(nome, nomeInstituicao, especializacao);
			
			do {

				System.out.println(
						"******************************************************************************************************");
				System.out.println(
						"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				System.out.println("Voce deseja Criar uma Pergunta ou Excluir? (criar,excluir) :");
				String ce = sc.nextLine();

				if (ce.equals("criar")) {

					System.out.print("Escreva a pergunta: ");
					String pergunta = sc.nextLine();
					System.out.println("Escreva alternativa A: ");
					String resposta1 = "A)" + sc.nextLine();
					System.out.println("Escreva alternativa B: ");
					String resposta2 = "B)" + sc.nextLine();
					System.out.println("Escreva alternativa C: ");
					String resposta3 = "C)" + sc.nextLine();
					System.out.println("Escreva alternativa D: ");
					String resposta4 = "D)" + sc.nextLine();
					System.out.println("Escreva a alternativa da resposta correta: ");
					char rc = sc.next().charAt(0);

					Perguntas perguntac = new Perguntas(pergunta, resposta1, resposta2, resposta3, resposta4, rc);

					if (especializacao.equals("historia")) {

						perguntas.listaHistoria.add(perguntac);
						perguntas.listarHistoria();
					} else if (especializacao.equals("portugues")) {

						perguntas.listaPortugues.add(perguntac);
						perguntas.listarPortugues();
					} else if (especializacao.equals("matematica")) {

						perguntas.listaMatematica.add(perguntac);
						perguntas.listarMatematica();
					}

				}
				if (ce.equals("excluir")) {

					if (especializacao.equals("historia")) {

						perguntas.listarHistoria();
						System.out.print("Qual questão você gostaria de excluir: ");
						int op = sc.nextInt();
						perguntas.listaHistoria.remove(op - 1);
						perguntas.listarHistoria();
					} else if (especializacao.equals("portugues")) {

						perguntas.listarPortugues();
						System.out.print("Qual questão você gostaria de excluir: ");
						int op = sc.nextInt();
						perguntas.listaPortugues.remove(op - 1);
						perguntas.listarPortugues();
					} else if (especializacao.equals("matematica")) {

						perguntas.listarMatematica();
						System.out.print("Qual questão você gostaria de excluir: ");
						int op = sc.nextInt();
						perguntas.listaMatematica.remove(op - 1);
						perguntas.listarMatematica();
					}

				}
				System.out.println("Deseja continuar: \n1-sim \n0-não");
				opcao = sc.nextInt();
				

			} while (opcao != 0);
		}
	}
}
