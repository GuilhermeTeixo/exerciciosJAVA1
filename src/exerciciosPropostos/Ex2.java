package exerciciosPropostos;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double raioAoQuadrado = raio*raio;
		double area = raioAoQuadrado * pi;
		
		System.out.printf("A= %.4f%n",area);
		
		sc.close();
	}
}
