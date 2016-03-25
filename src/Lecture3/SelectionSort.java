// selection sort

package Lecture3;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int arr[] = new int[5];
		int i = 0;
		
		System.out.println("Enter the array: ");
		while(i < arr.length){
			arr[i] = s.nextInt();
			i++;
		}
		
		i = 0;
		while(i < arr.length){
			int j = i;
//			int min = arr[j];
			int minpos = j;
			int min = Integer.MAX_VALUE;
			
			while(j < arr.length-1){
				if(arr[j] > arr[j+1]){
//					min = arr[j+1];
					min = j+1;
					if(arr[min] < arr[minpos])
						minpos = j+1;
				}
				j++;
			}
			i++;
			int temp = arr[i-1];
			arr[i-1] = arr[minpos];
			arr[minpos] = temp;
		}
		i = 0;
		System.out.print("Sorted array is: " );
		while(i < arr.length){
			System.out.print(arr[i] + " ");
			i++;
			
		}
	}

}
