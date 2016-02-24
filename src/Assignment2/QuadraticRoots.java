//Print the roots of quadratic equation. Also specify type of roots

package Assignment2;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		System.out.println("Enter values of a,b and c of the quadratic equation: ");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int d = (b * b) - (4 * (a * c));
		
		//float root1 = (-b + Math.sqrt(d)) / 2 * a;
		
		
		if(d == 0){
			System.out.println("The roots are real and equal");
			double root1 = (-b + Math.sqrt(d)) / 2 * a;
			System.out.println("Roots are: " + root1);
		}
		
		if(d > 0){
			System.out.println("The roots are real and unequal");
			double root1 = (-b + Math.sqrt(d)) / 2 * a;
			double root2 = (-b - Math.sqrt(d)) / 2 * a;
			System.out.println("Roots are: " + root1 + " and " + root2);
		}
		
		if(d < 0){
			System.out.println("The roots are unreal");
			System.out.println("Roots are: " + (-b)/2 * a + " + " + (Math.sqrt(-d) / 2 * a) + "i and " + (-b)/2 * a + " + " + (-(Math.sqrt(-d)) / 2 * a) + "i");
		}
		
	}

}
