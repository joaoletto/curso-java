/*
 * AULA 15 - Faça um programa para uma loja de tintas. O programa deverá pedir 
 * 			 o tamanho em metros quadrados da área a ser pintada. 
 * 			 Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que 
 * 			 a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
 * 			 Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 * 				
 * 				metrosPintar / 54 (54= 1 lata 18 litros                //1 lata pinta 54m2
 * 				precoTotal = metrosPintar * 80
 */

package exercicios;

import java.util.Scanner;

public class Aula15CompraTintas {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe a area a pintar em metro quadrado: ");
		double metrosPintar = scan.nextDouble();
		
		double tinta = (metrosPintar / 54);
		double precoTotal = (tinta * 80);

		System.out.println("Serão necessários " + tinta + " litros de tinta.");
		System.out.println("O preço total é: " + precoTotal);

	}

}
