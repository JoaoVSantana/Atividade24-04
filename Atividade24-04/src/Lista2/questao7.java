package Lista2;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char caracter;
		boolean confirma = false;
		
		System.out.println("Digite um carácter: ");
		caracter = leia.next().charAt(0);
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O carácter digitado é um número");
			
		} else {
			System.out.println("O carácter digitado não é um número");
		}
		
		leia.close();
	}
	
	static boolean verificacao(char caracter) {
		if(Character.toString(caracter).matches("[0-9]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
