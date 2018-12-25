import java.util.Scanner;
public class Ex5_9 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int m = getMRange();
		boolean isImpar = true;
		for(int i = 1; i <= m; i++){
			isImpar = isPrime(i);
			if(isImpar == true) System.out.println(i);
		}
	}
	
	public static int getMRange(){
		int m = 0;
		while(m <= 1){
			System.out.print("Insira um M: ");
			m = reader.nextInt();
			if(m > 1) break;
			System.out.println("M Inválido!!");
		}
		return m;
	}
	
	public static boolean isPrime(int n) {
		if (n%2==0) return false;
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) return false;
		}
		return true;
	}
}

