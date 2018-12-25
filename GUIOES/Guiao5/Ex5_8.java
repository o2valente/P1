import java.util.Scanner;
public class Ex5_8 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.print("Insira um valor inicial para X: ");
		double xI = reader.nextDouble();
		double xF = getXFRange(xI);
		tabela(xI,xF);
	}
	
	public static double getXFRange(double xI){
		double xF = -100000;
		while(xF <= xI){
			System.out.print("Insira um valor final para X: ");
			xF = reader.nextDouble();
			if(xF >= xI) break;
			System.out.println("X final tem que ser maior que o inicial!!");
		}
		return xF;
	}
	
	public static double poly3(double x){
		double p = 7*(Math.pow(3,x)) + 3*Math.pow(2,x) + 5*x + 2;
		return p;
	}
	
	public static double poly2(double x){
		double p = 5*Math.pow(2,x) + 10*x + 3;
		return p;
	}
	
	public static void tabela(double xI, double xF){
		System.out.println("----------------------------------------------");
		System.out.println("|    x    |   5x2+10x+3   |   7x3+3x2+5x+2   | ");
		System.out.println("----------------------------------------------");
		for(double i = xI;i <= xF;i++){
			System.out.printf("|  %.3f  |    %05.2f      |    %06.3f      |\n",i,poly2(i),poly3(i));
			System.out.println("----------------------------------------------");
		}
	}
}

