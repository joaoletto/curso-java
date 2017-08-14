/*
 * AULA 05 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

package exercicios;

import java.util.Scanner;

public class Aula06RaioCirculo {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double circunferencia = Math.PI * Math.pow (raio, 2);
		// não há problema em fazer desta forma, mas existe a classe math para isto
		//double circunferencia = (double) (raio * raio * 3.14);
		
		System.out.println("A área da Circunferencia é: " + circunferencia);

	}

}
