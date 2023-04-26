package Lista2;

import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char caracter;
		
		System.out.println("Digite um caracter: ");
		caracter = leia.next().charAt(0);
		
		System.out.println(aumenta(caracter));
		
		leia.close();
	}
	
	static char aumenta (char caracter) {
		
		return Character.toUpperCase(caracter);
		
	}
}
