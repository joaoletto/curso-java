/*
 * AULA 07 - Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre 
 * 			 o dobro desta �rea para o usu�rio.
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
		
		System.out.println("A �rea do quadrado �: " + areaquadrado);
		System.out.println("o dobro da �rea �: " + dobro);

	}

}
