/*
 * AULA 11 - Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
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
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um n�mero real: ");
		double nreal = scan.nextDouble();
		
		//O produto do dobro do primeiro com metade do segundo
		int calc1 = ((num1*2)+(num2/2));
		
		//A soma do triplo do primeiro com o terceiro
		double calc2 = (num1 * 3 + nreal);
		
		//O terceiro elevado ao cubo
		double calc3 = (nreal * 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + calc1);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + calc2);
		System.out.println("O terceiro elevado ao cubo �: " + calc3);

	}

}
