package Lecture3;

import java.util.Scanner;

public class SubString {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String value = s.next();
		
		System.out.println(" ");
		int length = value.length();
		int i = 0;
//My version
//		while(i < value.length()){
//			 System.out.println(value.charAt(i));
//			 i++;
//		 }
//		 
//		 i = 0;
//		 while(i < value.length()){
//			 int j = 0;
//			 while(j < value.length()-i-1){
//			 System.out.println(value.substring(j, j+i+2));
//			 j++;
//			 }
//			 i++;
//		 }
// Better version		
		while(i < length){
			int j = i;
			while(j < length){
				System.out.println(value.substring(i, j+1));
				j++;
			}
			i++;
		}
		 
		 
	}

}
