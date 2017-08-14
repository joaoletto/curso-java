/*
 * AULA 09 - Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
C = (5 * (F-32) / 9).

 */

package exercicios;

import java.util.Scanner;

public class Aula09FarenheitCelcius {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double faren = scan.nextDouble();
		
		double celsius = (5 * (faren - 32) / 9);

		
		System.out.println("A temperatura em Celsius é: " + celsius);

	}

}
