package Lista_01;

import java.util.*;

public class questao04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = scan.nextInt();
		
		if (idade < 16) {
			System.out.println("Classificação: não eleitor");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Classificação: eleitor obrigatório");
		} else {
			System.out.println("Classificação: eleitor facultativo");
		}
	}

}
