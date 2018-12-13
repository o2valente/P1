import java.util.*;
public class Ex2_11 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Formula Resolvente");
		System.out.print("Introduza A: ");
		double a = reader.nextDouble();
		
		System.out.print("Introduza B: ");
		double b = reader.nextDouble();
		
		System.out.print("Introduza C: ");
		double c = reader.nextDouble();
		
		//duas soluçoes da equação
		double x = (-b+Math.sqrt((4*a*c)))/(2*a);
		double y = (-b-Math.sqrt((4*a*c)))/(2*a);
		
		if(b*b < 4*a*c){
			x = -b / 2*a;
			y = Math.sqrt(4*a*c - b*b) / 2*a;
			System.out.print("A solução é: " + x + " +- " + y+"i");
		}
		else System.out.print("A solução da equação é x= " + x + " e x= "+y);
	}
}

