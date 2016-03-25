//Binary Search in sorted array

package Lecture3;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter a sorted array of 5 elements: ");
		int i = 0;
		while(i < arr.length){
			arr[i] = s.nextInt();
			i++;
		}
		
		System.out.println("Enter the element to be searched: ");
		int n = s.nextInt();
		
		i = 0;
		int first = 0, last = arr.length - 1; 
		boolean flag = false;
		int mid = (first + last)/2;
		while(first <= last){
			if(n == arr[mid]){
				flag = true;
				break;
			}
			if(n > arr[mid]){
			first = mid + 1;
			mid = (first + last)/2;
			}
			if(n < arr[mid]){
			last = mid - 1;
			mid = (first + last)/2;
			}
		
		}
		
		if(flag == true)
			System.out.println("Element found!");
		else
			System.out.println("Element does not exist!");
		
			

	}

}
