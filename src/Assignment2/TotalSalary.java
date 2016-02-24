// Calculate total salary
package Assignment2;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter basic salary: ");
		//double basic = s.nextDouble();
		float basic = s.nextFloat();
		
		System.out.print("Enter grade (A/B/C): ");
		char grade = s.next().charAt(0);
		
//		float hra = basic * 0.2;
//		float da = 0.5 * basic;
		
		double hra = basic * 0.2;
		double da = 0.5 * basic;
		double pf = 0.11 * basic;
		double tsal;
		
		int allow = 0;
		
		if(grade == 'A')
			allow = 1700;
		if(grade == 'B')
			allow = 1500;
		if(grade == 'C')
			allow = 1300;
			
		tsal = basic + hra + da + allow - pf;
		
		System.out.println("Total salary is: " + tsal);

	}

}
