/*
 * AULA 08 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. 
 */


package exercicios;

import java.util.Scanner;

public class Aula08SalarioMes {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double vhora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha por dia? ");
		double horasTrabalhadas = scan.nextDouble();
			
		double salarioMes = (double) (vhora * horasTrabalhadas * 30);
		
		System.out.println("Seu salario mensal é: " + salarioMes);

	}

}
