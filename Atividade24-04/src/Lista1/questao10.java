package Lista1;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;
		double altura, resultado;

		System.out.println("Opção de escolha do GEB: \n1- para homens \n2- para mulheres");
		opcao = leia.nextInt();

		System.out.println("Digite sua altura em metros: ");
		altura = leia.nextDouble();

		resultado = pesoIdeal(opcao, altura);
		System.out.println("O seu peso ideal é " + resultado + "Kg");
		
		leia.close();
	}

	static double pesoIdeal(int opcao, double altura) {
		double resultado;

		if (opcao == 1) {
			resultado = (72.7 * altura) - 58;

		} else if (opcao == 2) {
			resultado = (62.1 * altura) - 44.7;

		} else {
			resultado = 0;
		}

		return resultado;
	}
}
