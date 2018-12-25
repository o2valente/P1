import java.util.Scanner;
public class Ex5_3 {
	
	static Scanner reader = new Scanner(System.in);
	public static void main (String[] args) {
		int month = getMonthRange();
		int year = getYearRange();
		numDays(month, year);
	}
	
	public static int getMonthRange(){
		int month = 0;
		while(month < 1 || month > 12){
			System.out.print("Insira um mes: ");
			month = reader.nextInt();
			if(month >= 1 && month <= 12) break;
			System.out.println("Mes Inválido!!");
		}
		return month;
	}
	
	public static int getYearRange(){
		int year = 0;
		while(year <= 0){
			System.out.print("Insira um ano: ");
			year = reader.nextInt();
			if(year > 0) break;
			System.out.println("Ano Inválido!!");
		}
		return year;
	}
	
	public static void numDays(int month, int year){
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.print("O mes " + month + " do ano " + year + " tem 31 dias");
				break;
			case 4: case 6: case 9: case 11:
				System.out.print("O mes " + month + " do ano " + year + " tem 30 dias");
				break;
			case 2:
				if(year % 4 == 0  && (year % 100 != 0)) System.out.print("O mes " + month + " do ano " + year + " tem 29 dias");
				else System.out.print("O mes " + month + " do ano " + year + " tem 28 dias");
				break;
			default: System.exit(0);
		}
	}
	
}

