package bookmanagementsystem;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		
		BookServices bservice=new BookServices();
		
		do {
			System.out.println("--Welcome to Book Management System--");
			System.out.println("============================================");
			System.out.println("Press 1. For Create Book details \n"
							  +"press 2. For Get Book details by Id \n"
							  +"press 3. For Get all Book details \n"
							  +"press 4. For update Book details \n"
							  +"press 5. for Quit");
			System.out.println("============================================");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					bservice.createBook();
					System.out.println("============================================");
					break;
				case 2:
					bservice.getBookById();
					System.out.println("============================================");
					break;
				case 3:
					bservice.getAllBookDetails();
					System.out.println("============================================");
					break;
				case 4:
					bservice.updateBookById();
					System.out.println("============================================");
					break;
					
				case 5:break;
					
				default:System.out.println("Enter correct choice");
					
					
			}
		}
		while(choice!=5);
		System.out.println("Thanku for visit");
		

	}

}
