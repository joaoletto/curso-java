/*
 * AULA 08 - Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s. 
 */


package exercicios;

import java.util.Scanner;

public class Aula08SalarioMes {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double vhora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha por dia? ");
		double horasTrabalhadas = scan.nextDouble();
			
		double salarioMes = (double) (vhora * horasTrabalhadas * 30);
		
		System.out.println("Seu salario mensal �: " + salarioMes);

	}

}
