import java.util.Scanner;
public class Ex3_8{
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
			
		int soma = 0;
		int nota = 0;
		double media = 0;
		int count = 0;
		
		while(nota >= 0 && nota <= 20){
			System.out.print("Nota? ");
			nota = reader.nextInt();
			if(nota < 0 || nota > 20) break; //não contar o sentinela
			soma = soma + nota;
			count++;
			media = media + nota;
		}
		
		System.out.println("Soma = "+soma);
		System.out.println("Media = "+media/count);
	}
}

