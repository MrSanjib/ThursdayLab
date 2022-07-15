// calculate Armstrong Number 1 to 500..
package basicprogram;

public class ArmstrongNo1To100 {
	public static void main(String[] args)
	{
		int n, temp ,rem, sum=0;
		System.out.println("Armstrong numbers from 1 to 500 are: ");
		for( n=1; n<=500; n++)
			{
				temp = n; //storing the value of n in temp variable
				
				while(temp!=0) //checking whether the number is not equal to zero
				{
					rem = temp%10; // finding the remainder
					sum += rem*rem*rem; //adding sum with rem 3 times
					temp =temp/10;
				}
				if(sum==n) //checking if sum is equal to the value of n
				{
					System.out.println(n);
				}
				sum=0; //setting the value of sum =0
		}
	}

}
