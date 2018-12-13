import java.util.*;
public class Ex2_7 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Maior de três numeros");
		
		System.out.print("Insira o primeiro numero: ");
		int num1 = reader.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		int num2 = reader.nextInt();
		
		System.out.print("Insira o terceiro numero: ");
		int num3 = reader.nextInt();
		
		if(num1 != num2 && num2 != num3){
			if(num1 > num2){
				if(num1 > num3) System.out.print("O primeiro numero é o maior: " + num1);
				else System.out.print("O terceiro numero é o maior: " + num3);
			}
			else if(num2 > num3) System.out.print("O segundo numero é o maior: " + num2);
			else System.out.print("O terceiro numero é o maior: " + num3);
		}
		else if(num1 == num2 && num1 > num3) System.out.print("O primeiro e o segundo numero são os maiores: " + num1 + ", " + num2);
		else if(num1 == num2 && num1 < num3) System.out.print("O terceiro numero é o maior: " + num3);
		else if(num1 == num3 && num3 > num2) System.out.print("O primeiro e o terceiro numero são os maiores: " + num1 + ", " + num3);
		else if(num1 == num3 && num1 < num2) System.out.print("O segundo numero é o maior: " + num2);
		else if(num2 == num3 && num2 > num1) System.out.print("O segundo e o terceiro numero são os maiores: " + num2 + ", " + num3);
		else if(num2 == num3 && num2 < num1) System.out.print("O primeiro numero é o maior: " + num1);
	}
}

