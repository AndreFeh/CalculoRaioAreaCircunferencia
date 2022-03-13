package git;
import java.util.Scanner;

public class CalculoRaio {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Escreva o valor do Raio, e sua medida(mm, cm, dm, m, dam, hm, km)");
		double raio = scan.nextDouble();
		String medida = scan.nextLine();
		
		double area = Math.PI * (raio * raio);
		double circun = (2 * Math.PI) * raio ;
		double diametro = 2 * raio;
		System.out.println("O valor da área é: " + area + medida + "²");
		System.out.println("O valor do diametro é: " + diametro + medida + "²");
		System.out.println("O valor da circunferencia é: " + circun + medida + "²");
	}
}
