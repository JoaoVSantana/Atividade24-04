package Lista1;

import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
			Scanner leia = new Scanner (System.in);
			
			int opcao, altura, idade;
			double peso, resultado;
			
			System.out.println("Opção de escolha do GEB: \n1- para homens \n2- para mulheres");
			opcao = leia.nextInt();
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite sua altura em centímetros: ");
			altura = leia.nextInt();
		
		System.out.println("Digite seu peso: ");
		peso = leia.nextDouble();
		
		resultado = GEB(opcao, idade, altura, peso);
		System.out.println("O Gasto de Energia Basal do indivíduo é " + resultado);
		
		leia.close();
	}
	static double GEB (int opcao, int idade, int altura, double peso) {
		
		double resultado;
		
		if(opcao == 1) {
			resultado = 66.47 + (13.75 * peso) + (5 * altura) - (6.76 * idade);
			
		} else if (opcao == 2) {
			resultado = 655.1 + (9.56 * peso) + (1.85 * altura) - (4.67 * idade);
		
		} else {
			resultado = 0;
		}
		
		return resultado;
	}
}
