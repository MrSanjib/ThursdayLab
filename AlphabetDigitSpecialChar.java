import java.util.*;
public class AlphabetDigitSpecialChar{
	public static void main(String[] args){
		char ch;
		System.out.println("Enter the character :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if((ch>='a'&& ch<='z') ||(ch>='A'&& ch<='Z'))
		System.out.println(ch + " is a Alphabet");
	else if(ch>='0' && ch<='9')
		System.out.println(ch + " is a Digit");
	else
		System.out.println(ch + " is a Specialcharacter");
	}
}