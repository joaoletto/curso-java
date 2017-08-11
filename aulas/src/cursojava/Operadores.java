package cursojava;

public class Operadores {

	public static void main(String[] args) {

		System.out.println("#### OPERADORES ARITMÉTICOS");
		System.out.println("ADIÇÃO        ==> + ");
		System.out.println("SUBTRAÇÃO     ==> - ");
		System.out.println("MULTIPLICAÇÃO ==> * ");
		System.out.println("DIVISÃO       ==> / ");
		System.out.println("MÓDULO        ==> % ");
		System.out.println("INCREMENTO    ==> ++ ");
		System.out.println("DECREMENTO    ==> -- ");
		System.out.println(" "); // GAMBIARRA PQ N SEI COMO SEPARAR AS LINHAS... HAHA
		
		System.out.println("#### OPERADORES RELACIONAIS");
		System.out.println("IGUAL A         ==> == ");
		System.out.println("DIFERENTE DE    ==> != ");
		System.out.println("MAIOR QUE       ==> > ");
		System.out.println("MENOR QUE       ==> < ");
		System.out.println("MAIOR OU IGUAL  ==> >= ");
		System.out.println("MENOR OU IGUAL  ==> <= ");
		System.out.println(" ");
		
		System.out.println("#### OPERADORES LÓGICOS");
		System.out.println("AND                 ==> & ");
		System.out.println("OR                  ==> | ");
		System.out.println("XOR                 ==> ^ ");
		System.out.println("OR curto circuito   ==> || ");
		System.out.println("AND curto circuito  ==> && ");
		System.out.println("NOT                 ==> ! ");
		System.out.println(" ");
		
		/* CURTO CIRCUITO ESTÁ RELACIONADO COM A EXECUÇÃO DO PROGRAMA
		 * É uma verificação de lógica relacionada com a tabela verdade
		 * se a primeira verificação é falsa o programa não executa a segunda verificação, pois mesmo
		 * que a segunda seja verdadeira, o resultado é falso. Isto é percebido no debug do programa.
		 */
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		System.out.println("#### OPERADORES DE PRECEDENCIA");
		System.out.println("..."); //completar a aula 14
		
	}

}
