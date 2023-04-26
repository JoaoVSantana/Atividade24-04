package Lista2;

import java.util.Scanner;

public class questao14v2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String palavra;
		boolean confirma;

		System.out.println("Digite uma palavra: ");
		palavra = leia.next();
		
		confirma = Palindromo(palavra);
		
		if (!confirma) {
			System.out.println("A palavra n�o � um pal�ndromo!");
			
		} else {
			System.out.println("A palavra � um pal�ndromo!");
			
		}
	}
	static boolean Palindromo (String palavra) {
		for(int cont = 0; cont < palavra.length() / 2; cont++) {
			if(palavra.charAt(cont) != palavra.charAt(palavra.length() -1 - cont)) {
				return false;	
			}
		}
		return true;
	}
}
