/*
 * AULA 13 - Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo 
 * 			 que calcule seu peso ideal, utilizando as seguintes fórmulas:
					Para homens: (72.7*h) - 58
					Para mulheres: (62.1*h) - 44.7 (h = altura)
 */

package exercicios;

import java.util.Scanner;

public class Aula13AlturaSexo {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite a altura da pessoa: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal para a pessoa é: " + pesoIdeal);

	}

}
