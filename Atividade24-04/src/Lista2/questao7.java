package Lista2;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String caracter;
		boolean confirma = false;
		
		System.out.println("Digite um car�cter: ");
		caracter = leia.next();
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O car�cter digitado � um algarismo");
			
		} else {
			System.out.println("O car�cter digitado n�o � um algarismo");
		}
		
		leia.close();
	}
	
	static boolean verificacao(String caracter) {
		if(caracter.matches("[0-9]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
