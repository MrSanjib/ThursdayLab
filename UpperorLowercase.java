import java.util.*;
public class UpperorLowercase{
	public static void main(String[] args){
		char ch;
		System.out.println("Enter the Character :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println(ch + " is Uppercase");
		else
			System.out.println(ch + " is Lowercase");
	}
}	