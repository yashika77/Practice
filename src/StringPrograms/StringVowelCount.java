package StringPrograms;

import java.util.Scanner;

public class StringVowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
		
		char []chars=str.toCharArray();
		
		int count=0;
		
		for (char c : chars) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;		
			
		}}
			System.out.println(count);
		

	}

}