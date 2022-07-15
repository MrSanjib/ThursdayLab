package basicprogram;

public class FactorialValue1To10 {

	public static void main(String[] args) {
		int n,fact=1;
		for(n=1; n<=10; n++)
		{
			fact=fact*n;
		System.out.println( "The Factorial of " +n +" is "  + fact);
		}

	}

}
