package ExerciciosEstruturasDecisao;

import java.util.Scanner;

public class ExercicioPedidos {

	public static void main(String[] args) {

		// Variaveis
		int codigo;
		int quantidade;

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite o codigo do produto: ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();

		// Processamento e saída
		switch (codigo) {
		case 1:
			System.out.println("Cachorro quente");
			System.out.println("Valor: 10,00");
			System.out.println("O valor total é:  " + 10.00f * quantidade);
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println("Valor: 15,00");
			System.out.println("O valor total é:  " + 15.00f * quantidade);
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println("Valor: 18,00");
			System.out.println("O valor total é:  " + 18.00f * quantidade);
			break;
		case 4:
			System.out.println("Bauru");
			System.out.println("Valor: 12,00");
			System.out.println("O valor total é:  " + 12.00f * quantidade);
			break;
		case 5:
			System.out.println("Refrigerante");
			System.out.println("Valor: 8,00");
			System.out.println("O valor total é:  " + 8.00f * quantidade);
			break;
		case 6:
			System.out.println("Suco de Laranja");
			System.out.println("Valor: 13,00");
			System.out.println("O valor é:  " + 13.00f * quantidade);
			break;
		default:
			System.out.println("Opção invalida.");
		}

	}

}
