import java.util.Scanner;
public class Ex3_11 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num = 1;
		boolean isPrime = true;
		
		while(num != 0){
			System.out.print("Introduza um numero: ");
			num = reader.nextInt();
			if(num == 0) break; //não contar o sentinela
			if(num != 1 && num != 2 && num != 3 && num != 5){
				if(num % 2 == 0) isPrime = false;
				else if(num % 3 == 0) isPrime = false;
				else if(num % 5 == 0) isPrime = false;
			}
		}
		if(isPrime == false) System.out.print("A sequência de números não é exclusivamente constituída por números ímpares");
		else System.out.print("A sequência de números é exclusivamente constituída por números ímpares");
	}
}
