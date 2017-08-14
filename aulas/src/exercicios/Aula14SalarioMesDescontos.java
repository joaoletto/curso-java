/*
 * AULA 14 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
 * 			 no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
 * 			 descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
 * 			 faça um programa que nos dê os descontos e o salário líquido, conforme a tabela abaixo:
				+ Salário Bruto : R$
				- IR (11%) : R$
				- INSS (8%) : R$
				- Sindicato ( 5%) : R$
				= Salário Liquido : R$
			 Obs.: Salário Bruto - Descontos = Salário Líquido. 
 */


package exercicios;

import java.util.Scanner;

public class Aula14SalarioMesDescontos {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double vhora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha por dia? ");
		double horasTrabalhadas = scan.nextDouble();
			
		double salarioMes = (vhora * horasTrabalhadas * 30);
		
		double impRenda = (salarioMes * 11 / 100);
		double inss = (salarioMes * 8 / 100);
		double sind = (salarioMes * 5 / 100);
		
		double descontos = impRenda + inss + sind;
		double salarioLiquido = salarioMes - descontos;
		
		System.out.println("Desconto IR de 11%: " + impRenda);
		System.out.println("Desconto INSS de 8%: " + inss);
		System.out.println("Desconto Sindicato de 5%: " + sind);
		
		System.out.println("\nSalario Bruto: " + salarioMes);
		System.out.println("Salario Liquido: " + salarioLiquido);
		System.out.println("Total de Descontos: " + descontos);

	}

}
