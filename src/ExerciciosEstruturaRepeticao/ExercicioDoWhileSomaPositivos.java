package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercicioDoWhileSomaPositivos {

	public static void main(String[] args) {

		// Variaveis
		int numero, soma = 0, i;

		// Entrada e processamento
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		// Saída de dados
		System.out.println("A soma de todos os numeros positivos é: " + soma);
	}

}
