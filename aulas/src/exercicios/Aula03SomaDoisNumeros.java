/*
 * AULA 03 - Fa�a um Programa que pe�a dois n�meros e imprima a soma.
 * */


package exercicios;

import java.util.Scanner;

public class Aula03SomaDoisNumeros {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o numero 2: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos dois numeros �: " + soma);

	}

}
