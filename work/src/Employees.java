import java.util.Scanner;
public class Employees {

	/**
	 * @param args
	 */
	float salary;
	float gros_salary;
	float tax;
	float rssb;
	float rate;
	float bonus;
	int h;
	int day;
	String Ename;
	int Enumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		int work;
		
		System.out.println("Please use 1 for monthly employee, 2 for hourly and 3 for weekly:");
		work = input.nextInt();
		switch(work){
		case 1:
			Mm netsa = new Mm();
			netsa.month();
			break;
		case 2:
			hours net = new hours();
			net.hh();
			break;
		case 3:
			w nets = new w();
			nets.hour();
			break;
		}
		
	}

}
