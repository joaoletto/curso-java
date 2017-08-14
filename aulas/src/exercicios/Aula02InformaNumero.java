/*
 * AULA 02 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi:
 * */

package exercicios;

import java.util.Scanner;

public class Aula02InformaNumero {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		System.out.println("O numero digitado foi: " + numero);

	}

}
