package basicprogram;
/*
 * print the pattern:
1
12
123
1234
12345
 */

public class PatternWithNum {

	public static void main(String[] args) {
		int n=5, i,j;
		
		for(i=1;i<=n; i++) //row
		{
			for(j=1;j<=i;j++) // column
			{
				System.out.print(j);
		}
		  System.out.println();
		}
	}

}


