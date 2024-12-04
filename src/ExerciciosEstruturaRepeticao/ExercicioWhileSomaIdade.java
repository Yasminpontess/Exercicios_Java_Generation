package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercicioWhileSomaIdade {

	public static void main(String[] args) {

		// Variaveis
		int pessoas = 1;
		int menores = 0;
		int maiores = 0;

		Scanner leia = new Scanner(System.in);

		// Entrada e processamento
		while (!(pessoas <= (0))) {
			System.out.println("Digite uma idade: ");
			pessoas = leia.nextInt();

			if (pessoas >= 1 && pessoas <= 21) {
				menores++;

			} else if (pessoas >= 50) {
				maiores++;

			}
		}

		// Saída de dados
		System.out.println("\nO total de pessoas menores de 21 anos: " + menores);
		System.out.println("O total de Pessoas maiores de 50: " + maiores);

	}

}
