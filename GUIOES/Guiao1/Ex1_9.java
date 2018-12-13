import java.util.*;
public class Ex1_9 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Insira o valor do comprimento: ");
		int comprimento = reader.nextInt();
		
		System.out.print("Insira o valor da largura: ");
		int largura = reader.nextInt();
		
		int area = comprimento * largura;
		int perimetro = 2*comprimento + 2*largura;
		
		System.out.print("O valor da area é " + area + " e o valor do perimetro é " + perimetro);
		
	}
}

