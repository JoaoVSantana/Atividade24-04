package Lista1;

import java.util.Scanner;

public class questao3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		boolean confirma;

		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		confirma = parImpar(numero);

		if (confirma) {
			System.out.println("O n�mero " + numero + " � par");

		} else {
			System.out.println("O n�mero " + numero + " � �mpar");
		}

	}

	static boolean parImpar(int numero) {
		if (numero % 2 == 1) {
			return false;

		} else {
			return true;
		}
	}
}
