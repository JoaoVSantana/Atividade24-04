package Lista2;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int base, exp;
		
		System.out.println("Digite o n�mero para a base da pot�ncia: ");
		base = leia.nextInt();
		
		System.out.println("Digite o n�mero para o expoente da pot�ncia: ");
		exp = leia.nextInt();
		
		base = potencia(base, exp);
		System.out.println("O resultado da potencia��o � " + base);
		
		leia.close();
	}

	static int potencia (int base, int exp) {
		int aux = base;
		
		for(int cont = 1; cont < exp; cont ++) {
			base = base * aux;
		}
		
		return base;
	}
}
