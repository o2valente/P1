import java.util.Scanner;
import java.io.*;
public class Ex7_1 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		System.out.print("Escreva o nome do ficheiro(introduza Ex7_1.txt ou crie o seu ficheiro): ");
		String nomeFich = reader.next();
		validacao(nomeFich);
		imprimeFich(nomeFich);
	}
	
	public static void validacao(String nomeFich){
		File fin = new File(nomeFich);
		
		if(!fin.exists()){
			System.out.println("ERROR: " + nomeFich + " não existe!");
		}
		else if (fin.isDirectory()) {
			System.out.println("ERROR: " + nomeFich + " is a directory!");
		} else if (!fin.canRead()) {
			System.out.println("ERROR: cannot read from input file " + nomeFich + "!");
		} else {
			System.out.println("Ficheiro válido!: " + nomeFich);
			System.out.println("Comprimento Ficheiro = " + fin.length());
			System.out.println("Caminho do ficheiro = " + fin.getAbsolutePath());
		}
		
		System.out.println();
		
	}
	
	public static void imprimeFich(String nomeFich) throws IOException{
		File fin = new File(nomeFich);
		Scanner scf = new Scanner(fin);
		
		while(scf.hasNextLine()) System.out.println(scf.nextLine());
			
		scf.close();
	}
	
}

