import java.util.*;
public class Ex4_4 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num = 0;
		double soma=0, termo;
		while(num <= 0){
			System.out.print("Introduza quantos termos quer somar: ");
			num = reader.nextInt();
			if(num > 0) break;
			System.out.print("Numero Inválido");
		}
		
		for(int i = 0; i <= num; i++){
			termo = Math.pow(-1,i)/(2*(i+1));
			soma += termo; //soma = soma + termo
		}
		
		System.out.printf("Soma = %.15f\n",soma);
		System.out.printf("π/4 = %.15f",Math.PI/4);
		
		
	}
}

