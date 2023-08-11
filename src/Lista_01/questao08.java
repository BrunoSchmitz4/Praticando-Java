package Lista_01;

import java.util.*;

public class questao08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("1° nota: ");
		double num1 = scan.nextDouble();
		
		System.out.println("2° nota: ");
		double num2 = scan.nextDouble();

		System.out.println("3° nota: ");
		double num3 = scan.nextDouble();

		System.out.println("4° nota: ");
		double num4 = scan.nextDouble();

		double media = (num1 + num2 + num3 + num4 ) / 4;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado com média " + media + "!");
		} else if (media < 7) {
			System.out.println("Insira nota do exame: ");
			double exame = scan.nextDouble();
			media = (media + exame) / 2;
			if(media >= 5) {
				System.out.println("Aluno aprovado em exame com média " + media + ".");
			}
			else {
				System.out.println("Infelismente o aluno foi reprovado com média " + media + ".");
			}

		} else {
			System.out.println("Infelismente o aluno foi reprovado com média " + media + ".");
		}

	}

}
