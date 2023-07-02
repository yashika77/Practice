package JavaPrograms;

public class CheckFibonacciNumber 
{

	public static void main(String[] args) 
	{
		int n=55;
		boolean isFibonacci= false;
		
		if(n==0 ||n==1)
		{
			isFibonacci=true;
		}
		else
		{
			int firstNum=0;
			int secondNum=1;
			int sum;
			for(int i=1;i<n;i++)
			{
				sum=firstNum+secondNum;
				firstNum=secondNum;
				secondNum=sum;
				
				if(sum==n)
				{
					isFibonacci=true;
					break;
				}
				
			}
			if(isFibonacci)
				System.out.println("Number is Fibonacci");
			else
				System.out.println("Number is not Fibonacci");
		}	
	}

}
