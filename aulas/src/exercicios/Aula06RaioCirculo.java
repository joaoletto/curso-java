/*
 * AULA 05 - Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
 */

package exercicios;

import java.util.Scanner;

public class Aula06RaioCirculo {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double circunferencia = (double) (raio * raio * 3.14);
		
		System.out.println("A �rea da Circunferencia �: " + circunferencia);

	}

}
