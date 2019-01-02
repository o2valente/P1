import java.util.*;
public class Ex6_2 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int[] seq = guardarSeq();
		System.out.print("Insira um numero que quer procurar na sequencia: ");
		int num = reader.nextInt();
		int count =0;
		for(int i =0; i < 100; i++){
			if(seq[i]==num) count++;
		}
		
		System.out.print("O numero " + num + " apareceu "+ count+" vezes");
	}
	
	public static int[] guardarSeq(){
		int[] seq = new int[100];
		System.out.println("Insira um numero positivo na sequencia, poderá inserir até 100 numeros");
		for(int i =0; i < 100;i++){
			System.out.print("Numero: ");
			int x = reader.nextInt();
			if(x < 0) break;
			seq[i] = x;
		}
		return seq;
	}
}

