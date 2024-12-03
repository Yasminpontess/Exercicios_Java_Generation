package ExerciciosEstruturasDecisao;

import java.util.Scanner;

public class ExercicioImparPar {

	public static void main(String[] args) {

		// Variaveis
		int numero;

		Scanner leia = new Scanner(System.in);

		//Entrada
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();

		
		//Processamento e Saída 
		
		// IF (&&) para verificar se as duas condiçoes são verdadeiras.
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("Numero: " + numero + " Este numero é Par e Positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Numero: " + numero + " Este numero é Par e Negativo");
		} else if (numero % 2 != 0 && numero > 0 ) {
			System.out.println("Numero: " + numero + " Este numero é Ímpar e Positivo");
		} else {
			System.out.println("Numero: " + numero + " Este numero é Ímpar e Negativo");
		}

	}

}
