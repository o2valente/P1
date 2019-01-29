import java.util.Scanner;
import java.io.*;
public class Ex7_4 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args)  throws IOException{
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
	
	public static int[] lerSeq(int[] seq, int numNotas) throws IOException{
		String nomeFich = validacao();
		File fin = new File(nomeFich);
		Scanner scf = new Scanner(fin);
		
		for(int i = 0; i < numNotas; i++){
			seq[i] = scf.nextInt();
			if(!scf.hasNextInt()) break;
		}
		scf.close();
		return seq;
	}
	
	public static String validacao(){
		System.out.print("Escreva o nome do ficheiro(introduza Ex7_3.txt ou crie o seu ficheiro): ");
		String nomeFich = reader.next();
		
		File fin = new File(nomeFich);
		
		if(!fin.exists()){
			System.out.println("ERROR: " + nomeFich + " não existe!");
			System.exit(0);
		}
		else if (fin.isDirectory()) {
			System.out.println("ERROR: " + nomeFich + " is a directory!");
			System.exit(0);
		} else if (!fin.canRead()) {
			System.out.println("ERROR: cannot read from input file " + nomeFich + "!");
			System.exit(0);
		}
		System.out.println();
		
		return nomeFich;
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

