import java.util.*;
public class Ex4_2 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = 0;
		
		while(n < 1 || n >= 100){
			System.out.print("Insira um numero N (0 < N < 100): ");
			n = reader.nextInt();
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("        Tabuada dos " + n);
		System.out.println("-----------------------------");
		for(int i = 1; i <= 10; i++){
			System.out.printf("| %3d   x   %3d   |   %3d   |\n", n,i,n*i);
		}
		System.out.print("-----------------------------");
	}
}

