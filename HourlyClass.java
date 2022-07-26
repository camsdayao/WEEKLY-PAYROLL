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
public class HourlyClass extends EmployeeClass {
	
	private double hourlyPay;							//INSTANCE VARIABLE FOR HOURLY CLASS
	private double hoursWorked;
	byte payType;
	
	public HourlyClass() {
	}
	
	public void loadMethod() {							// LOAD METHOD OF HOURLY CLASS
		super.loadMethod();
		Scanner scan = new Scanner(System.in);			// initialize scanner
		System.out.print("Hourly pay ==> ");
		double hourlyPay = scan.nextInt();
		System.out.print("Hours worked this past week ==> ");
		double hoursWorked = scan.nextInt();
		
		this.hourlyPay = hourlyPay;						// get the value of the variables
		this.hoursWorked = hoursWorked;
	}
	

	public double getEarnings() {						// GET EARNINGS METHOD
		if(hoursWorked<=40) {							// condition for less than or equal 40 hours of work
			payCheck = hoursWorked*hourlyPay;
		}
		else if(hoursWorked >40) {						// overtime condition for more than 40 hours of work hours
			double overtimeHours = hoursWorked - 40; 
			double overtimePay = hourlyPay * 1.5;	
			overtimePay = overtimePay * overtimeHours;
			payCheck = (overtimePay + ( 40*hourlyPay));
			} 
		return payCheck;
			
	}
	
}
