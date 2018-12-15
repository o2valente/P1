import java.util.Scanner;
public class Ex3_3 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Lista em que é calculada a media, valor maximo e minimo");
		System.out.print("Introduza um numero: ");
		int valorInicial = reader.nextInt();
		
		int valor = 0;
		int count = 1; //começa em 1 devido ao valor inicial
		int max = valorInicial;
		int min = valorInicial;
		double media = valorInicial;
		
		while(valor != valorInicial){
			System.out.print("Introduza um numero: ");
			valor = reader.nextInt();
			if(valor == valorInicial) break; //não contando com o valor sentinela
			if(valor > max) max = valor;
			if(valor < min) min = valor;
			media = media + valor; //media aqui é só a soma de todos os valores
			count++; 
		}
		
		System.out.println("O valor máximo é: " + max);
		System.out.println("O valor minimo é: " + min);
		System.out.println("O valor da média é: " + (media/count));
	}
}

