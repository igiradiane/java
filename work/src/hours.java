import java.util.Scanner;
public class hours extends Employees{

	/**
	 * @param args
	 */
	 void hh() {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter Employee name:");
		Ename = input.next();
		System.out.println("Please enter Employee number:");
		Enumber = input.nextInt();
		System.out.println("enter hours worked:");
		h= input.nextInt();
		System.out.println("Enter hour rate:");
         rate= input.nextFloat();
         if(h>8){
        	 gros_salary= h*rate;
        	 bonus= gros_salary*5/100;
        	 salary = gros_salary+bonus;
         }
         else{
        	 gros_salary=h*rate;
        	 salary= gros_salary;
         }
         System.out.println("Employee name:");
 		System.out.println(Ename);
 		System.out.println("bonus of 5% for more than 8 hours");
 		
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
