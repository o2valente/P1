import java.util.Scanner;
public class Ex3_4 {
	
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Jogo AltoBaixo");
		
		int secret = (int)(100.0*Math.random()) + 1; //gera o numero secreto
		
		int valor = 0; //colocar aqui um valor !(1 até 100)
		
		int count = 0;
		
		while(valor != secret){
			System.out.print("Introduza um numero: ");
			valor = reader.nextInt();
			
			if(valor > secret) System.out.println("Alto!");
			if(valor < secret) System.out.println("Baixo!");
			
			count++;
		}
		
		System.out.print("Acertou! O numero secreto era " + secret + "! Fez " + count + " tentativas!");
		
	}
}

