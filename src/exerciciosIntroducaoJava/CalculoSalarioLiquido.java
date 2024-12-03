package exerciciosIntroducaoJava;

import java.util.Scanner;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {

		// Variaveis

		float salarioBruto;
		final float ADICIONALNOTURNO = 500.00f;
		float horaExtra;
		float descontos;
		float salarioLiquido;

		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite o Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite as Horas extras: ");
		horaExtra = leia.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();

		// processamento
		salarioLiquido = salarioBruto + ADICIONALNOTURNO + (horaExtra * 5) - descontos;

		// Saída de dados

		System.out.printf("O total do salario Liquido é: %.2f", salarioLiquido);

	}

}
