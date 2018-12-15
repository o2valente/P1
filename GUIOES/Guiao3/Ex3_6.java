import java.util.Scanner;
public class Ex3_6 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("--------Calculador de MDC--------");

		System.out.print("Introduza um numero: ");
		int num1 = reader.nextInt();
		
		System.out.print("Introduza um numero: ");
		int num2 = reader.nextInt();
		
		int resto = num1 % num2;
		
		while(resto != 0){
			num1 = num2;
			num2 =resto;
			resto = num1%num2;
		}
		
		System.out.print("O MDC é " + num2);
	}
}

