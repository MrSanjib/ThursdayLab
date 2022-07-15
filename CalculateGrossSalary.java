package basicprogram;
/*
 * write a program to calculate gross salary of an employee. Basic salary should be taken from user.
If basic salary is grater that 1500 ,HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee.
 */

import java.util.Scanner;
public class CalculateGrossSalary {

	public static void main(String[] args) {
		int basic;
		float DA,HRA,gross_sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		basic = sc.nextInt();
		if(basic>1500)
		{
			HRA = basic * 0.2f;
			DA = basic * 0.9f;
			
		}
		else
		{
			HRA = 500.00f;
			DA = basic * 0.7f;
		}
		gross_sal = DA + HRA + basic;
		System.out.println("Gross Salary: "+gross_sal);


	}

}
