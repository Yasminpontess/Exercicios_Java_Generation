package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExerciciosStack2 {

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Boolean sairPrograma = false;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("______________________________________\n");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("______________________________________");

			System.out.println("Digite a opção desejava:");
			int opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite um Nome:");
				String livrosB = entrada.nextLine();
				livros.push(livrosB);

				System.out.println("Pilha:\n");
				Iterator<String> iterator = livros.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nLivro Adicionado!");
				break;

			case 2:
				if (livros.isEmpty()) {
					System.out.println("Lista de Livros na Pilha:\n");
					System.out.println("Lista vazia!");
				} else {
					System.out.println("Lista de Livros na Pilha: \n");
					for (String lista : livros) {
						System.out.println(lista);
					}
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("Pilha: ");
					for (String lista : livros) {
						System.out.println(lista);
					}
					System.out.println("\nO Livro foi retirado !");
				}
				break;
			case 0:
				sairPrograma = true;
				System.out.println("Programa Finalizado !");
				break;

			default:
				System.out.println("Opção invalida!!! Digite um numero do menu...");
				break;
			}
		} while (!sairPrograma);

	}

}
