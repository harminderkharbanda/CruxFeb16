//Input name and marks of 3 tests. Print name and average of best 2 tests

package Assignment2;

import java.util.Scanner;

public class AverageBest2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter name of first test: ");
		String name1 = s.next();
		System.out.print("Enter marks of first test: ");
		float marks1 = s.nextFloat();
		
		System.out.print("Enter name of second test: ");
		String name2 = s.next();
		System.out.print("Enter marks of second test: ");
		float marks2 = s.nextFloat();
		
		System.out.print("Enter name of third test: ");
		String name3 = s.next();
		System.out.print("Enter marks of third test: ");
		float marks3 = s.nextFloat();
		
		float average;
		
		if(marks1 < marks2 && marks1 < marks3){
			average = (marks2 + marks3)/2;
			System.out.println("Names of best 2 tests are: " + name2 + " and " + name3 );
			System.out.println("Average of best 2 tests is: " + average);
		}else if(marks2 < marks1 && marks2 < marks3){
			average = (marks1 + marks3)/2;
			System.out.println("Names of best 2 tests are: " + name1 + " and " + name3 );
			System.out.println("Average of best 2 tests is: " + average);
		}else{
		average = (marks2 + marks1)/2;
		System.out.println("Names of best 2 tests are: " + name1 + " and " + name2 );
		System.out.println("Average of best 2 tests is: " + average);
		}
		
		

	}

}
