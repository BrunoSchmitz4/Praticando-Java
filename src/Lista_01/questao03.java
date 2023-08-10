package Lista_01;

import java.util.*;

public class questao03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double juros = 0.02;

		System.out.println("Saldo médio:");
		double saldo_medio = scan.nextDouble();
		System.out.println();
		
		double msaldo_juros = saldo_medio + (saldo_medio * juros);
		
		System.out.println("Saldo médio: R$ " + saldo_medio + "\nSaldo médio + juros: R$ "  + msaldo_juros);
		
		if(saldo_medio < 501) {
			System.out.println("\nNão há um percentual de crédito para o saldo médio.");
			System.out.println("Seu saldo médio com juros é: R$" + msaldo_juros);
		} 
		else if (saldo_medio >= 501 && saldo_medio <= 1000) {
			System.out.println("\nHá um percentual de 30% de crédito para o saldo médio");
			System.out.println("Seu saldo médio com juros é: R$ " + msaldo_juros);
			System.out.println("O percentual de crédito adicional é: R$ " + (msaldo_juros * 0.30));
		} 
		else if (saldo_medio > 1001 && saldo_medio <= 3000) {
			System.out.println("\nHá um percentual de 40% de crédito para o saldo médio");
			System.out.println("Seu saldo médio com juros é: R$ " + msaldo_juros);
			System.out.println("O percentual de crédito adicional é: R$ " + (msaldo_juros * 0.40));
		} 
		else {
			System.out.println("\nHá um percentual de 50% de crédito para o saldo médio");
			System.out.println("Seu saldo médio com juros é: R$ " + msaldo_juros);
			System.out.println("O percentual de crédito adicional é: R$ " + (msaldo_juros * 0.50));
		}
	}

}
