/*
 * AULA 15 - 01 - Faça um Programa que peça dois números e imprima o maior deles.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_01_NumeroMaior {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
			
		}else {
			System.out.println(num2);
			
		}
		
		
	}

}
