/*
 * AULA 15 - 04 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_04_VogalConsoante {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		
		switch (letra) {
		case "a": 
		case "e": 
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("VOGAL"); break;
		default: System.out.println("CONSOANTE");
	}
		
		/*
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("VOGAL");
			
		}else {
			System.out.println("CONSOANTE");
		}*/

}
}
