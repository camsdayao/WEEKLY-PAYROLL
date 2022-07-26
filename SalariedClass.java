/**
 * 
 */
package WEEKLYPAYROLL;

import java.util.Scanner;

/**
 * @author CamilleDayao
 *@Description:  to calculate and print the weekly payroll for your company.
 *@Datecreated: 05/30/2022
 */
public class SalariedClass extends EmployeeClass{
	
	protected double weeklySalary;

	public SalariedClass() {
		
	}
	
	public void loadMethod() {				// LOAD METHOD OF SALARIED CLASS
		super.loadMethod();
		System.out.print("Salary ==> ");
		Scanner scan = new Scanner(System.in);
		weeklySalary = scan.nextDouble();
	}
	
	public double getEarnings() {				// GET EARNINGS METHOD
		return weeklySalary;
	}
	
}
