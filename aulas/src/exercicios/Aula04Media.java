/*
 * AULA 04: Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

package exercicios;

import java.util.Scanner;

public class Aula04Media {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		int nota1 = scan.nextInt();
		
		System.out.println("Digite a nota 2: ");
		int nota2 = scan.nextInt();
		
		System.out.println("Digite a nota 3: ");
		int nota3 = scan.nextInt();
		
		System.out.println("Digite a nota 4: ");
		int nota4 = scan.nextInt();
		
		
		
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A media é: " + media);

	}

}
