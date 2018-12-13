import java.util.*;
public class Ex1_13 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Localidade A");
		System.out.print("X1: ");
		int x1 = reader.nextInt();
		
		System.out.print("Y1: ");
		int y1 = reader.nextInt();
		
		System.out.println("Localidade B");
		System.out.print("X2: ");
		int x2 = reader.nextInt();
		
		System.out.print("Y2: ");
		int y2 = reader.nextInt();
		
		double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("Distancia: " + dist*100 + "km");
		
		System.out.print("Se desejar utilizar outra escala pressione 1, caso contrário pressione qualquer tecla: ");
		int escolha = reader.nextInt();
				
		if(escolha == 1){
			System.out.print("Insira a escala que quer utilizar: ");
			int escala = reader.nextInt();
			
			System.out.print("Distancia: " + dist*escala + "km");
		} else System.exit(0);
		
	}
}

