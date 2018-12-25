import java.util.Scanner;
public class Ex5_4 {
	
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int M = getMRange();
		fact(M);
	}
	
	public static int getMRange(){
		int m = 0;
		while(m < 1 || m > 10){
			System.out.print("Insira um numero entre 1 e 10: ");
			m = reader.nextInt();
			if(m >= 1 && m <= 10) break;
			System.out.println("Numero Inválido!!");
		}
		return m;
	}
	
	public static void fact(int m){
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

