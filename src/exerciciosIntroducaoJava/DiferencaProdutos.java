package exerciciosIntroducaoJava;

import java.util.Scanner;

public class DiferencaProdutos {

	public static void main(String[] args) {
		
		//Variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float calculo;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite o o valor do produto 1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o o valor do produto 2: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o o valor do produto 3: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o o valor do produto 4: ");
		n4 = leia.nextFloat();
		
		//Processamento
		calculo = (n1*n2) - (n3*n4);
		
		
		//Saída de dados
		System.out.printf("O valor da diferença entre os produtos é: %.2f" , calculo);
	}

}
