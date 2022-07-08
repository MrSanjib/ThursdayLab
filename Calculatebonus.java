import java.util.*;
public class Calculatebonus{
	public static void main(String[] args){
		int curyear,joinyear,seryear, bonus=0;
		System.out.println("enter current year :");
		Scanner sc=new Scanner(System.in);
		curyear=sc.nextInt();
		System.out.println("Enter joinng year :");
		joinyear=sc.nextInt();
		seryear=curyear-joinyear;
		if(seryear>3){
			bonus=2500;
		System.out.println( "Increment in bunus is" + bonus);
		}
		else
			System.out.println("you are not eligible for Increment");
		
	}
}