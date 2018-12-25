import java.util.Scanner;
public class Ex4_7 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);

		int larg=0, comp=0;
		while(larg <= 0 || comp <= 0){
			System.out.print("Introduza o comprimento: ");
			comp  = reader.nextInt();
			System.out.print("Introduza a largura: ");
			larg = reader.nextInt();
			if(larg > 0 && comp > 0) break;
			System.out.println("Valores inválidos!");
		}
		
		System.out.println();
	
		for(int i = 1; i <= comp; i++){
			System.out.print("* ");
			for(int j = 1; j < larg; j++){ //não faz o  valor todo da largura pois já tem um * do comprimento
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

