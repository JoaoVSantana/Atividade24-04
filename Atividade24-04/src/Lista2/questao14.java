package Lista2;

import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
		
		String palavra;
		
		boolean confirma;

		System.out.println("Digite uma palavra: ");
		palavra = leia.next();
		
		String palindromo = new StringBuilder(palavra).reverse().toString();
		
		confirma = verifica(palavra, palindromo);
		
		if(confirma) {
			System.out.println("A palavra é um palíndromo!");
			
		} else {
			System.out.println("A palavra não é um palíndromo!");
		}
		
		leia.close();

	}
	static boolean verifica (String palavra, String palindromo) {
		if (palavra.equals(palindromo)) {
			return true;
			
		} else {
			return false;
		}
	}
}
