import java.util.Scanner;
import java.io.*;
public class Ex7_3 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
				
		int[] seq = new int[50];
		int opc = 0;
		do{
			System.out.println("Análise de uma sequência de números inteiros");
			System.out.println("1 - Ler a sequência");
			System.out.println("2 - Escrever a sequência");
			System.out.println("3 - Calcular o máximo da sequência");
			System.out.println("4 - Calcular o mínimo da sequência");
			System.out.println("5 - Calcular a média da sequência");
			System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
			System.out.println("7 - Ler sequência de um ficheiro");
			System.out.println("8 - Adicionar numeros à sequencia");
			System.out.println("10 - Terminar o programa");
			System.out.print("Opção -> ");
			opc = reader.nextInt();
			System.out.println();
		
			switch(opc){
				case 1: seq=lerSeq(seq);
						break;
				case 2: escSeq(seq);
						break;
				case 3: max(seq);
						break;
				case 4: min(seq);
						break;
				case 5: media(seq);
						break;
				case 6: paridade(seq);
						break;
				case 7: seq = seqFich(seq);
						break;
				case 8: seq = addSeq(seq);
						break;
				case 10: System.exit(0);
					
				default : opc = 0;
				reader.nextLine();		
				
			}
			
			
		}while(true);
			
	}
	
	public static int[] lerSeq(int[] seq){
		System.out.println("Insira um diferente de 0 na sequencia, poderá inserir até 50 numeros");
		for(int i =0; i < 50;i++){
			System.out.print("Numero: ");
			int x = reader.nextInt();
			if(x == 0) break;
			seq[i] = x;
		}
		System.out.println();
		return seq;
	}
	
	public static void escSeq(int[] seq){
		for(int i = 0; i < 50; i++){
			if(seq[i] == 0) break;
			System.out.print(seq[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void max(int[] seq){
		int max=-100000;
		for(int i = 0; i < 50; i++){
			if(seq[i] > max) max = seq[i];
		}
		
		System.out.println("O máximo da sequência é " + max);
		System.out.println();
	}
	
	public static void min(int[] seq){
		int min=100000;
		for(int i = 0; i < 50; i++){
			if(seq[i] != 0){
				if(seq[i] < min) min = seq[i];
			}	
		}	
		System.out.println("O minimo da sequência é " + min);
		System.out.println();
	}
	
	public static void media(int[] seq){
		double media=0;
		int count = 0;
		for(int i = 0; i < 50; i++){
			if(seq[i] != 0){
				media += seq[i];
				count++;
			}
		}
		media = media/count;
		System.out.println("A média é "+media);
		System.out.println();
	}
	
	public static void paridade(int[] seq){
		boolean hasImpar = false;
		for(int i =0;i<50;i++){
			if(seq[i] != 0){
				if(seq[i]%2 != 0) hasImpar = true;
			}
			if(hasImpar == true) break; //linha desnecessaria, apenas para eficiencia
		}
		
		if(hasImpar==true) System.out.println("A sequencia não é so constituidda por numeros pares");
		else System.out.println("A sequencia  é so constituidda por numeros pares");
		System.out.println();
	}
	
	public static int[] seqFich(int[] seq) throws IOException{
		String nomeFich = validacao();
		File fin = new File(nomeFich);
		Scanner scf = new Scanner(fin);
		
		for(int i = 0; i < 50; i++){
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
	
	public static int[] addSeq(int[] seq) throws IOException{
		String nomeFich = validacao();
		File fin = new File(nomeFich);	
		Scanner scf = new Scanner(fin);	
		//FileWriter fw = new FileWriter(nomeFich, true);
		PrintWriter pw = new PrintWriter(fin);
		
		
		int num = 0;
		while(num <= 0){
			System.out.print("Indique quantos numeros quer adicionar: ");
			num = reader.nextInt();
			if(num >= 0) break;
			System.out.println("Quantidade Invalida!");
		}
		
		//int numAdd = 0;
		for(int i = 0; i < num;i++){
			System.out.print("Escreva o numero que quer introduzir: ");
			int numAdd = reader.nextInt();
			pw.print(numAdd + " ");
		}
		pw.close();
		
		for(int i = 0; i < 50; i++){
			seq[i] = scf.nextInt();
			if(!scf.hasNextInt()) break;
		}
		
		
		return seq;
	}
}


