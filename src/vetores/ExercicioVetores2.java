package vetores;

import java.util.Scanner;

public class ExercicioVetores2 {

	public static void main(String[] args) {

		int num[] = new int[10];
		int par, impar, indice, soma = 0;
		double media = 0;

		Scanner leia = new Scanner(System.in);

		for (indice = 0; indice < 10; indice++) {
			System.out.println("Digite um numero: ");
			num[indice] = leia.nextInt();
			soma += num[indice];

		}

		System.out.println("Os numeros Pares digitado: ");
		for (indice = 0; indice < 10; indice++) {
			if (num[indice] % 2 == 0) {
				par = num[indice];
				System.out.println(par);

			}

		}
		System.out.println("Os numeros Imapres digitado: ");
		for (indice = 0; indice < 10; indice++) {
			if (num[indice] % 2 != 0) {
				impar = num[indice];
				System.out.println(impar);

			}
		}

		System.out.println("A soma dos valores digitado: " + soma);
		System.out.println("A media dos numeros digitados: " + soma / 10d);

	}
}
