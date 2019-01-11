import java.util.Scanner;
import java.io.*;
public class Ex12_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		
		Dados[] dados = new Dados[30];
		int opc=0;
		
		do{
			System.out.println("Estação meteorológica:");
			System.out.println("1 - Ler ficheiro de dados");
			System.out.println("2 - Acrescentar medida");
			System.out.println("3 - Listar valores de temperatura e humidade");
			System.out.println("4 - Listar medidas ordenadas por valor de temperatura e humidade");
			System.out.println("6 - Calcular valores médios de temperatura e humidade");
			System.out.println("7 - Calcular valores máximos e mínimos de temperatura e humidade");
			System.out.println("8 - Calcular histograma das temperaturas e humidade");
			System.out.println("9 - Terminar o programa");
			System.out.print("Opção -> ");
			opc = sc.nextInt();
			
			switch(opc){
				case 1: dados = lerFich(dados); break;
				case 2: dados = acresMed(dados); break;
				case 3: info(dados); break; 
				case 4: ordem(dados); break;
				case 6: media(dados); break;
				case 7: maxMin(dados); break;
				case 8: histograma(dados); break;
				case 9: System.exit(0); break;
			}
			
		}while(true);
			
	}
	
	
	
	
	public static Dados[] lerFich(Dados[] dados) throws IOException{
		String nome = validFich();
		File fin = new File(nome);
		Scanner scf = new Scanner(fin);
		
		for(int i = 0; i < dados.length-1;i++){
			dados[i] = new Dados();
			dados[i].temp = scf.nextInt();
			dados[i].hum = scf.nextInt();
			if(!scf.hasNextInt()) break;
		}
		
		scf.close();
		return dados;
	}
	
	public static Dados[] acresMed(Dados[] dados){
		int opc = 2;
		int num = -11;
		while(opc != 0 && opc != 1){
			System.out.print("Que medidada deseja acrescentar? 0-Temperatura 1-Humidade : ");
			opc = sc.nextInt();
		}
		
		if(opc == 0){
			while(num < -10 || num > 40){
				System.out.print("Indique a temperatura que quer inserir: ");
				num = sc.nextInt();
			}
			for(int i =0; i < dados.length-1;i++){
				if(dados[i] == null){
					 dados[i] = new Dados();
					 dados[i].temp = num;
					 break;
				 }
			}
			System.out.println();
		}else {
			while(num < 0 || num > 100){
				System.out.print("Indique a humidade que quer inserir: ");
				num = sc.nextInt();
			}
			for(int i =0; i < dados.length-1;i++){
				if(dados[i] == null){
					 dados[i] = new Dados();
					 dados[i].hum = num;
					 break;
				 }
			}
			System.out.println();
		}
		
		return dados;
		
	}
	
	public static void info(Dados[] dados){
		System.out.println("Medidas das temperaturas");
		for(int i = 0; i < dados.length-1;i++){
			if(dados[i] != null) System.out.print(dados[i].temp+" ");
		}
		
		System.out.println();

		System.out.println("Medidas da humidade");
		for(int i = 0; i < dados.length-1;i++){
			if(dados[i] != null) System.out.print(dados[i].hum+" ");
		}
		
		System.out.println();
	}
	
	public static void ordem(Dados[] dados){
		int tmp,i, j;
		boolean trocas;
		do {
			trocas = false;
			for(i = 0 ; i < dados.length-1 ; i++){
				if(dados[i] != null && dados[i+1] != null){
					if(dados[i].temp > (dados[i+1].temp)){
						tmp = dados[i].temp;
						dados[i].temp = dados[i+1].temp;
						dados[i+1].temp = tmp;
						trocas = true;
					}
				}
			}
		}while(trocas);
		
		do {
			trocas = false;
			for(i = 0 ; i < dados.length-1 ; i++){
				if(dados[i] != null && dados[i+1] != null){
					if(dados[i].hum < (dados[i+1].hum)){
						tmp = dados[i].hum;
						dados[i].hum = dados[i+1].hum;
						dados[i+1].hum = tmp;
						trocas = true;
					}
				}
			}
		}while(trocas);	
		
		info(dados);
	}
	
	public static void media(Dados[] dados){
		int countTemp = 0,countHum=0;
		double mediaTemp=0,mediaHum=0;
		for(int i = 0; i < dados.length-1;i++){
			if(dados[i] != null){
				mediaTemp += dados[i].temp;
				countTemp++;
			}
		}
		
		for(int i = 0; i < dados.length-1;i++){
			if(dados[i] != null){
				mediaHum += dados[i].hum;
				countHum++;
			}
		}
		
		System.out.println("A média das temperaturas é " + mediaTemp/countTemp);
		System.out.println("A média das humidaddes é " + mediaHum/countHum);
		System.out.println();
	}
	
	public static void maxMin(Dados[] dados){
		int maxTemp=-11,minTemp=-11,maxHum=-11,minHum=-11;
		for(int i = 0;i < dados.length-1;i++){
			if(dados[i] != null){
				if(dados[i].temp < minTemp) minTemp = dados[i].temp;
				if(dados[i].temp > maxTemp) maxTemp = dados[i].temp;
				if(dados[i].hum < minHum) minHum = dados[i].hum;
				if(dados[i].hum > minHum) maxHum = dados[i].hum;
			}
		}
		System.out.println("A temperatura minima é "+minTemp);
		System.out.println("A temperatura maxima é "+maxTemp);
		System.out.println("A humidade minima é "+minHum);
		System.out.println("A humidade maxima é "+maxHum);
	}
	
	public static void histograma(Dados[] dados){
		System.out.println("Histograma da Temperatura");
		System.out.println("-------------------------");
		for(int i = -10;i <=40;i++){
			System.out.printf("%3d |",i);
			for(int j =0;j< dados.length-1;j++){
				if(dados[j] != null){
					if(dados[j].temp == i) System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Histograma da Humidade");
		System.out.println("-------------------------");
		for(int i = 0;i <=100;i++){
			System.out.printf("%3d |",i);
			for(int j =0;j< dados.length-1;j++){
				if(dados[j] != null){
					if(dados[j].hum == i) System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	
	public static String validFich() throws IOException{
		System.out.print("Introduza o nome do ficheiro('dados.txt'): ");
		String nomeFich = sc.next();
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
}

class Dados{
	public int temp,hum;
}
