package exerciciosIntroducaoJava;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {

		// Variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;

		Scanner leia = new Scanner(System.in);

		// Entrada de Dados
		System.out.println("Digite a Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a Nota 4: ");
		nota4 = leia.nextFloat();

		// processamento
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Saída de dados
		System.out.printf("A media do aluno é: %.1f", media);

	}

}
