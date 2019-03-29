import java.util.Scanner;
public class w extends Employees  {

	/**
	 * @param args
	 */
	 void hour(){
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter Employee name:");
			Ename = input.next();
			System.out.println("Please enter Employee number:");
			Enumber = input.nextInt();
			System.out.println("enter days worked:");
			day= input.nextInt();
			System.out.println("Enter day rate:");
	         rate= input.nextFloat();
	         if(day>5){
	        	 gros_salary= day*rate;
	        	 bonus= gros_salary*20/100;
	        	 salary = gros_salary+bonus;
	         }
	         else{
	        	 gros_salary=day*rate;
	        	 salary= gros_salary;
	         }
	         System.out.println("Employee name:");
	 		System.out.println(Ename);
	 		System.out.println("bonus of 20% for more than 5 days");
	 		
	 		System.out.println("Employee number:");
	 		System.out.println(Enumber);
	 		System.out.println("Employee gross salary:");
	 		System.out.println(gros_salary);
	 		System.out.println("Employee net salary:");
	 		System.out.println(salary);
	 		System.out.println("Employee bonus:");
	 		System.out.println(bonus);

	}

}
