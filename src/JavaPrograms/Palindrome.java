package JavaPrograms;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		int temp=num, sum=0,r;
		
		
		while(num>0)
		{
			r=num%10;
			sum= (sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
		
		

	}

}
