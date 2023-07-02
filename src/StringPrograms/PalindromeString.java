package StringPrograms;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) 
	{
		String r="", o;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to be checked for palindrome ");
		
		
		o=sc.nextLine();
		
		int length=o.length();
		
		for(int i=length-1;i>=0;i--)
		{
			r=r+o.charAt(i);
		}
		if(o.equals(r))
		{
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is not Palindrome");

	}

}
