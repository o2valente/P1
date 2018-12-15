import java.util.Scanner;
public class Ex3_12 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Jogo AltoBaixo");
		
		int secret = (int)(100.0*Math.random()) + 1; //gera o numero secreto
		
		int valor = 0; //colocar aqui um valor !(1 até 100)
		
		int count = 0;
		
		String resp = "s"; //incializa em s para começar imediatamente um jogo
		
		while((resp.equals("s"))){
			while(valor != secret){
				System.out.print("Introduza um numero: ");
				valor = reader.nextInt();
				
				if(valor > secret) System.out.println("Alto!");
				if(valor < secret) System.out.println("Baixo!");
				
				count++;
			}
			
			valor = 101;
		
			System.out.println("Acertou! O numero secreto era " + secret + "! Fez " + count + " tentativas!");
			System.out.print("Novo jogo (s/n)? ");
			resp = reader.next();
			if(!((resp.equals("s")) || resp.equals("n"))){
				System.out.print("Responda com s ou n!");
				System.exit(0);
			}
			
			secret = (int)(100.0*Math.random()) + 1; //gera novo secret 
			count = 0; //reset ao count
		}
	}
}

