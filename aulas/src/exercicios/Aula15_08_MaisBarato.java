/*
 * AULA 15 - 08 - Fa�a um programa que pergunte o pre�o de tr�s produtos e informe
qual produto voc� deve comprar, sabendo que a decis�o � sempre
pelo mais barato.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_08_MaisBarato {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o pre�o 1: ");
		double preco1 = scan.nextDouble();
		
		System.out.println("Digite o pre�o 2: ");
		double preco2 = scan.nextDouble();
		
		System.out.println("Digite o pre�o 3: ");
		double preco3 = scan.nextDouble();
		
		//verifica numero maior
		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println(preco1);
			
		}else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println(preco2);
			
		}else if (preco3 <= preco1 && preco3 <= preco2){
			System.out.println(preco3);	
		}
		
	

}
}
