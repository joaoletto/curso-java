package cursojava;

import java.util.Scanner;

public class ControleSwitchCase {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1-7: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Ter�a"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("S�bado"); break;
			default: System.out.println("N�o � um dia v�lido!");
		}

}
}
