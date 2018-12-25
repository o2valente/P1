import java.util.Scanner;
public class Ex5_5 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int larg = getLarguraRange();
		int comp = getComprimentoRange();
		
		printNtimes(larg,"* ");
		System.out.println();
		for(int i = 0; i < comp-2; i++){
			System.out.print("* ");
			for(int j = 0; j < larg-2;j++){
				System.out.print("  ");
			}
			System.out.print("*\n");
		}
		printNtimes(larg,"* ");
		
	}
	
	public static int getLarguraRange(){
		int larg = 0;
		while(larg <= 0){
			System.out.print("Insira uma largura: ");
			larg = reader.nextInt();
			if(larg > 0) break;
			System.out.println("Largura Inválida!!");
		}
		return larg;
	}
	
	public static int getComprimentoRange(){
		int comp = 0;
		while(comp <= 0){
			System.out.print("Insira um comprimento: ");
			comp = reader.nextInt();
			if(comp > 0) break;
			System.out.println("Comprimento Inválido!!");
		}
		return comp;
	}
	
	public static void printNtimes(int num, String mens){
		for(int i = 1; i <= num; i++){
			System.out.print(mens);
		}
	}
}

