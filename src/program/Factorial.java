package program;

public class Factorial {

	public static void main(String[] args)
	{
	int number=5;
	int factorial=number;
	for(int i=number-1;i>1;i--)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial of a given number is :"+   factorial);
	}

}
