import java.util.*;
public class Ex1_12 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Insira o tempo em segundos: ");
		int segundos = reader.nextInt();
		
		int horas = segundos / 3600;		
		int minutos = ((segundos%3600)/60);
		segundos = ((segundos%3600)%60);
		
		System.out.printf("%02d:%02d:%02d", horas, minutos, segundos); 
		// %02d 
		// 0 - preenche com zeros se não tiver dois carateres
		// 2 - obriga a ter dois carateres
		// d - int
	}
}

