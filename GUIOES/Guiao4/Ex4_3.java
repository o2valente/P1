import java.util.*;
public class Ex4_3 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int m = 0;
		
		while(m <= 0 || m > 10){
			System.out.print("Introduza um numero: ");
			m = reader.nextInt();
		}
		
		int fact = 1;
		
		for(int i = 1; i <= m; i++){
			for(int j = i; j >= 1; j--){
				fact = fact * j;
			}
			System.out.println(i + "! = " + fact);
			fact = 1;
		}
		
		
	}
}

