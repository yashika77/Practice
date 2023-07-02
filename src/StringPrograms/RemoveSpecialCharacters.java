package StringPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) 
	{
		String str= "J!a*v)a Pr(og&ra@m";
		//this replaceAll method would replace everything other than the specified characters with an empty space
		String str1= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
	}

}
