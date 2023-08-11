package Lista_01;

import java.util.*;

public class questao06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escolha um dia da semana pelo seu número (1 à 7 | Domingo à Sábado):");
		int num = scan.nextInt();
		
		if (num < 1 || num > 7) {
			System.out.println("Não é possível criar outro dia na semana! :(");
		} else if (num == 1) {
			System.out.println("Domingo! O primeiro dia da semana sim >:(");
		} else if (num == 2) {
			System.out.println("Segunda-feira... odeio segunda-feira");
		} else if (num == 3) {
			System.out.println("Terça-feira...? Bem, ao menos não é segunda");
		} else if (num == 4) {
			System.out.println("Quarta-feira! Estamos na metade do caminho :)");
		} else if (num == 5) {
			System.out.println("Quinta-feira, foi nesse dia da semana que esse software nasceu :)");
		} else if (num == 6) {
			System.out.println("TGIF!!!");
		} else {
			System.out.println("Dia de tudo e mais um pouco, este é sábado :D");
		}
	}

}
