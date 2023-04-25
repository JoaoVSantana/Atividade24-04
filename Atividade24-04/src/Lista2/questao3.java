package Lista2;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int base, exp;
		
		System.out.println("Digite o número para a base da potência: ");
		base = leia.nextInt();
		
		System.out.println("Digite o número para o expoente da potência: ");
		exp = leia.nextInt();
		
		base = potencia(base, exp);
		System.out.println("O resultado da potenciação é " + base);
		
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
