/*
 * AULA 05 -  Fa�a um Programa que converta metros para cent�metros.
 */

package exercicios;

import java.util.Scanner;

public class Aula05MetroCentimetro {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros: ");
		float vmetro = scan.nextFloat();
		
		float convertecm = (vmetro * 100);
		
		System.out.println("O Valor em centimetros �: " + convertecm);

	}

}
