package Lista2;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char caracter;
		boolean confirma = false;
		
		System.out.println("Digite um carácter: ");
		caracter = leia.next().charAt(0);
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O carácter digitado pertence ao alfabeto maiúsculo");
			
		} else {
			System.out.println("O carácter digitado não pertence ao alfabeto maiúsculo");
		}
		
		leia.close();
	}
	
	static boolean verificacao(char caracter) {
		if(Character.toString(caracter).matches("[A-Z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
