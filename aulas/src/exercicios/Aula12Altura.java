/*
 * AULA 12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule
 * 			 seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 */

package exercicios;

import java.util.Scanner;

public class Aula12Altura {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite a altura da pessoa: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal para a pessoa é: " + pesoIdeal);

	}

}
