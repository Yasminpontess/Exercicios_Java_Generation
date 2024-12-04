package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ExercicioForMultiplos {

	public static void main(String[] args) {

		// Variaveis
		int num1, num2, inter;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();

		// processamento
		if (num1 > num2) {
			System.out.println("O primeiro numero não pode ser maior que o segundo numero! ");
		} else {

			for (inter = num1; inter < num2; inter++) {
				if (inter % 3 == 0 && inter % 5 == 0) {
					// saida
					System.out.println("Os multiplos do intervado entre o " + num1 + " e " + num2 + " é: " + inter);

				}
			}

		}

	}

}
