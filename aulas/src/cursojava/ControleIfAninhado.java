package cursojava;

import java.util.Scanner;

public class ControleIfAninhado {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite um valor de 0 a 100: ");
		int valor = scan.nextInt();
		
		// valor <=25 -- valor < 50 > 25 -- valor > 50 < 75 -- valor >=75
		if(valor <= 25) {
			System.out.println("valor menor que 25!");
			
		}else if(valor > 25 && valor < 50) {
			System.out.println("valor entre 25 e 50!");
			
		}else if(valor > 50 && valor < 75) {
			System.out.println("valor entre 50 e 75!");
			
		}else if(valor > 75 && valor < 100) {
			System.out.println("valor entre 75 e 100!");
			
		}else {
			System.out.println("VALOR MAIOR QUE 100!");
		}

}
}
