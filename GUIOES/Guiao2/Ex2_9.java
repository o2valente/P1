import java.util.*;
public class Ex2_9 {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Conversor de Temperaturas");
		
		System.out.print("Insira um valor de temperatura: ");
		double valor = reader.nextDouble();
		
		System.out.println("A sua temperatura está em ");
		System.out.println("0 - Celsius");
		System.out.println("1 - Fahrenheit");
		System.out.print("Escolha: ");
		int escolha = reader.nextInt();
		
		if(escolha == 0){
			double fahr = 1.8*valor+32;
			System.out.print(valor + " ºCelsius é equivalente a " + fahr + " ºFahrenheit");
		}
		else if(escolha == 1){
			double cels = (valor-32)/1.8;
			System.out.print(valor + " ºFahrenheit é equivalente a " + cels + " ºCelsius");	
		}
		else{
			System.out.print("Por favor insira 0 ou 1");
			System.exit(0);
		}
	}
}

