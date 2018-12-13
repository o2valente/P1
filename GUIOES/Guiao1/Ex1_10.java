import java.util.*;
public class Ex1_10 {
	
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Temperatura em graus Celsius: ");
		double celsius = reader.nextDouble();
		
		double fahr = 1.8 * celsius+32;
		
		System.out.print(celsius + " ºCelsius é equivalente a " + fahr + " ºFahrenheit");
		
		
		
	}
}

