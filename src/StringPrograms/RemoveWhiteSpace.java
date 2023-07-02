package StringPrograms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "Remove white space";
		
		str= str.replaceAll("\\s", "");//where \\s is a single space in unicode
		
		System.out.println(str);

	}

}
