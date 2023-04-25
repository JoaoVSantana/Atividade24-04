package Lista2;

import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String caracter;
		
		System.out.println("Digite um caracter: ");
		caracter = leia.next();
		
		System.out.println(aumenta(caracter));
		
		leia.close();
	}
	
	static String aumenta (String caracter) {
		caracter = caracter.toUpperCase();
		
		return caracter;
	}
}
