import java.util.Scanner;
public class Mm extends Employees{

	/**
	 * @param args
	 */
	void month() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Employee name:");
		Ename = input.next();
		System.out.println("Please enter Employee number:");
		Enumber = input.nextInt();
		System.out.println("Please enter Employee salary:");
		gros_salary = input.nextFloat();
		tax = gros_salary*25/100;
		rssb= gros_salary*5/100;
		salary= gros_salary-tax-rssb;
		System.out.println("Employee name:");
		System.out.println(Ename);
		System.out.println("Employee number:");
		System.out.println(Enumber);
		System.out.println("Employee gross salary:");
		System.out.println(gros_salary);
		System.out.println("Employee net salary:");
		System.out.println(salary);
		
		

	}

}
