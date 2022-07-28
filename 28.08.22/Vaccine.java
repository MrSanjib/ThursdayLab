/*create abstract class vaccine.create 2 concrete method firstDose() and 2ndDose().
Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs. 
Scenario 2: user can take 2nd dose if already the first dose has completed.
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.create one implementation class vaccinationSuccessful where implement boosterDose() method.
Create main class vaccination and invoke all methods accord*/

package abstractiondemo;

import java.util.Scanner;

abstract class vaccination{
	
	
	//concrete method and body
	public void fristDose() {
		
		String user; int age,pay=250;
		System.out.println("Enter Nationlity : "+"enter Age: "+" Pay= Rs250 for Vaccine ");
		Scanner sc=new Scanner(System.in);   //creating object for user input
		user=sc.next();
		age=sc.nextInt();
		
		//checking condition
		if(user.equalsIgnoreCase("Indian") && age>=18) {
			System.out.println("You Can Take First Dose Of Vaccine");
		}
		else
		{
			System.out.println("you are not Allowed to take First Dose..THANK YOU");
		}
		
	}
	//concrete method and body
	public void secondDose() {
		char ch;
		
		
		System.out.println("Are you Already Vacinated with First dose : Y/N");
		Scanner sc=new Scanner(System.in);  //creating object for user input
		ch=sc.next().charAt(0);
		
		// condition checking
		if(ch=='Y'|| ch=='y' ) { 
			System.out.println("You are Eligible for Second Dose");
		}
		
	else {
		  System.out.println("you are not Eligible for Second Dose.. THANK YOU");
			}
			
	}
		
	// create abstract method
   abstract public void boosterDose();
}
    // implementation of vaccineSucessful
   class VaccineSucessful extends vaccination {

	
	

	@Override
	public void boosterDose() {
		
		
		System.out.println("Are you Already Vacinated with Two doses : Y/N");
		Scanner sc=new Scanner(System.in); // create object for user input
		char ch=sc.next().charAt(0);
		
		//checking conditions
		if(ch=='Y'|| ch=='y')
			System.out.println("You are Eligible For BoosterDose");
		else
			System.out.println("You are NOT Eligible For BoosterDose");
		System.out.println("Vaccination SuccessFull..THANK YOU");
		
	}
	   
 }
	   
	
    public class Vaccine {

	public static void main(String[] args) {
		VaccineSucessful sc=new VaccineSucessful (); //creating object of vaccineSucessful
		 sc.fristDose();  // calling firstDose method with ref variable
		 sc.secondDose(); //calling secondDose method with ref   variable
		 sc.boosterDose(); //calling boosterDose method with ref variable
		
		

	}

}
