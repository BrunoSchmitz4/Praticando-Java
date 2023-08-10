package Lista_01;

import java.util.*;

public class questao05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int soma_calorias = 0;
		System.out.println("Vamos ajudá-lo a saber quantas calorias sua refeição terá: \nEscolha uma das opções abaixo:");
		
		System.out.println("(1) - Vegetariano | (2) - Peixe | (3) - Frango | (4) - Carne");
		
		int option1 = scan.nextInt();
		
		if (option1 == 1) {
			soma_calorias += 180;
		} else if (option1 == 2) {
			soma_calorias += 230;
		} else if (option1 == 3) {
			soma_calorias += 250;
		} else if (option1 == 4) {
			soma_calorias += 350;
		}
		
		System.out.println("(1) - Abacaxi | (2) - Sorvete diet | (3) - Mouse diet | (4) - Mouse chocolate");
		
		int option2 = scan.nextInt();
		
		if (option2 == 1) {
			soma_calorias += 75;
		} else if (option2 == 2) {
			soma_calorias += 110;
		} else if (option2 == 3) {
			soma_calorias += 170;
		} else if (option2 == 4) {
			soma_calorias += 200;
		}
		
		System.out.println("(1) - Chá | (2) - Suco de Laranja | (3) - Suco de Limão | (4) - Refrigerante diet");
		
		int option3 = scan.nextInt();
		
		if (option3 == 1) {
			soma_calorias += 20;
		} else if (option3 == 2) {
			soma_calorias += 70;
		} else if (option3 == 3) {
			soma_calorias += 100;
		} else if (option3 == 4) {
			soma_calorias += 65;
		}
		
		System.out.println("Sua refeição terá " + soma_calorias + " calorias");
		
	}

}
