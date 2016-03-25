//count the number of characters, lines and words from the input

package Assignment3StringsArrays1;

import java.util.Scanner;

public class NoOfCharactersLinesWords {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the iput terminated by a $: ");
		
		String str = s.next();
		int words = 1;
		while(str.charAt(str.length()-1) != '$'){
			String next = s.next();
			words++;
			str = str + next;
		}
		
		int ch = 0;
		int lines = 1;
		//int words = 0;
		int i = 0;
		
		while(i < str.length()){
			if(str.charAt(i) != '\0'){
				ch++;
			}
//			if(str.charAt(i) == ' '){
//				words = words + 1;
//			}
			if(str.charAt(i) == '\n'){
			lines = lines + 1;
		}
			i++;
		}
		
		System.out.println("Number of characters are: " + ch);
		System.out.println("Number of words are: " + words);
		System.out.println("Number of lines are: " + lines);
	}

}
