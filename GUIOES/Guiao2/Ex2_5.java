import java.util.*;
public class Ex2_5 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ponto 1");
		System.out.print("Insira a abcissa: ");
		int x1 = reader.nextInt();
		System.out.print("Insira a ordenada: ");
		int y1 = reader.nextInt();
		
		System.out.println("Ponto 2");
		System.out.print("Insira a abcissa: ");
		int x2 = reader.nextInt();
		System.out.print("Insira a ordenada: ");
		int y2 = reader.nextInt();
		
		System.out.println("Ponto 3");
		System.out.print("Insira a abcissa: ");
		int x3 = reader.nextInt();
		System.out.print("Insira a ordenada: ");
		int y3 = reader.nextInt();
		
		System.out.println("Ponto 4");
		System.out.print("Insira a abcissa: ");
		int x4 = reader.nextInt();
		System.out.print("Insira a ordenada: ");
		int y4 = reader.nextInt();
		
		double dist12 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		double dist23 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
		double dist34 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
		double dist41 = Math.sqrt(Math.pow(x1-x4,2) + Math.pow(y1-y4,2));
		//Ficaria melhor criar uma função fora da main que recebesse quatro argumentos e calculasse a distancia
		
		if(dist12 == dist23 && dist23 == dist34 && dist34 == dist41 && dist41 == dist12) System.out.print("A figura é um quadrado!");
		else System.out.print("A figura não é um quadrado!");
		
		//Outra implementação possivel seria verificar se 
		//a abcissa de P1 era igual a de P4
		//a abcissa de P2 era igual a de P3
		//a ordenada de P1 era igual a de P2
		//a ordenada de P4 era igual a de P3
												
	}
}

