import java.util.*;
public class Ex3_2 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.printf("Introduza uma lista de números (terminada com 0): ");
		
		double valor = 1;
		double produto = 1;
		
		while(valor != 0){
			valor = reader.nextDouble();
			if(valor == 0) break; //não contando com o valor sentinela
			//(if valor==0) produto = produto * valor;
			produto = produto * valor;
		}
		
		System.out.print("Produto: " + produto);
	}
}

