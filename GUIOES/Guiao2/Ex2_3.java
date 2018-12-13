import java.util.*;
public class Ex2_3 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Insira a idade: ");
		int idade = reader.nextInt();
		
		if(idade < 6) System.out.print("Isento de pagamento");
		else if(idade >= 6 && idade <= 12) System.out.print("Bilhete de criança");
		else if (idade >= 13 && idade <= 65) System.out.print("Bilhete normal");
		else System.out.print("Bilhete de 3 idade");
	}
}

