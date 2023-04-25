package Lista1;

import java.util.Scanner;

public class questao1 {

	static int numero;
	static Scanner leia = new Scanner (System.in); 
		
	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		tabuada();
	}
	
	static void tabuada () {
		
		int resultado;
		
		for(int cont = 1; cont <= 10; cont ++) {
		
			resultado = numero * cont;
			System.out.println(numero + " * " + cont + " = " + resultado + "\n");
		}
	}
	
}
