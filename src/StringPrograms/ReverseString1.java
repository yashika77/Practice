package StringPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="Hello";
		//Approach-1 , using charAt method of string class
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		//Approach-2, using toCharArray
		char [] chArr= str.toCharArray();
		
		for(int i= chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}
		System.out.println();
		//Approach-3, using reverse method by StringBuffer
		
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println();
		
		//Approach-4, using reverse method by StringBuilder
		
		StringBuilder sb1= new StringBuilder(str);
		System.out.print(sb1.reverse());
		

	}

}
