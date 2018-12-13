import java.util.*;
public class Ex2_8 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ordenação cresente");
		
		System.out.print("Insira o primeiro numero: ");
		int num1 = reader.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		int num2 = reader.nextInt();
		
		System.out.print("Insira o terceiro numero: ");
		int num3 = reader.nextInt();
		
		if(num1 > num2){
			if(num1 > num3){
				if(num2 > num3) System.out.print(num3 + " < " + num2 + " < " + num1);
				else System.out.print(num2 + " < " + num3 + " < " + num1);
			}
			else System.out.print(num2 + " < " + num1 + " < " + num3);
		}else {
			if(num2 > num3){
				if(num1 > num3) System.out.print(num3 + " < " + num1 + " < " + num2);
			}
			else if(num3 > num1 && num3 < num2) System.out.print(num1 + " < " + num3 + " < " + num2);
			else System.out.print(num1 + " < " + num2 + " < " + num3);
		}
	}
}

