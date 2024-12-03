package exerciciosIntroducaoJava;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novoSalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digote o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salario a ser depositado é: " + novoSalario);

	}

}
