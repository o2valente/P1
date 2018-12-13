import java.util.*;
public class Ex1_14 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Cateto A: ");
		int a = reader.nextInt();
		
		System.out.print("Cateto B: ");
		int b = reader.nextInt();
		
		double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		
		System.out.println("Hipotenusa: " + c);
		
		double angulo = (Math.asin(a/c)) / Math.PI * 180;
		System.out.println("Se o Cateto A for o cateto oposto, o angulo será: " + angulo + " graus");
		
		angulo = (Math.acos(a/c))/ Math.PI * 180;
		System.out.println("Se o Cateto A for o cateto adjacente, o angulo será: " + angulo + " graus");
	}
}

