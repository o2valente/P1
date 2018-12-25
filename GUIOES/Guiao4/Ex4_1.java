import java.util.*;
public class Ex4_1 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num = 0;
		
		while(num <= 0){
			System.out.print("Quantas vezes quer imprimir 'P1 é fixe!' ? ");
			num = reader.nextInt();
		}
		
		for(int i = 0; i < num; i++){
			System.out.println("P1 é fixe!");
		}
	}
}

