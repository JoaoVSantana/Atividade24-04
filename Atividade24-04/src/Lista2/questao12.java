package Lista2;

import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		
		System.out.println("Digite o nome completo: ");
		nome = leia.nextLine();
		
		System.out.println(sobrenome(nome));
		
		leia.close();

	}
	
	static String sobrenome (String nome) {
		nome = nome.split(" ")[nome.split(" ") .length - 1];
		
		return nome;
	}

}
