import java.util.*;
public class Ex1_17{
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Insira o valor dos produtos: ");
		double produtos = reader.nextDouble();
		
		System.out.print("Insira o valor do desconto(pode ser zero) em percentagem: ");
		double desconto = reader.nextDouble();
		
		System.out.print("Insira o valor do IVA(pode ser zero) em percentagem: ");
		double iva = reader.nextDouble();
		
		desconto = produtos*(desconto/100); //valor que vai ser retirado ao produto
		
		iva = produtos*(iva/100); //valor que vai ser adicionado ao produto
		
		double totalLiquido = (produtos - desconto + iva);
		
		System.out.print("O total liquido da fatura é " + totalLiquido + " euros");
		
	}
}

