package Lista1;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		String mes = " ";
		
		System.out.println("Digite o número de um mês: ");
		numero = leia.nextInt();
		
		mes = Ano(numero);
		System.out.println("\n" + mes);
		
		leia.close();
	}
	static String Ano (int numero) {
		
		switch(numero) {
		
		case 1:
			return "Janeiro";
		
		case 2:
			return "Fevereiro";
		
		case 3:
			return "Março";
		
		case 4:
			return  "Abril";
			
		case 5:
			return  "Maio";
			
		case 6:
			return  "Junho";
			
		case 7:
			return  "Julho";
			
		case 8:
			return  "Agosto";
		
		case 9:
			return  "Setembro";
			
		case 10:
			return  "Outubro";
			
		case 11:
			return  "Novembro";
			
		case 12:
			return  "Dezembro";
			
		default:
			return "Número inválido";
		}
	}
	
}
