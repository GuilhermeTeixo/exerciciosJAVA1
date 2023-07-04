package exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o código da primeira peça, o número e o valor unitário a seguir: ");
		
		String peca1 = sc.next();
		int quantidadePeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		System.out.println("Insira o código da segunda peça, o número e o valor unitário a seguir: ");
		
		String peca2 = sc.next();
		int quantidadePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double valorFinal1 = quantidadePeca1*valorPeca1;
		double valorFinal2 = quantidadePeca2*valorPeca2;
		
		System.out.printf("CÓDIGO DAS PEÇAS SELECIONADAS: R$ %.2f%n",peca1,peca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorFinal1+valorFinal2);
		
		sc.close();
	}
}

