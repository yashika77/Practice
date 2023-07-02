package StringPrograms;

public class ReplaceCharCase {

	public static void main(String[] args) {
		String str= "My name IS YashikA";
		StringBuffer str1= new StringBuffer(str);
		
		for (int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else
				str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		}
		System.out.println(str1);

	}

}
