/*
 * AULA 15 - 02 - Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_02_PositivoNegativo {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um numero entre -100 e 100: ");
		double num = scan.nextDouble();
		
		if(num >= 0) {
			System.out.println("O numero " + num + " é POSITIVO");
			
		}else {
			System.out.println("NUMERO NEGATIVO");
			
		}
		
		
	}

}
