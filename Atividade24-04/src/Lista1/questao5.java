package Lista1;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int ano;
		boolean confirma;
		
		System.out.println("Digite o n�mero de um ano: ");
		ano = leia.nextInt();
		
		confirma = Bissexto(ano);
		if(confirma) {
			System.out.println(ano + " � um ano bissexto!");
		
		} else {
			System.out.println(ano + " n�o � um ano bissexto!");
		}
		
		leia.close();
	}

	static boolean Bissexto (int ano) {
		if(ano % 4 == 0 && ano % 100 != 100 || ano % 400 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
}
