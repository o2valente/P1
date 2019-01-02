import java.util.Scanner;
public class Ex6_5 {
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int numNum = numNum(); //lul numunumnumnum :D
		double[] seq = new double[numNum];
		seq = lerSeq(seq,numNum);
		double media = media(seq,numNum);
		double desvioPadrao = desvioPadrao(seq,numNum,media);
		System.out.println("A media é "+media);
		System.out.println("O desvio padrao é "+desvioPadrao);
		supMedia(seq,numNum,media);
	}
	
	public static int numNum(){
		int numNum = 0;
		while(numNum <= 0){
			System.out.print("Quantos numeros deseja inserir? ");
			numNum = reader.nextInt();
			if(numNum > 0) break;
			System.out.println("Numero invalido !!");
		}
		return numNum;
	}
	
	public static double[] lerSeq(double[] seq, int numNum){
		for(int i =0; i <= numNum-1;i++){
			System.out.print("Insira um numero: ");
			double num = reader.nextDouble();
			seq[i] = num;
		}
		System.out.println();
		return seq;
	}
	
	public static double media(double[] seq,int numNum){
		double media=0;
		for(int i =0; i <= numNum-1;i++){
			media += seq[i];
		}
		media /= numNum;
		return media;
	}
	
	public static double desvioPadrao(double[] seq,int numNum, double media){
		double calcInter = 0;
		for(int i =0;i <= numNum-1;i++){
			calcInter += (Math.pow((seq[i]-media),2));
		}
		double desvioPadrao = Math.sqrt(calcInter/numNum);
		return desvioPadrao;
	}
	
	public static void supMedia(double[] seq, int numNum, double media){
		System.out.print("Numeros maiores que a media: ");
		for(int i = 0; i <= numNum-1;i++){
			if(seq[i] > media) System.out.print(seq[i]+" ");
		}
	}
}

