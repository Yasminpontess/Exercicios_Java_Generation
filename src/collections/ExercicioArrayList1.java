package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Escreva uma Cor: ");
			String lista = leia.nextLine();
			cores.add(lista);

		}

		// for(each) para percorrer os vetores e listar um em baixo do outro
		System.out.println("\nLista de todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores); // ordenar as cores em ordem crescente
		System.out.println("\nCores por ordem crescente: ");
		for (String cor : cores) {
			System.out.println(cor);

		}

	}
}
