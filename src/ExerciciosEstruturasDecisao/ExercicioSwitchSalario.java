package ExerciciosEstruturasDecisao;

import java.util.Scanner;

public class ExercicioSwitchSalario {

	public static void main(String[] args) {
		
		//Variaveis 
		String colaborador;
		int cargo;
		float salario;

	Scanner leia = new Scanner(System.in);
		
	System.out.println("Digite o Nome completo: ");
	colaborador = leia.nextLine();
	System.out.println("Digite o codigo de cargo: ");
	cargo = leia.nextInt();
	System.out.println("Digite o seu salario: ");
	salario = leia.nextFloat();
	
	
	switch(cargo) {
	case 1:
		System.out.println("Gerente");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.10 )));
		break;
	case 2:
		System.out.println("Vendedor");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.07 )));
		break;
	case 3:
		System.out.println("Supervisor");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.09 )));
		break;
	case 4:
		System.out.println("Motorista");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.06 )));
		break;
	case 5:
		System.out.println("Estoquista");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.05 )));
		break;
	case 6:
		System.out.println("Tecnico de TI");
		System.out.println("O seu novo salario com reajuste é: " + (salario + (salario * 0.08 )));
		break;
		default:
			System.out.println("Opção invalida: ");
	}
	}

}
