package Lista2;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println(calculo(num1,num2));
		
		leia.close();
	}
	static int calculo (int num1, int num2) {
		int aux = num1;
		
		for(int cont = 1; cont < num2; cont ++) {
			num1 = num1 + aux ;

		}
		return num1;
	}
}
