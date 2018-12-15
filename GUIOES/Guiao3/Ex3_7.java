import java.util.Scanner;
public class Ex3_7 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Multiplicação Russa");
		
		System.out.print("X: ");
		int x = reader.nextInt();
		
		System.out.print("Y: ");
		int y = reader.nextInt();
		
		int resX = x; // só é utilizado porque quero guardar o valor de x inicial para usar no ultimo print
		int resY = y; // só é utilizado porque quero guardar o valor de y inicial para usar no ultimo print
		int resultado = 0;
		
		if(x == 1) resultado = y; //sem isto, se o utilizador colocar x como 1 o resultado seria 0
		if(x % 2 != 0) resultado = resultado + y; //condição para o primeiro caso(antes de se começar a dividir)
		else resultado = 0;
		while(resX != 1){
			resX = resX/2;
			resY = resY*2;
			if(resX % 2 != 0) resultado = resultado + resY;
		}
		
		System.out.print(x + " * " + y + " = " + resultado);
		
		//Usando System.out.print("Resultado: " + resultado); Bastava usar as variaveis x e y, sem necessidade de usar resX e resY
	}
}

