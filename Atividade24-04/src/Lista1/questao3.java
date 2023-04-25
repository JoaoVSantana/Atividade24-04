package Lista1;

import java.util.Scanner;

public class questao3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		boolean confirma;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		confirma = parImpar(numero);

		if (confirma) {
			System.out.println("O número " + numero + " é par");

		} else {
			System.out.println("O número " + numero + " é ímpar");
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
