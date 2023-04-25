package Lista1;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int posicao, atual;
		
		System.out.println("Digite uma posição da sequência de Fibonacci: ");
		posicao = leia.nextInt();
		
		atual = fibonacci(posicao);
		System.out.println("o número nessa posição é: " + atual);
		
		leia.close();
	}
	static int fibonacci (int posicao) {
		int atual = 1, anterior = 0, aux;

		for (int cont = 1; cont < posicao; cont++) {
			aux = atual;
			atual += anterior;
			anterior = aux;
		}

		return atual;
	}
}
