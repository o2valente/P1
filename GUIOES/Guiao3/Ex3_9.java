import java.util.*;
public class Ex3_9 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		double num = 1;
		int countPos = 0, countNeg = 0, count100Pos = 0, count100Neg = 0;
		
		while(num != 0){
			System.out.print("Introduza uma lista de numeros terminada por 0: ");
			num = reader.nextDouble();
			if(num == 0) break;
			if(num > 0) countPos++;
			else if(num < 0) countNeg++;
			if(num >= 100 && num <= 1000) count100Pos++;
			else if(num >= -1000 && num <= -100) count100Neg++;	
		}
		
		System.out.println("Há " + countPos + " numeros positivos");
		System.out.println("Há " + countNeg + " numeros negativos");
		System.out.println("Há " + count100Pos + " numeros números cujo valor se situa no intervalo [100...1000]");
		System.out.println("Há " + count100Neg + " numeros números cujo valor se situa no intervalo [-1000...-100]");
	}
}

