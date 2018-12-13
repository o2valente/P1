import java.util.*;
public class Ex1_11 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Indique a quantia em dólares: ");
		double dolares = reader.nextDouble();
		
		System.out.print("Indique a taxa de conversão: ");
		double taxa = reader.nextDouble();
		
		double euros = dolares * taxa;
		
		System.out.print(dolares + " dólares equivalem a " + euros + " euros");
	}
}

