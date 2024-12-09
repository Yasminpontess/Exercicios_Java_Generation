package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue1 {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		Integer operacao;
		boolean sairPrograma = false;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("______________________________________\n");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Clientes da Fila");
			System.out.println("0 - Sair");
			System.out.println("______________________________________");

			System.out.println("Digite o número da opção desejada: ");
			operacao = entrada.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Digite um Nome:");
				String listaClientes = entrada.next();
				clientes.add(listaClientes);

				System.out.println("Fila:\n");
				Iterator<String> iterator = clientes.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				if (clientes.isEmpty()) {
					System.out.println("Lista de Clientes na Fila:\n");
					System.out.println("Lista vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: \n");
					for (String lista : clientes) {
						System.out.println(lista);
					}
				}
				break;

			case 3:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					clientes.remove();
					System.out.println("Fila: ");
					for (String lista : clientes) {
						System.out.println(lista);
					}
					System.out.println("\nO Cliente foi Chamado!");
				}
				break;
			case 0:
				sairPrograma = true;
				System.out.println("Programa Finalizado !");
				break;

			default:
				System.out.println("Opção ivalida!!! Digite um numero do menu...");
				break;

			}
		} while (!sairPrograma);

	}

}
