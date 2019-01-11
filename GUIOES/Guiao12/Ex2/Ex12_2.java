import java.util.Scanner;
import java.io.*;
public class Ex12_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int opc;
		Piloto[] pilotos = new Piloto[10];
		do{
			System.out.println();
			System.out.println("Gestão de uma prova automóvel:");
			System.out.println("1 - Inserir informação dos pilotos");
			System.out.println("2 - Listar pilotos ordenados pelo número da viatura");
			System.out.println("3 - Alterar informação de um piloto");
			System.out.println("4 - Remover piloto com base no número da viatura");
			System.out.println("5 - Listar pilotos ordenados pelo nome");
			System.out.println("6 - Remover piloto(s) com base no nome");
			System.out.println("7 - Validar matriculas");
			System.out.println("8 - Terminar o programa");
			System.out.print("Opção -> ");
			opc = sc.nextInt();
			System.out.println();
			
			switch(opc){
				case 1:  pilotos = info(pilotos); break;
				case 2:  listar(pilotos); break;
				case 3:  pilotos = alterar(pilotos); break; 
				case 4:  pilotos = remover(pilotos); break;
				case 5:  break;
				case 6:  break;
				case 7:  break;
				case 8: System.exit(0); break;
			}
			
		}while(true);
	}
	
	public static Piloto[] info(Piloto[] pilotos){
		System.out.println("Introduçao da info dos pilotos, insira um nome vazio para parar ou insira 10 pilotos");
		for(int i = 0;i < pilotos.length-1;i++){
			System.out.print("Nome do piloto: ");
			String nome = sc.next();
			if(nome.equals("a")) break;
			pilotos[i]= new Piloto(); 
			pilotos[i].nome = nome;
			System.out.print("Matricula da viatura: ");
			pilotos[i].matricula = sc.next();
			pilotos[i].nrViatura = i+1; 
		}
		return pilotos;
	
	}
	
	public static void listar(Piloto[] pilotos){
		boolean trocas;
		int tmp;
		do {
			trocas = false;
			for(int i = 0 ; i < pilotos.length-1 ; i++){
				if(pilotos[i] != null && pilotos[i+1] != null){
					if(pilotos[i].nrViatura < (pilotos[i+1].nrViatura)){
						tmp = pilotos[i].nrViatura;
						pilotos[i].nrViatura = pilotos[i+1].nrViatura;
						pilotos[i+1].nrViatura = tmp;
						trocas = true;
					}
				}
			}
		}while(trocas);
		
		for(int i =0;i < pilotos.length-1;i++){
			if(pilotos[i] != null){
				System.out.println("Numero da viatura: "+pilotos[i].nrViatura);
				System.out.println("Nome: "+pilotos[i].nome);
				System.out.println("Matricula: "+pilotos[i].matricula);
				System.out.println();
			}
		}
	}
	
	public static Piloto[] alterar(Piloto[] pilotos){
		System.out.print("Qual o numero de viatura que quer alterar: ");
		int num = sc.nextInt();
		boolean existe = false;
		for(int i=0;i< pilotos.length-1;i++){
			if(pilotos[i] != null){
				if(pilotos[i].nrViatura == num){
					System.out.print("Insira o novo nome: ");
					pilotos[i].nome = sc.next();
					System.out.print("Insira uma nova matricula: ");
					pilotos[i].matricula = sc.next();
					existe = true;
				}
			}
		}
		if(existe == false) System.out.println("Viatura não existe!!");
		return pilotos;
	}
	
	public static Piloto[] remover(Piloto[] pilotos){
		System.out.print("Qual o numero de viatura que quer remover: ");
		int num = sc.nextInt();
		boolean existe = false;
		for(int i=0;i< pilotos.length-1;i++){
			if(pilotos[i] != null){
				if(pilotos[i].nrViatura == num){
					pilotos[i] = null;
					existe = true;
				}
			}
		}
		if(existe == false) System.out.println("Viatura não existe!!");
		return pilotos;
	}
}

class Piloto{
	int nrViatura;
	String nome;
	String matricula;
		
}
