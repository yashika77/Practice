package StringPrograms;

public class ReplaceSpaceWithSpecificChar {

	public static void main(String[] args) {
		String str= "Hello World how is life";
		char ch='-';
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str= str.replace(' ', ch);
			}
				
		}
		System.out.println(str);
		

	}

}
