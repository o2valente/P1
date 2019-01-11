import java.util.Scanner;
import java.io.*;
public class Teste {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		 Pais[] paises;
		 paises = lerFichHum("PaisesHumid.txt");
		 procurarListar(paises," "); // espaço lista tudo
		 procurarListar(paises,"56"); // lista paises onde apareca "56"
		 int [] mins = humMin(paises);
		 for(int i=0; i<mins.length; i++)
			 System.out.printf("Minimo = %5d %3d %s%n", paises[mins[i]].dia,
			 paises[mins[i]].humidade, paises[mins[i]].nome);
		 int[] freq = freqHum(paises);
		 printFreq(freq);
		 System.out.println(diaPaisExiste(paises,paises.length,24,"Marrocos"));
		 paises=removerRepetidos(paises);
		 bubbleSort(paises);
		 gravarPais(paises, "PaisesHumidOrd.txt");
	
		
	}
	
	static Pais[] lerFichHum(String nomeF) throws IOException{
		File fin = new File(nomeF);
		Scanner scf = new Scanner(fin);
		
		int num = scf.nextInt();
		Pais[] paises = new Pais[num];
		
		scf.nextLine();
			
		for(int i = 0; i < paises.length;i++){
			paises[i] = new Pais();
			paises[i].dia = scf.nextInt();
			paises[i].humidade = scf.nextInt();
			paises[i].nome = scf.next();
			scf.nextLine();
		}
		scf.close();
		return paises;
	}
	
	public static void procurarListar(Pais[] p, String frase){
		System.out.printf("Dia   Hum Pais \n");
		for(int i =0; i < p.length;i++){
			String linha = p[i].nome + " " + p[i].humidade + " " + p[i].dia;
			if(linha.indexOf(frase) >= 0){
				System.out.println(p[i].dia + " " + p[i].humidade + " " + p[i].nome);
			}
		}
		System.out.println();
	}
	
	static int[] humMin(Pais [] p){
		int min = 0;
		int count=0;
		for(int i =0; i < p.length;i++){
			if(p[i].humidade <= p[min].humidade){
				min = i;
				count++;
			}
		}
		
		int[] mins = new int[count];
		
		int n =0;
		for(int i =0;i<p.length;i++){
			if(p[i].humidade == p[min].humidade) mins[n++] = i;
		}
		
		return mins;
	}
	
	static void gravarPais (Pais [] p, String nome) throws IOException{
		File fin = new File(nome);
		PrintWriter pw = new PrintWriter(fin);
		
		pw.print(p.length);
		for(int i =0;i<p.length;i++){
			pw.print(p[i].dia + " " + p[i].humidade + " " + p[i].nome+"\n");
		}
		pw.close();
	}
	
	static int[] freqHum(Pais [] p){
		int[] freqs = new int[96];
		int count=0;
		for(int i=0;i<freqs.length;i++){
			for(int j=0;j<p.length;j++){
				if(p[j].humidade==i) count++;
			}
			freqs[i]=count;
			count=0;
		}
		return freqs;
	}
	
	static void printFreq(int[] f){
		System.out.println("Hum  Freq");
		for(int i=0;i<f.length;i++){
			if(f[i] > 0) System.out.println(i + "   " +f[i]);
		}
	}
	
	static boolean diaPaisExiste(Pais[] p, int comp, int dia, String pais) {
		boolean existe = false;
		for(int i=0;i<comp;i++){
			if(p[i].dia == dia && p[i].nome.equals(pais)) existe = true;
		}
		return existe;
	}
	
	static Pais[] removerRepetidos(Pais [] p) {
		Pais[] r = new Pais[p.length];
		int n=0;
		 for (int i=0; i<p.length; i++) {
			if(!diaPaisExiste(r,n,p[i].dia,p[i].nome)) {
				r[n]=p[i];
				n++;
			}
		 }
		 // devolve array com o comprimento exato
		 Pais[] u = new Pais[n];
		 System.arraycopy(r,0,u,0,n);
		 return u;
	}
	
	static void bubbleSort(Pais[] a) {
		boolean trocas;
		do {
			trocas = false;
			for(int i = 0 ; i < a.length-1 ; i++){
				if(a[i].dia > (a[i+1].dia)){
					Pais tmp= new Pais();
					tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					trocas = true;
				}
			}
		}while(trocas);
	}
}

class Pais{
	int dia;
	int humidade;
	String nome;
}
