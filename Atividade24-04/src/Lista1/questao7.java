package Lista1;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, resultado;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		resultado = fatorial(numero);
		System.out.println("O fatorial de " + numero + " é " + resultado);

		leia.close();
	}

	static int fatorial(int numero) {
		
		int resultado = numero;
		
		for(int cont = numero - 1; cont > 0; cont --) {
			resultado = resultado * cont;
		}
		
		return resultado;
	}
}
