package Lista2;

import java.util.Scanner;

public class questao13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String caracter;
		boolean confirma;

		System.out.println("Digite um car�cter bin�rio: ");
		caracter = leia.next();

		confirma = verifica(caracter);

		if (confirma) {
			System.out.println("Ok");

		} else {
			System.out.println("Car�cter fora da cadeia bin�ria");

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
