package vetores;

import java.util.Scanner;

public class ExercicioVetores1 {

	public static void main(String[] args) {

		// Vetor
		int numero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numer2;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero que você deseja encontrar:  ");
		numer2 = leia.nextInt();

		for (int indice = 0; indice < 10; indice++) {
			if (numero[indice] == numer2) {
				System.out.println("O numero " + numer2 + " está localisado na posição: " + indice);
				encontrado = true;

			}

		}

		if (!encontrado) {
			System.out.println("Não foi encontrado!");

		}

	}

}
