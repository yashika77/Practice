package StringPrograms;

public class DivideStringInNEqualParts {
	
	public static void main(String[] args) {
		String str="abcdefghijklmno";
		int n=3;
		int len=str.length();
		int parts= len/n;
		
		if(len%n!=0)
		{
			System.out.println("Cannot be divide into "+n+" equal parts");
		}
		
				for(int i=0;i<len;i++)
				{
					if(i%parts==0)
						System.out.println();
						System.out.print(str.charAt(i));
					
				}
		
			
		
		
	}

}
