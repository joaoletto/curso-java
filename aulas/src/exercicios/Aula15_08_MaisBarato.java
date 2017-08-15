/*
 * AULA 15 - 08 - Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_08_MaisBarato {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o preço 1: ");
		double preco1 = scan.nextDouble();
		
		System.out.println("Digite o preço 2: ");
		double preco2 = scan.nextDouble();
		
		System.out.println("Digite o preço 3: ");
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
