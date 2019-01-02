import java.util.Scanner;
public class Ex6_4 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println("HISTOGRAMA");
		int numNotas = numNotas();
		int[] pauta = new int[numNotas];
		pauta = lerSeq(pauta,numNotas);
		histograma(pauta,numNotas);
	}
	
	public static int numNotas(){
		int numNotas = 0;
		while(numNotas <= 0 || numNotas > 50){
			System.out.print("Quantas notas deseja inserir? ");
			numNotas = reader.nextInt();
			if(numNotas > 0 && numNotas <= 50) break;
			System.out.println("Numero de notas invalido !!");
		}
		return numNotas;
	}
	
	public static int getNotaRange(){
		int nota = -1;
		while(nota < 0 || nota > 20){
			System.out.print("Insira uma nota: ");
			nota = reader.nextInt();
			if(nota >= 0 && nota <= 20) break;
			System.out.println("Nota Inválida!!");
		}
		return nota;
	}
	
	public static int[] lerSeq(int[] pauta, int numNotas){
		System.out.println("Insira uma nota de 0 a 20");
		for(int i =0; i <= numNotas-1;i++){
			int nota = getNotaRange();
			pauta[i] = nota;
		}
		System.out.println();
		return pauta;
	}
	
	public static void histograma(int[] pauta,int numNotas){
		System.out.println("Histograma de notas");
		System.out.println("--------------------------------------------------------");
		for(int i = 20; i >= 0 ;i--){
			System.out.printf("%2d | ",i);
			for(int j = 0; j <= numNotas-1; j++){
				if(pauta[j] == i) System.out.print("* ");
			}
			System.out.println();
		}
	}
}

