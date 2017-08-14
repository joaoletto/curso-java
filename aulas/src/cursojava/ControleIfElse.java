package cursojava;

import java.util.Scanner;

public class ControleIfElse {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade!");
		}else {
			System.out.println("Menor de idade!");
		}

}
}
