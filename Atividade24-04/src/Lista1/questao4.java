package Lista1;

import java.util.Scanner;

public class questao4 {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		boolean confirma;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		
		confirma = Multiplo(num1, num2);
		if(confirma) {
			System.out.println("O n�mero " + num1 + " � m�ltiplo de " + num2);	
			
		} else {
			System.out.println("O n�mero " + num1 + " n�o � m�ltiplo de " + num2);
		}
		
		leia.close();
	}
	
	static boolean Multiplo (int num1, int num2) {
		
		if(num1 % num2 == 1) {
			
			return false;
			
		} else {
			 return true;
		}
	}
}
