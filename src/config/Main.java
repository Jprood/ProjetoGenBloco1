package config;

import entidades.Aluno;
import entidades.Perguntas;
import entidades.Professor;
import entidades.Usuario;
import mock.PerguntasMock;
import tela.UtilMenu;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
    	//Definindo atributos
        Scanner sc = new Scanner(System.in);
        PerguntasMock perguntas = new PerguntasMock();
        int opcao;
        String nomeInstituicao="X";
        int idade=0;
        //Escopo do menu de abertura
        UtilMenu.abertura();//Metodo estatico
        UtilMenu.separador();

        
        // cadastro
        System.out.print("Digite seu nome ou entrar como visitante: ");
        String nome = sc.nextLine();

        if (!nome.equals("visitante")) {

            System.out.print("Digite o nome da sua instituicao de ensino: ");
            nomeInstituicao = sc.nextLine();
        }else{
            nome = "visitante";
            nomeInstituicao = "X";
        }

        System.out.print("Entrar como aluno ou professor? ");
        String alunoProfessor = sc.nextLine();

        while (!alunoProfessor.equals("aluno") && !alunoProfessor.equals("professor")) {
            System.out.println("Opcao invalida, escreva se Ã© aluno ou professor!");
            System.out.print("Voce e aluno ou professor? ");
            alunoProfessor = sc.nextLine();
        }

        // Menu Aluno

        if (alunoProfessor.equals("aluno")) {

            if (!nome.equals("visitante")) {
                System.out.print("Qual a sua idade? ");
                idade = sc.nextInt();
                
             
                sc.nextLine();

                Usuario aluno = new Aluno(nome, nomeInstituicao, idade);
            }
                Usuario aluno = new Aluno(nome,nomeInstituicao);


            do {

                UtilMenu.separador();
                UtilMenu.limpaTela();

                System.out.print("Escolha a materia (portugues) (matematica) (historia): ");
                String materia = sc.nextLine();

                while (!materia.equals("historia") && !materia.equals("portugues") && !materia.equals("matematica")) {
                    System.out.println("Opcao invÃ¡lida");
                    System.out.print("Escolha a materia: ");
                    materia = sc.nextLine();
                }

                if (materia.equals("historia")) {

                    perguntas.responderHistoria();
                } else if (materia.equals("portugues")) {

                    perguntas.responderPortugues();
                } else if (materia.equals("matematica")) {

                    perguntas.responderMatematica();
                }

                System.out.println("Deseja continar a estudar? \n1-sim \n0-nao:");
                opcao = sc.nextInt();
                sc.nextLine();

            } while (opcao != 0);
            aluno.agradecer();
        }
        // Menu Professor
        if (alunoProfessor.equals("professor")) {

            System.out.print("Qual sua Especializacao?(historia, portugues, matematica):  ");
            String especializacao = sc.nextLine();


            while (!especializacao.equals("historia") && !especializacao.equals("portugues") && !especializacao.equals("matematica")) {
                System.out.println("Opcao invalida!");
                System.out.print("Qual sua Especializacao?(historia, portugues, matematica):  ");
                especializacao = sc.nextLine();
            }
            
            Usuario prof = new Professor(nome, nomeInstituicao, especializacao);

            do {
            	//Criação de perguntas
                UtilMenu.separador();
                UtilMenu.limpaTela();
                System.out.println("Voce deseja Criar uma Pergunta ou Excluir? (criar,excluir) :");
                String ce = sc.nextLine();

                while (!ce.equals("criar") && !ce.equals("excluir")) {
                    System.out.println("Opcao invalida!");
                    System.out.println("Voce deseja Criar uma Pergunta ou Excluir? (criar,excluir) :");
                    ce = sc.nextLine();
                }

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
                    System.out.println("Escreva a alternativa da resposta correta (a,b,c,d): ");
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

                }//Metodo para evitar ou repaginar possiveis erros
                if (ce.equals("excluir")) {

                    if (especializacao.equals("historia")) {

                        perguntas.listarHistoria();
                        try {// ao inves do erro de index, aparecera essa forma de maior entendimento
                            System.out.print("Qual questao voce gostaria de excluir: ");
                            int op = sc.nextInt();
                            perguntas.listaHistoria.remove(op - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Erro, nao ha o que excluir");
                        }
                        perguntas.listarHistoria();
                    } else if (especializacao.equals("portugues")) {

                        perguntas.listarPortugues();
                        try {
                            System.out.print("Qual questao voce gostaria de excluir: ");
                            int op = sc.nextInt();
                            perguntas.listaPortugues.remove(op - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Erro, nao ha o que excluir");
                        }
                        perguntas.listarPortugues();
                    } else if (especializacao.equals("matematica")) {

                        perguntas.listarMatematica();
                        try {
                            System.out.print("Qual questao voce gostaria de excluir: ");
                            int op = sc.nextInt();
                            perguntas.listaMatematica.remove(op - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Erro, nao ha o que excluir");
                        }
                        perguntas.listarMatematica();
                    }

                }
                //Metodo agradecer, repete ou encerra 
                System.out.println("Deseja continuar: \n1-sim \n0-nao");
                opcao = sc.nextInt();
                sc.nextLine();

            } while (opcao != 0);
            prof.agradecer();
        }
    }
}
