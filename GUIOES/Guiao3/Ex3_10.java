import java.util.*;
public class Ex3_10 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int num = 1, numAnterior=0, max = 0, min = 10000000, temp = (int)(100.0*Math.random()) + 1;
		//min inicializado com um numero muito grande para garantir que o num colocado vai ser menor 
		//variavel temp gerada aleatoriamente para diminuir a chance de o utilizador colcoar um numero igual ao temp no inicio do programa

		while(num != temp){
			System.out.print("Introduza um numero: ");
			num = reader.nextInt();
			if(num == 0){
				temp = 0;
				min = 0;
				break;
			} 
			if(num > max) max = num;
			if(num < min) min = num;
			if(num == temp)break;
			numAnterior = num;
			temp = num * 2;
		}
		
		System.out.println("O maior numero foi " + max);
		System.out.println("O menor numero foi " + min);
		System.out.println("A lista terminou com os numeros " + numAnterior + " e " + temp);
	}
}

