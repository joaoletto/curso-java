/*
 * AULA 15 - 10 - Faça um Programa que pergunte em que turno você estuda. Peça
				  para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
				  mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
				  Inválido!", conforme o caso.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_10_TurnoEstuda {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que você estuda: ");
		String turno = scan.next();
		
		switch (turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("VALOR INVALIDO");
		}

}
}
