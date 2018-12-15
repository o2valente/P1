import java.util.Scanner;
public class Ex3_5 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("-----------Numero primo ?-----------");
		
		int valor = 0;
		
		while(valor <= 0){
			System.out.print("Introduza um numero: ");
			valor = reader.nextInt();
			if(valor <= 0) System.out.println("Numero inválido!");
		}
		
		if(valor == 1) System.out.print("O numero " + valor + " é primo!");
		else if(valor == 2) System.out.print("O numero " + valor + " é primo!");
		else if(valor == 3) System.out.print("O numero " + valor + " é primo!");
		else if(valor == 5) System.out.print("O numero " + valor + " é primo!");
		else if(valor % 2 == 0) System.out.print("O numero " + valor + " nao é primo!");
		else if(valor % 3 == 0) System.out.print("O numero " + valor + " nao é primo!");
		else if(valor % 5 == 0) System.out.print("O numero " + valor + " nao é primo!");
		else System.out.print("O numero " + valor + " é primo!");
		
	}
}

