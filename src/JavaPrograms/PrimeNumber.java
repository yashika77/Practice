package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0,n=83,m=0;
		m=n/2;
		
		if (n==0||n==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
					System.out.println("Prime number");
				}
			}
		}
	}
