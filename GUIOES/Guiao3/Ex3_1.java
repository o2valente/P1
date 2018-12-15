import java.util.*;
public class Ex3_1 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int count = 0;
		int val = 0;
		
		while(val >= 0){
			System.out.print("Introduza um numero positivo, se colocar negativo o programa fecha: ");
			val = reader.nextInt();
			count++;
		}
		count = count -1; // -1 para nao contar o numero negativo utilizado, comentar esta linha se for intencional contar o negativo
		
		System.out.print("Foram introduzidos " + count + " numeros"); 
		System.exit(0); //terminar o programa
	}
}

