import java.text.DecimalFormat;
public class Ex4_5 {
	
	public static void main (String[] args) {
		
		DecimalFormat format = new DecimalFormat();
		
		int a,b;
		double c = 0;
		
		for(a=1; a < 100; a++){
			for(b=1; b < 100; b++){
				if(a<b){
					c = Math.pow(a,2) + Math.pow(b,2);
					c = Math.sqrt(c);
					if(c == (int)c){
						System.out.print(a + " " + b + " ");
						System.out.println(format.format(c)); 
					}
				}
			}
		}
	}
}

