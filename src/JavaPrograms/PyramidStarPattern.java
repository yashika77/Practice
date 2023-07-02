package JavaPrograms;

public class PyramidStarPattern {

	
	public static void main(String[] args) 
	{
		int i,j,r=6;
		for(i=0;i<r;i++)
		{
			for(j=r-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
