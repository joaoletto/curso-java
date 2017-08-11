package cursojava;

// necessario para utilizar a classe Scanner
import java.util.Scanner;

public class LerDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite uma frase: ");
		String fraseLonga = scan.nextLine();
		System.out.println("A frase digitada foi: " + fraseLonga);
		
		System.out.println("Digite seu nome completo: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
				
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		*/
		
		
		/*
		// gerou um erro que ainda não sei o que é
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua idade é: " + altura);
		*/
		
		
		System.out.println("Digite seu nome e idade: ");
		String nome = scan.next();
		int idade = scan.nextInt();
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade: " + idade);
		
	} 
}