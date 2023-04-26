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

		if (confirma) {
			System.out.println("Ok");

		} else {
			System.out.println("Carácter fora da cadeia binária");

		}

		leia.close();
	}

	static boolean verifica(String caracter) {

		if (caracter.matches("[0-1]*")) {
			return true;

		} else {
			return false;
		}
	}
}
