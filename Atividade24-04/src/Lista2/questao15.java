package Lista2;

import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String caracter;
		boolean confirma = false;
		
		System.out.println("Digite um car�cter: ");
		caracter = leia.next();
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O car�cter digitado pertence ao alfabeto mai�sculo");
			
		} else {
			System.out.println("O car�cter digitado n�o pertence ao alfabeto mai�sculo");
		}
		
		leia.close();
	}
	
	static boolean verificacao(String caracter) {
		if(caracter.matches("[A-Z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
