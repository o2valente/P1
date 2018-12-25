import java.util.*;
public class Functions {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		
		System.out.print("X: ");
		int num = reader.nextInt();
		System.out.println("X^2= " + sqr(num));
		
		System.out.print("N: ");
		num = reader.nextInt();
		System.out.println("1/(1+N^2)= " + calcFunc(num));
		
		System.out.println("Maior de dois numeros reais");
		System.out.print("Numero 1: ");
		double num1 = reader.nextDouble();
		System.out.print("Numero 2: ");
		double num2 = reader.nextDouble();
		System.out.println("O maior dos dois numeros é: " + max(num1,num2));
		
		System.out.println("Maior de dois numeros inteiros");
		System.out.print("Numero 1: ");
		int num3 = reader.nextInt();
		System.out.print("Numero 2: ");
		int num4 = reader.nextInt();
		System.out.println("O maior dos dois numeros é: " + max(num3,num4));
		
		
		System.out.println("p(x) = ax^3 + bx^2 + cx + d");
		System.out.print("a: ");
		int a = reader.nextInt();
		System.out.print("b: ");
		int b = reader.nextInt();
		System.out.print("c: ");
		int c = reader.nextInt();
		System.out.print("d: ");
		int d = reader.nextInt();
		System.out.print("x: ");
		int x = reader.nextInt();
		System.out.println("p(x) = " + poly3(a,b,c,d,x));
		
		System.out.print("Calcular o factorial de: ");
		num = reader.nextInt();
		System.out.println("Factorial = " + fact(num));
		
		getIntPos();
		
		getIntRange();
		
		System.out.println("Imprimir uma mensagem N vezes");
		System.out.print("Mensagem a imprimir: ");
		String mens = reader.next();
		System.out.print("Numero de vezes a imprimir a mensagem: ");
		num = reader.nextInt();
		printNtimes(num,mens);
	}
	
	public static double sqr(double x){
		double y = x*x;
		return y;
	}
	
	public static double calcFunc(int n){
		double num = 1/(1+sqr(n));
		return num;
	}
	
	public static double max(double x, double y){
		double max = -1000000;
		if(x > y) max=x;
		else max =y;
		return max;
	}
	
	public static int max(int x,int y){
		int max = -1000000;
		if(x > y) max = x;
		else max = y;
		return max;
	}
	
	public static double poly3(double a, double b, double c, double d,double x){
		double p = a*(sqr(x)*x) + b*sqr(x) + c*x + d;
		return p;
	}
	
	public static int fact(int n){
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	public static int getIntPos(){
		int num = 0;
		while(num <= 0){
			System.out.print("Insira um numero positivo: ");
			num = reader.nextInt();
			if(num > 0) break;
			System.out.println("Numero invalido!!");
		}
		return num;
	}
	
	public static int getIntRange(){
		System.out.print("Limite 1: ");
		int num1 = reader.nextInt();
		System.out.print("Limite 1: ");
		int num2 = reader.nextInt();
		
		int teste = 0;
		if(num1 > num2){
			while(teste<num2 || teste > num1){
			System.out.print("Insira um valor de teste: ");
			teste = reader.nextInt();
			if(teste >= num2 && teste <= num1) break;
			System.out.println("Fora do intervalo");
			}	
		}
		else if(num1 < num2){
			while(teste>num2 || teste < num1){
			System.out.print("Insira um valor de teste: ");
			teste = reader.nextInt();
			if(teste <= num2 && teste >= num1) break;
			System.out.println("Fora do intervalo");
			}
		}
		else{
			System.out.println("Não insira numeros iguais");
			System.exit(0);
		}
		
		return teste;
	}
	
	public static void printNtimes(int num, String mens){
		for(int i = 1; i <= num; i++){
			System.out.print(mens);
		}
	}
}

