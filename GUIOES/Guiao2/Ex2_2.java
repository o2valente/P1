import java.util.*;
public class Ex2_2 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Comparador de números");
		System.out.print("Insira um numero: ");
		double num1 = reader.nextDouble();
		
		System.out.print("Insira outro numero: ");
		double num2 = reader.nextDouble();
		
		if(num1 > num2) System.out.print("O primeiro numero é maior que o segundo!");
		else if(num1 < num2) System.out.print("O segundo numero é maior que o primeiro!");
		else System.out.print("Os numeros sao iguais");
	}
}

