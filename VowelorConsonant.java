import java.util.*;
public class VowelorConsonant{
	public static void main(String[] args){
		char ch;
		System.out.println("Enter the character :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println(ch + " is Vowel");
		else
			System.out.println(ch + " is Consonant");
	}
}