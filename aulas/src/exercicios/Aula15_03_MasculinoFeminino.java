/*
 * AULA 15 - 03 - Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_03_MasculinoFeminino {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite M ou F: ");
		String letra = scan.next();
		
		//String é uma classe, por isso == não funciona para comparação, a lógica abaixo está correta
		// mas existe outra forma de resolver a situação
		/*
		if (letra == "m") {
			System.out.println("MASCULINO");
			
		}else if (letra == "f") {
			System.out.println("FEMININO");
			
		}else {
			System.out.println("Esta letra não é válida");
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
