/*
 * AULA 11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
				- O produto do dobro do primeiro com metade do segundo .
	 			- A soma do triplo do primeiro com o terceiro.
	 			- O terceiro elevado ao cubo.
 */

package exercicios;

import java.util.Scanner;

public class Aula11NumeroReal {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double nreal = scan.nextDouble();
		
		//O produto do dobro do primeiro com metade do segundo
		int calc1 = ((num1*2)+(num2/2));
		
		//A soma do triplo do primeiro com o terceiro
		double calc2 = (num1 * 3 + nreal);
		
		//O terceiro elevado ao cubo
		double calc3 = (nreal * 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + calc1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + calc2);
		System.out.println("O terceiro elevado ao cubo é: " + calc3);

	}

}
