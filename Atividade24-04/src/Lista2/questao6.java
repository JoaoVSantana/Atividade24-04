package Lista2;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char caracter;
		boolean confirma = false;
		
		System.out.println("Digite um car�cter: ");
		caracter = leia.next().charAt(0);
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("O car�cter digitado pertence ao alfabeto min�sculo");
			
		} else {
			System.out.println("O car�cter digitado n�o pertence ao alfabeto min�sculo");
		}
		
		leia.close();
	}
	
	static boolean verificacao(char caracter) {
		if(Character.toString(caracter).matches("[a-z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}
