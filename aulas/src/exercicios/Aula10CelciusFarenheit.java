/*
 * AULA 10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
F = ( C * 1,8 +32 ).
 */

package exercicios;

import java.util.Scanner;

public class Aula10CelciusFarenheit {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double celsius = scan.nextDouble();
		
		double faren = (celsius * 1.8 + 32);

		
		System.out.println("A temperatura em Farenheit é: " + faren);

	}

}
