import java.util.Scanner;

class Ponto2D {
	double x,y;	
}

class TestPonto {
	static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {	
		
		Ponto2D ponto = lerPonto();
		Ponto2D origem = new Ponto2D();
		Ponto2D afastado = new Ponto2D();
		origem.x = 0;
		origem.y = 0;
		double dist = 0;
		double somaDist = 0; 
		double distMin = 1000000;
		int count = 0;
		
		while(ponto.x != 0 || ponto.y != 0){
			dist = distPontos(ponto,origem);
			somaDist += dist;
			if(distPontos(ponto,origem) < distMin) afastado = ponto;
			count++;
			ponto = lerPonto();
		}
		
		System.out.printf("A soma das distâncias dos %d pontos à origem é %.1f \n",count,somaDist);
		System.out.print("O ponto mais afastado da origem foi: ");
		escPonto(afastado);
	}
	
	public static Ponto2D lerPonto(){
		Ponto2D ponto = new Ponto2D();		
		System.out.println("Introduza um ponto: ");
		System.out.print("Coordenada x: ");
		ponto.x = sc.nextDouble();
		System.out.print("Coordenada y: ");
		ponto.y = sc.nextDouble();
		
		return ponto;
	}
	
	public static void escPonto(Ponto2D ponto){
		System.out.printf("(%2.1f , %2.1f)",ponto.x,ponto.y);
	}
	
	public static double distPontos(Ponto2D ponto1, Ponto2D ponto2){
		double dist;
		dist = Math.sqrt(Math.pow((ponto2.x - ponto1.x),2) + Math.pow((ponto2.y - ponto1.y),2));
		return dist;
	}
}

