package Lista2;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char caracter;
		boolean confirma = false;
		
		System.out.println("Digite um car�cter: ");
		caracter = leia.next().charAt(0);
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O car�cter digitado � um n�mero");
			
		} else {
			System.out.println("O car�cter digitado n�o � um n�mero");
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
