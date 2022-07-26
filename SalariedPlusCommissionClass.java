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
public class SalariedPlusCommissionClass extends SalariedClass{					//SALARIED CLASS IS THE PARENT FOR COMISSIONED CLASS
	
	private int salesPastWeek;											// INSTANCE VARIABLE
	private double commissionRate;
	
	public SalariedPlusCommissionClass() {
		
	}
	Scanner scan = new Scanner(System.in);						// scanner initialization
	
	public void loadMethod() {								//LOAD METHOD FOR SALARIED PLUS COMISSION CLASS
		super.loadMethod();									
		System.out.print("Sales for this past week ==> ");
		salesPastWeek =  scan.nextInt();
		System.out.print("Sales commission rate (fraction paid to employee) ==> ");
		commissionRate = scan.nextDouble();
	}
	public double getEarnings() {							//GET EARNINGS METHOD
		double payCheck = weeklySalary + (salesPastWeek*commissionRate);
		return payCheck;
				}
	

}
