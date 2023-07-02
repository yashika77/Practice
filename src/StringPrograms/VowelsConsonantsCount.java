package StringPrograms;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		String str= "My name is Yashika";
		int vowcount=0, concount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowcount++;
			}
			else if(str.charAt(i)!= ' ')
			concount++;
			
		}
		System.out.println("The number of vowels present in this string are "+vowcount+ " and consonants are "+concount);
	}

}
