import java.util.Scanner;
public class Ex5_6 {
	
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int n = getNRange();
		tabuada(n);
	}
	
	public static int getNRange(){
		int n = 0;
		while(n < 1 || n >= 100){
			System.out.print("Insira um valor: ");
			n = reader.nextInt();
			if(n >= 0 && n < 100) break;
			System.out.println("Valor Inválido!!");
		}
		return n;
	}
	
	public static void tabuada(int n){
		System.out.println("-----------------------------");
		System.out.println("        Tabuada dos " + n);
		System.out.println("-----------------------------");
		for(int i = 1; i <= 10; i++){
			System.out.printf("| %3d   x   %3d   |   %3d   |\n", n,i,n*i);
		}
		System.out.print("-----------------------------");
	}
}

