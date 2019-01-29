//MIECT João Rodrigues 88856


import java.util.*;
import java.io.*;
public class test3 {
		static Scanner sc = new Scanner(System.in);
		static int count = 0;														// posso usar esta variavel global para manter o track do length do array com que estou a trabalhar
	public static void main (String[] args) throws IOException {
		Robo[] lista = new Robo[15];
		int op = -1;
		
		do{
			System.out.println();
			System.out.println("Micro-Rato 2013 - Gestão da prova:");
			System.out.println("1 - Adicionar informação relativa a um robô");
			System.out.println("2 - Imprimir informação dos robôs em prova");
			System.out.println("3 - Vencedor da prova e tempos médios de prova");
			System.out.println("4 - Média do número de elementos por equipa");
			System.out.println("5 - Mostrar o nome dos robôs em maiúsculas");
			System.out.println("6 - Alterar informação de um robô");
			System.out.println("7 - Remover robôs da competição");
			System.out.println("8 - Gravar informação da prova num ficheiro");
			System.out.println("9 - Terminar o programa");
			System.out.print("Opção -> ");
			op = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(op){
				case 1 : lista = introduzir(lista);break;
				case 2 : imprimir(lista);break;
				case 3 : winnerwinnerchickendinner(lista);break;
				case 4 : mediaMembers(lista);break;
				case 5 : nomes(lista);break;
				case 6 : lista = alterar(lista);break;
				case 7 : lista = remover(lista);break;
				case 8 : gravar(lista);break;
				case 9 : System.exit(0);break;
			}
			
		}while(true);
		
		
	}
	
	public static Robo[] introduzir(Robo[] l){
		System.out.println("Nome do Robo: ");
		String n = sc.nextLine();
		System.out.println("Tempo de Prova(segundos): ");
		int s = sc.nextInt();
		System.out.println("Numero de elementos do grupo: ");
		int e = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < l.length; i++){
			if(l[i] == null){                                        // posso fazer usando o  == null
				l[i] = new Robo(n,s,e);
				count++;
				//System.out.println("7777-- : " + count);
				break;
			}
		}
		return l;
	}
	
	public static void imprimir (Robo[] l){
		
		for (int i = 0 ; i < count; i++){
			System.out.println( "Nome: " + l[i].nome + " | Tempo :" + horas(l[i].tempo) + " | Nº de Elementos: " + l[i].elem);
		}
		
	}
	
	public static void winnerwinnerchickendinner  (Robo[] l){
		int totalTime = 0;
		int minValue = l[0].tempo;
		int indice= 0;
		
		for(int i = 0; i < count; i++){
			totalTime += l[i].tempo;
			if(l[i].tempo < minValue){
				minValue = l[i].tempo;
				indice = i;
			}
		}
		System.out.println("Winner: " + l[indice].toString());
		System.out.println("Media: " + (double)totalTime/(double)count);
	}
	
	public static void mediaMembers (Robo[] l){
		int totalMembers = 0;
		
		for(int i = 0; i < count; i++){
			totalMembers += l[i].elem;
		}
		System.out.println("Media de elemetos: " + (double)totalMembers/(double)count);
		
	}
	
	public static void nomes (Robo[] l){
		boolean trocas;
		do{
			trocas = false;
			for(int i= 0; i< count-1; i++){
				if(l[i+1].nome.compareTo(l[i].nome)< 1){
					Robo tmp = l[i];
					l[i] = l[i+1];
					l[i+1] = tmp;
					trocas = true;
					}
			}	
		}while(trocas);
		
		for(int j = 0; j < count; j++){
			System.out.println("Nome :" + l[j].nome.toUpperCase());
		}
		
	}
	
	public static Robo[]  alterar (Robo[] l){
		
		String s = "";
		do{
			System.out.println("Nome do robo a alterar: ");
			 s = sc.nextLine();
		}while(s.length() == 0);
		boolean existe = false ;
		for(int i = 0; i < count; i++){
			if(l[i].nome.compareTo(s) == 0){
				existe = true;
				System.out.println("Novo nome: ");
				l[i].nome = sc.nextLine();
				System.out.println("Novo tempo de prova(segundos): ");
				l[i].tempo= sc.nextInt();
				System.out.println("Novo nº de elementos: ");
				l[i].elem= sc.nextInt();
				sc.nextLine();
			}
		}
		if(!existe){
			System.out.println("Robo não existe!!");
		}
		return l;
	}
	
	public static Robo[] remover (Robo[] l ){
		System.out.println("Insira um tempo: ");
		int tMax = sc.nextInt();
		sc.nextLine();
		count = 0;
		int x = 0;
		for(int i = 0; i < l.length; i++){
			if(l[i]!= null){
				if(l[i].tempo <= tMax){
					count++;
				}
			}
		}
		Robo[] copyL = new Robo[count];
		
		for(int j = 0; j < l.length; j++){
			if(l[j] != null){
				if(l[j].tempo <= tMax){
					copyL[x++] = l[j];
				}
			}
		}
		return copyL;
	}
	
	public static void gravar(Robo[] l) throws IOException{
		System.out.println("Escolha o ficheiro onde gravar : ");
		String s = sc.nextLine();
		File f = new File (s);
		PrintWriter pw = new PrintWriter(f);
		for (int i = 0; i < count ; i++){
			pw.println(l[i].toString());
		}
		pw.close();
		
	}
	
	
	
	
	public static String horas (int s){
		int horas = s/3600;
		int min =  (s%3600)/60;
		int seg = s% 60;
		
		return horas + " h: " + min + " min: " + seg + " seg "; 
	}
	
}

class Robo{
String nome;
int tempo;
int elem;
	Robo (String n, int t, int e){
		this.nome = n;
		this.tempo = t;
		this.elem = e;
	}
	public String toString(){
		return "Nome: " + nome + "| Tempo: " + tempo + "| Nº de elementos: " + elem ;
	}
}
