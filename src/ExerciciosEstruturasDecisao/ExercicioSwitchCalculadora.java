package ExerciciosEstruturasDecisao;

import java.util.Scanner;

public class ExercicioSwitchCalculadora {

	public static void main(String[] args) {
		 
		//Variaveis
		float num1;
		float num2;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite um numero: ");
		num1 = leia.nextFloat();
		System.out.println("Digite outro numero: ");
		num2 = leia.nextFloat();
		System.out.println("Digite o numero da operação");
		operacao = leia.nextInt();
		
		
		//Processamento e saída 
		switch(operacao) {
		case 1:
			System.out.println("Total: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Total: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Total: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Total: " + (num1 / num2));
			break;
			default:
				System.out.println("Operação invalida.");
			
		}

	}

}
