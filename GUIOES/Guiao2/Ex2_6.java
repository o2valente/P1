import java.util.*;
public class Ex2_6 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Par ou Impar ?");
		System.out.print("Insira um numero: ");
		int num = reader.nextInt();
		
		if(num % 2 == 0) System.out.print("Numero é Par !!");
		else System.out.print("Numero é impar!!");
	}
}

