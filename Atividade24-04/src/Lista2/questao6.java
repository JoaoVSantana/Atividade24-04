package Lista2;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String caracter;
		boolean confirma = false;
		
		System.out.println("Digite um carácter: ");
		caracter = leia.next();
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O carácter digitado pertence ao alfabeto minúsculo");
			
		} else {
			System.out.println("O carácter digitado não pertence ao alfabeto minúsculo");
		}
		
		leia.close();
	}
	
	static boolean verificacao(String caracter) {
		if(caracter.matches("[a-z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
