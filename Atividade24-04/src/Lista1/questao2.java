package Lista1;

import java.util.Scanner;

public class questao2 {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		int resultado = absoluto(numero);
		System.out.println("O valor absoluto de " + numero + " � " + resultado);
		
		
		
	}
	
	static int absoluto (int numero) {
		int resultado = numero;
		
		if(numero < 0) {
			resultado = numero * 1;
		}
		
		return resultado;
	}

}
