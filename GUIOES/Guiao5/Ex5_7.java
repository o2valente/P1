import java.util.Scanner;
public class Ex5_7 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int x = getXRange();
		int y = getYRange();
		euclides(x,y);
	}
	
	public static int getXRange(){
		int x = 0;
		while(x <= 0){
			System.out.print("Insira um X: ");
			x = reader.nextInt();
			if(x > 0) break;
			System.out.println("X Inválido!!");
		}
		return x;
	}
	
	public static int getYRange(){
		int y = 0;
		while(y <= 0){
			System.out.print("Insira um Y: ");
			y = reader.nextInt();
			if(y > 0) break;
			System.out.println("Y Inválido!!");
		}
		return y;
	}
	
	public static void euclides(int x, int y){
		int resto = x % y;
		while(resto != 0){
			x = y;
			y =resto;
			resto = x%y;
		}
		
		System.out.print("O MDC é " + y);
	}
}

