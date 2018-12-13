import java.util.*;
public class Ex2_4 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Insira a data");
		
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
		
		switch(mes){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.print("O mes " + mes + " do ano " + ano + " tem 31 dias");
				break;
			case 4: case 6: case 9: case 11:
				System.out.print("O mes " + mes + " do ano " + ano + " tem 30 dias");
				break;
			case 2:
				if(ano % 4 == 0  && (ano % 100 != 0)) System.out.print("O mes " + mes + " do ano " + ano + " tem 29 dias");
				else System.out.print("O mes " + mes + " do ano " + ano + " tem 28 dias");
				break;
			default: System.exit(0);
		}
		
		
	}
}

