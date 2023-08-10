package Lista_01;

import java.util.*;

public class questao02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira seu peso: ");
		double peso = scan.nextDouble();
		
		System.out.println("Insira sua altura: ");
		double altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc <= 20) {
			System.out.println("Seu IMC é " + imc + ". Você está abaixo do peso.");
		} else if (imc >= 20 || imc <= 25) {
			System.out.println("Seu IMC é " + imc + ". Você está no peso ideal.");
		} else if (imc >= 25 || imc <= 30) {
			System.out.println("Seu IMC é " + imc + ". Você está com sobre peso.");
		} else if (imc >= 30 || imc <= 40) {
			System.out.println("Seu IMC é " + imc + ". Você está com obesidade elevada.");
		} else {
			System.out.println("Seu IMC é " + imc + ". Você está com obesidade mórbida.");
		}
	}

}
