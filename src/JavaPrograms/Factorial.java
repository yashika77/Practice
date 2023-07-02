package JavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,x;
		long fact=1;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	x= sc.nextInt();
	sc.close();
	
	for(i=1;i<=x;i++)
	{
		fact=fact*i;
	
	}
		System.out.println("The factorial of "+x+" is "+fact);
	}

}
