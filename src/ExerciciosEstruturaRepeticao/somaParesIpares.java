package ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class somaParesIpares {

	public static void main(String[] args) {

		// Variaveis
		int numero = 1, i, par = 0, impar = 0;
		

		Scanner leia = new Scanner(System.in);

		// Entrada e Processamento
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
				System.out.println(numero + " Este numero é Par!");
			} else if (numero % 2 != 0) {
				impar++;
				System.out.println(numero + " Esse numero é Impar");
			}

		}

		// Saída de dados
		System.out.println("O total de numeros Impares é: " + impar);
		System.out.println("O total de numeros Pares é: " + par);

	}

}
