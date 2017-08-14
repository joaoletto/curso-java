/*
 * AULA 07 - Faça um Programa que calcule a área de um quadrado, em seguida mostre 
 * 			 o dobro desta área para o usuário.
 */

package exercicios;

import java.util.Scanner;

public class Aula07AreaQuadrado {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double areaquadrado = (double) (lado * lado);
		double dobro = (double) (areaquadrado * 2);
		
		System.out.println("A área do quadrado é: " + areaquadrado);
		System.out.println("o dobro da área é: " + dobro);

	}

}
