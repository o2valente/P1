import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  
  public static void printHora(Hora hora){
	  System.out.printf("%02d:%02d:%02d",hora.h,hora.m,hora.s);
  }
  
  public static Hora lerHora(){
	  Hora hora = new Hora();
	  hora.h = -1;
	  hora.m = -1;
	  hora.s = -1;
	  
	  while(hora.h < 0 || hora.h > 23){
		System.out.print("Insira a hora: ");
		hora.h = sc.nextInt();
	  }
	  
	  while(hora.m < 0 || hora.m > 59){
		  System.out.print("Insira os minutos: ");
		  hora.m = sc.nextInt();
	  }
	  
	  while(hora.s < 0 || hora.s > 59){
		  System.out.print("insira os segundos: ");
		  hora.s = sc.nextInt();
	  }
	  
	  return hora;
	
  }
  
}

class Hora {
	int h,m,s;
	
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
