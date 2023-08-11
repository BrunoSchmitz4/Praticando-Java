package Lista_01;

import java.util.*;

public class questao07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escolha um número :D :");
		double num = scan.nextDouble();
		
		if((num % 2 == 0) || (num % 2 == 1)) {
			System.out.println(num + " é inteiro");
		} else {
			System.out.println(num + " não é inteiro");
		}
	}

}
