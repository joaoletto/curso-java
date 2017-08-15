/*
 * AULA 15 - 03 - Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_03_MasculinoFeminino {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite M ou F: ");
		String letra = scan.next();
		
		//String � uma classe, por isso == n�o funciona para compara��o, a l�gica abaixo est� correta
		// mas existe outra forma de resolver a situa��o
		/*
		if (letra == "m") {
			System.out.println("MASCULINO");
			
		}else if (letra == "f") {
			System.out.println("FEMININO");
			
		}else {
			System.out.println("Esta letra n�o � v�lida");
		}*/
		
		if (letra.equalsIgnoreCase("m")) {
			System.out.println("MASCULINO");
			
		}else if (letra.equalsIgnoreCase("f")) {
			System.out.println("FEMININO");
			
		}else {
			System.out.println("SEXO INVALIDO");
	}

}
}
