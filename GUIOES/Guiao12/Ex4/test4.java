// MIECT João Rodrigues 88856

import java.util.*;
import java.io.*;

public class test4 {
	static int count = 0;
	static Scanner sc= new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		
		Aluno[] lista = new Aluno[15];
		int op = -1;
		
		do{
			System.out.println();
			System.out.println("Serviços Académicos - Gestão de uma pauta:");
			System.out.println("1 - Ler ficheiro com números mec. e pedir informação de notas");
			System.out.println("2 - Imprimir no terminal a informação da disciplina");
			System.out.println("3 - Calcular estatísticas das notas finais");
			System.out.println("4 - Alterar as notas de um aluno");
			System.out.println("5 - Imprimir um histograma de notas");
			System.out.println("6 - Gravar num ficheiro a informação da disciplina (ordenada)");
			System.out.println("9 - Terminar o programa");
			System.out.print("Opção -> ");
			op = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(op){
				case 1 : lista = inserir(lista);break;
				case 2 : imprimir(lista);break;
				case 3 : estatisticas(lista);break;
				case 4 : lista = alterar(lista);break;
				case 5 : histograma(lista);break;
				case 6 : gravar(lista, "4.txt");break;
				case 9 : System.exit(0);break;
			}
			
		}while(true);
	}
	
	public static Aluno[] inserir (Aluno[] l) throws IOException{
		System.out.println("Ficheiro a ler: ");
		File f = new File (sc.nextLine());
		Scanner fRead = new Scanner(f);
		int n = -100;
		int r = -100;
		for(int i = 0; i < l.length && fRead.hasNextLine() ; i++){
			int s = fRead.nextInt();
			
			System.out.println ("Aluno nº "+ s + " :");
			System.out.println ("Nota Normal: [0-20] [77] : ");
			do{
				n = sc.nextInt();
			}while(0 < n && n > 20 && n != 77);
			System.out.println ("Nota Recurso: [0-20] [77] : ");
			do{
				 r = sc.nextInt();
				 sc.nextLine();
			}while(0 < r && r > 20 && r != 77);
			l[i] = new Aluno(s,n,r); count ++;	
		}
		return l;
	}
	
	public static void imprimir(Aluno []l){
		System.out.println("Pauta de uma Disciplina");
		System.out.println("------------------------");
		for(int i = 0 ; i < count ; i++){
			if(l[i].nRecurso == 77){
				l[i].nFinal = l[i].nNormal;
			}else if(l[i].nNormal == 77){
				l[i].nFinal = l[i].nRecurso;
			}else if(l[i].nNormal < l[i].nRecurso ){
				l[i].nFinal = l[i].nRecurso;
			}else{
				l[i].nFinal = l[i].nNormal;
			}
			
			System.out.printf("\n| %5d | %2d | %2d | %2d |", l[i].mec , l[i].nNormal, l[i].nRecurso, l[i].nFinal);
		}
		System.out.printf("\n------------------------");	
			
	}
	
	public static void estatisticas (Aluno[] l){
		double valorTotal = 0;
		int aprovados = 0;
		int  best = 0;
		int indice = 0;
		for(int i = 0; i < count; i++){
			if(l[i].nFinal != 77){
				valorTotal += l[i].nFinal;
			}
			if(best < l[i].nFinal && l[i].nFinal != 77){
				best = l[i].nFinal;
				indice = i;
			}
			if(l[i].nFinal > 9 && l[i].nFinal != 77){
				aprovados++;
			}
		}
		System.out.println(" Media :" + valorTotal/count + "| Melhor aluno : " + l[indice].mec + " | Aprovados : " + aprovados + " | Reprovados : " + (count - aprovados));
	}
	
	public static Aluno[] alterar(Aluno[] l){
		System.out.println("Nº mec do aluno a alterar a pauta");
		int mec = sc.nextInt();
		sc.nextLine();
		boolean existe = false;
		for(int i = 0 ; i < count; i++){
			if(l[i].mec == mec){
				System.out.println ("Aluno nº "+ mec + " :");
				System.out.println ("Nota Normal: [0-20] [77] : ");
				do{
					l[i].nNormal = sc.nextInt();
				}while(0 < l[i].nNormal && l[i].nNormal > 20 && l[i].nNormal != 77);
				System.out.println ("Nota Recurso: [0-20] [77] : ");
				do{
					 l[i].nRecurso = sc.nextInt();
					 sc.nextLine();
				}while(0 < l[i].nRecurso && l[i].nRecurso > 20 && l[i].nRecurso != 77);
				existe = true;
			}
			
		}
		if(!existe){
			System.out.println("Aluno não existe");
		}
		return l;
	}
	// falta ajustar os espaços para ficar mesmo bem
	public static void histograma(Aluno [] l){
		int[] arr = new int[21];
		int max = 0;
		System.out.println("Histograma de uma disciplina");
		for(int i = 0; i < count; i++){
			if(l[i].nFinal != 77){
				arr[l[i].nFinal]++;
			}
		}
		
		for(int j = 0; j < arr.length; j++){
			if(arr[j] > max){
				max = arr[j];
			}
		}
		
		for(int k = 0; k< max; k++){
			for(int m = 0; m< arr.length; m++){
				if(arr[m] >= max-k){
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println(" 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ");
	}
	
	public static void gravar (Aluno[] l, String s) throws IOException{
		boolean trocas;
		do{
			trocas = false;
			for(int i = 0; i < count-1; i++){
				
				if(l[i+1].nFinal > l[i].nFinal){
					Aluno tmp = l[i];
					l[i] = l[i+1];
					l[i+1] = tmp;
					trocas = true;
				}	
			}
			
		}while(trocas);
		
		for(int j = 0; j < count; j++){
			System.out.println(l[j].toString());
		}
		
		File f = new File(s);
		PrintWriter pw = new PrintWriter(f);
		for(int j = 0; j < count; j++){
			pw.println(l[j].toString());
		}
		pw.close();
	}
	
	
}

class Aluno{
int mec;
int nNormal;
int nRecurso;
int nFinal;
	Aluno(int m, int n, int r){
		this.mec = m;
		this.nNormal = n;
		this.nRecurso = r;
	}
	
	public String toString(){
		return "Nº mec : " + mec + "| Nota Normal : " + nNormal + "| Nota Recurso : " + nRecurso + " | Nota Final :" + nFinal;
	}
}
