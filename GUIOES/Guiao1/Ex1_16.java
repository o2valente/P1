import java.util.*;
public class Ex1_16{
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Quanto dinheiro gastou o turista no primeiro dia ? ");
		double dia1 = reader.nextInt();
		
		double dia2 = dia1 + dia1*0.20;
		double dia3 = dia2 + dia2*0.20;
		double dia4 = dia3 + dia3*0.20;
		
		double totalGasto = dia1 + dia2 + dia3 + dia4;
		
		System.out.print("Sendo que no primeiro dia o turista gastou " + dia1 + ", no segundo dia gastou " + dia2 + 
		", no terceiro dia gastou " + dia3 + ", no quarto dia gastou " + dia4 + " sendo que no total gastou " + totalGasto + " euros");
		
	}
}

