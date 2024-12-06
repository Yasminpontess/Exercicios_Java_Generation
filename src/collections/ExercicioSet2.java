package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet2 {

	public static void main(String[] args) {
	
		Set<Integer> setNumeros = new HashSet<Integer>();

		boolean encontrado = false;
		Integer num;

		Scanner leia = new Scanner(System.in);

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		System.out.println("Digite um numero que você deseja encontrar:  ");
		num = leia.nextInt();

		for (Integer numeros : setNumeros) {
			if (numeros == num) {
				System.out.println("O numero " + num + " foi encontrado. ");
				encontrado = true;
			}

		}

		if (!encontrado) {
			System.out.println("Não foi encontrado!");

		}

	}

}
