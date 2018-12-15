import java.util.Scanner;
public class Ex3_13 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num=0, reverse = 0;
		
		while(num <= 0){
			System.out.print("Introduza um numero: ");
			num = reader.nextInt();
			if(num > 0) break;
			System.out.println("Numero invalido");
		}
		
		int numero = num; //variavel para guardar o valor inicial 
		
		while(num != 0){
			reverse = reverse * 10;
			reverse = reverse + num%10;	
			num = num/10;
		}
		
		System.out.print(numero + " -> " + reverse);
	}
}

