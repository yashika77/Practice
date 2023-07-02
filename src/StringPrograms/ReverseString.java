package StringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String r="",o;
		int l;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Type the string to be reversed");
		o=sc.nextLine();
		l= o.length();
	
		for(int i=l-1;i>=0;i--)
		{
			r=r+o.charAt(i);
		}
		
		System.out.println(r);
		

	}

}
