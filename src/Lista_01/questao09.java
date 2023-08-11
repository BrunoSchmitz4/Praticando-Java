package Lista_01;

import java.util.*;

public class questao09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira o 1° valor: ");
		int num1 = scan.nextInt();
		
		System.out.println("Insira o 2° valor: ");
		int num2 = scan.nextInt();
		
		System.out.println("Insira o 3° valor: ");
		int num3 = scan.nextInt();
		
		System.out.println("Insira o 4° valor: ");
		int num4 = scan.nextInt();
		
		System.out.println("Insira o 5° valor: ");
		int num5 = scan.nextInt();
		
		double media = (num1 + num2 + num3 + num4 + num5) / 5;
		if (num1 > media) {
			System.out.println("O 1° valor (" + num1 + ") é maior que a média (" + media + ")!");
		} 
		if (num2 > media) {
			System.out.println("O 2° valor (" + num2 + ") é maior que a média (" + media + ")!");
		}
		if (num3 > media) {
			System.out.println("O 2° valor (" + num3 + ") é maior que a média (" + media + ")!");
		}
		if (num4 > media) {
			System.out.println("O 2° valor (" + num4 + ") é maior que a média (" + media + ")!");
		}
		if (num5 > media) {
			System.out.println("O 2° valor (" + num5 + ") é maior que a média (" + media + ")!");
		}
		
		// Nunca cairá aqui ;)
		if ((num1 < media) && (num2 < media) && (num3 < media) && (num4 < media) && (num5 < media)) {
			System.out.println("Nenhum dos 5 valores (" + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " e " + num5 + ") que a média (" + media + ").");
		}
	}

}
