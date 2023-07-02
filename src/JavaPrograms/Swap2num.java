package JavaPrograms;
//How do you swap two numbers without using a third variable in Java?

public class Swap2num {

	public static void main(String[] args) {
		int a=1,b=5;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A after swap is "+a+" B after swap is "+b);
	}

}
