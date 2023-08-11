package Lista_01;

import java.util.*;

public class questao10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Insira quantos quilos de peixe foram pescados: ");
		double kilos = scan.nextDouble();
		
		if (kilos > 500) {
			double multa = (kilos - 500) * 4;
			System.out.println("Você foi multado em: R$ " + multa + "0 pois foram pescados " + (kilos - 500) + "Kg à mais do permitido.");
		} else {
			System.out.println("Não há valores de quilo excedentes.");
		}
	
	}

}
