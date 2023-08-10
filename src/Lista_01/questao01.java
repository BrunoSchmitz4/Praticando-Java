package Lista_01;

import java.util.*;

public class questao01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Isnira um valor: ");
		int valor = scan.nextInt();
		
		if ((valor % 2) == 0) {
			System.out.println(valor + " é divisível por 2");
		} else {
			System.out.println(valor + "não é divisível por 2");
		}
		if ((valor % 5) == 0) {
			System.out.println(valor + " é divisível por 5");
		} else {
			System.out.println(valor + "não é divisível por 5");
		}
		if ((valor % 10) == 0) {
			System.out.println(valor + " é divisível por 10");
		} else {
			System.out.println(valor + "não é divisível por 10");
		}
	}

}
