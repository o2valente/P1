import java.util.*;
public class Ex2_10 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Data do dia Seguinte e do dia Anterior");
		
		System.out.print("Insira o dia: ");
		int dia = reader.nextInt();
		
		if(dia < 1 || dia > 31){
			System.out.print("Dia inválido");
			System.exit(0);
		}
		
		System.out.print("Insira o mes: ");
		int mes = reader.nextInt();
		
		if(mes < 1 || mes > 12) {
			System.out.print("Mes inválido");
			System.exit(0);
		}
		
		System.out.print("Insira o ano: ");
		int ano = reader.nextInt();
		
		if(ano < 0){
			System.out.print("Ano inválido");
			System.exit(0);
		}
		
		if(dia == 31 & (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)){
			System.out.print("Data Inválida");
			System.exit(0);
		}
		if(dia == 29 & mes == 2 & (!(ano % 4 == 0  && (ano % 100 != 0)))){
			System.out.print("Data Inválida");
			System.exit(0);
		}
		
		int diaSeguinte=0;
		int diaAnterior=0;
		int mesSeguinte=0;
		int mesAnterior=0;
		int anoSeguinte=0;
		int anoAnterior=0;
		
		if(dia > 1 && dia < 28){
			diaSeguinte = dia + 1;
			diaAnterior = dia - 1;
			mesSeguinte = mes;
			mesAnterior = mes;
			anoSeguinte = ano;
			anoAnterior = ano;
		}
	

		if(dia == 1){
			diaSeguinte = dia + 1;
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12) diaAnterior = 31;
			if(mes == 2 || mes == 4 || mes == 6 || mes == 8 || mes == 9 || mes == 11) diaAnterior = 30;
			if(mes > 1 && mes <= 12){
				mesSeguinte = mes;
				mesAnterior = mes -1;
			}
			if(mes == 1){
				mesSeguinte = mes + 1;
				mesAnterior = 12;
				anoAnterior = ano - 1;
			}
			anoSeguinte = ano;
		
		}
		else if(dia == 30){
			diaAnterior = dia - 1;
			
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12){
				 diaSeguinte = 31;
				 mesSeguinte = mes;
				 mesAnterior = mes;
				 anoAnterior = ano;
				 anoSeguinte = ano;
			 }
			if(mes == 2 || mes == 4 || mes == 6 || mes == 8 || mes == 9 || mes == 11){
				 diaSeguinte = 1;
				mesSeguinte = mes + 1;
				mesAnterior = mes;
				anoSeguinte = ano;
				anoAnterior = ano;
			 }
		}
		else if(dia == 31){
			diaAnterior = 30;
			diaSeguinte = 1;
			
			if(mes >= 1 && mes < 12){
				mesSeguinte = mes + 1;
				mesAnterior = mes;
				anoSeguinte = ano;
				anoAnterior = ano;
			}
			else{
				mesSeguinte = 1;
				mesAnterior = mes;
				anoSeguinte = ano + 1;
				anoAnterior = ano;
			}
			
		}
		else if(dia == 28 && (mes == 2 && (ano % 4 == 0  && (ano % 100 != 0)))){
			diaSeguinte = 29;
			diaAnterior = 27;
			mesSeguinte = mes;
			mesAnterior = mes;
			anoSeguinte = ano;
			anoAnterior = ano;
		}
		else if(dia == 28 && mes == 2 && !(ano % 4 == 0  && (ano % 100 != 0))){
			diaSeguinte = 1;
			diaAnterior = 27;
			mesSeguinte = mes + 1;
			mesAnterior = mes;
			anoSeguinte = ano;
			anoAnterior = ano;
		}
		
		else if(dia == 29){
			diaSeguinte = 1;
			diaAnterior = 28;
			mesSeguinte = mes +1;
			mesAnterior = mes;
			anoSeguinte = ano;
			anoAnterior = ano;
		}
			
		System.out.println("O dia seguinte é " + diaSeguinte + "-" + mesSeguinte + "-" + anoSeguinte);
		System.out.print("O dia anterior é " + diaAnterior + "-" + mesAnterior + "-" + anoAnterior);
		
	}
}

