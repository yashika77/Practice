package StringPrograms;

public class CharOccurenceCount 
{

	public static void main(String[] args) 
	{
		String str= "My little programming world";
		int count=0;
		char ch='i';
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
