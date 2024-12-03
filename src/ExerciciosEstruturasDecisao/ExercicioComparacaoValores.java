package ExerciciosEstruturasDecisao;

import java.util.Scanner;

public class ExercicioComparacaoValores {

	public static void main(String[] args) {
		
		//Variaveis
		int A;
		int B;
		int C;
		int soma;
		
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o Valor A: ");
		A = leia.nextInt();
		System.out.println("Digite o Valor B: ");
		B = leia.nextInt();
		System.out.println("Digite o Valor C: ");
		C = leia.nextInt();
		
		soma = A + B;
		
		System.out.println("Valor da soma do Valor A + B: " + soma);
		System.out.println("Valor C: " + C);
		
		//Processamento e Saída 
		if (soma > C) {
			System.out.println("Valor de A + B é maior que C");
		} else if (soma < C) {
			System.out.println("Valor de A + B é menor que C");
		} else if (soma == C) {
			System.out.println("Valo de A + B é igual a C");
		}
		
		
	}

}
