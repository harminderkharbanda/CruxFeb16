package Lecture3;

import java.util.Scanner;

public class ArrayExample {

	
	public static int sumOfArray(int arr[]){
		int i = 0;
		int sum = 0;
		while(i < arr.length){
			sum = sum + arr[i];
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int array [] = new int[5];
		
		int i = 0;
		while(i < array.length){
			System.out.println("Enter " + (i + 1) + "th element: ");
			array[i] = s.nextInt();
			i++;
		}
		
		System.out.println(sumOfArray(array));
		
	}

}
