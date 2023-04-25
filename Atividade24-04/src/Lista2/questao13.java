package Lista2;

import java.util.Scanner;

public class questao13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String caracter;
		boolean confirma;

		System.out.println("Digite um carácter binário: ");
		caracter = leia.next();

		confirma = verifica(caracter);
		do {

			if (confirma) {
				System.out.println("Ok.\n Digite um caracter binário");
	

			} else {
				System.out.println("carácter fora da cadeia binária");
			
			}
		} while (caracter.matches("[0-1]*"));

		leia.close();
	}

	static boolean verifica(String caracter) {
//		do {

			if (caracter.matches("[0-1]*")) {
				return true;

			} else {
				return false;
			}
//		} while (caracter.matches("[0-1]*"));
	}
}
