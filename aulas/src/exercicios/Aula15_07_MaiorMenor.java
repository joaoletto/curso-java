/*
 * AULA 15 - 07 - Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

package exercicios;

import java.util.Scanner;

public class Aula15_07_MaiorMenor {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o numero 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o numero 3: ");
		int num3 = scan.nextInt();
		
		//verifica numero maior
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
			
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
			
		}else if (num3 >= num1 && num3 >= num2){
			System.out.println(num3);
			
		}
		
		//verifica numero menor
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1);
			
		}else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2);
			
		}else if (num3 <= num1 && num3 <= num2){
			System.out.println(num3);
			
		}
		

}
}
