/*
 * AULA 02 - Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi:
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
