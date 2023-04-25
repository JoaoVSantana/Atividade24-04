package Lista2;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double temperatura, celsius;

		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		temperatura = leia.nextDouble();

		celsius = conversao(temperatura);
		System.out.println("A temperatuira em graus Celsius é de " + celsius + " °C");

		leia.close();
	}

	static double conversao(double temperatura) {
		
		double celsius;
		
		celsius =  0.55 * (temperatura - 32);
		
		return celsius;

	}
}
