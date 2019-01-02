import java.util.Scanner;
public class Ex6_1 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int n = getNRange();
		int[] seq = escreveArray(n);
		
		for(int i = n-1;i >= 0;i--){
			System.out.print(seq[i]+" ");
		}
	}
	
	public static int getNRange(){
		int n = 0;
		while(n <= 0){
			System.out.print("Sequencia de N numeros inteiros, insira N: ");
			n = reader.nextInt();
			if(n > 0) break;
			System.out.println("N Inválido!!");
		}
		return n;
	}
	
	public static int[] escreveArray(int n){
		int[] seq = new int[n];
		for(int i = 0; i <= n-1; i++){
			System.out.print("Escreva um numero da sequencia: ");
			seq[i] = reader.nextInt();
		}
		return seq;
	}
}

