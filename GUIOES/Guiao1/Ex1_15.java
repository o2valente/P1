import java.util.*;
public class Ex1_15{
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Pesos das Notas: TP1 15%, TP2 15%, API 30% e EP 40%");
		
		System.out.print("Nota do TP1: ");
		int tp1 = reader.nextInt();
		
		System.out.print("Nota do TP2: ");
		int tp2 = reader.nextInt();
		
		System.out.print("Nota do API: ");
		int api = reader.nextInt();
		
		System.out.print("Nota do EP: ");
		int ep = reader.nextInt();
		
		double notaFinal = tp1*0.15 + tp2*0.15 + api*0.30 + ep*0.40;
		
		System.out.print("A Nota Final do aluno é: " + notaFinal);
	}
}

