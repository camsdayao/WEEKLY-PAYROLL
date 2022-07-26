/**
 * 
 */
package WEEKLYPAYROLL;

import java.util.Scanner;

/**
 * @author CamilleDayao
 * *@Description:  to calculate and print the weekly payroll for your company.
 *@Datecreated: 05/30/2022
 */
public class WeeklyPayrollDriver{

	/**
	 * @param args
	 */
	public static void main(String[] args) {		//MAIN METHOD
		double payCheck = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);			// scanner initialization
		System.out.print("Number of employees: ");		
		int numOfEmployee = scan.nextInt();
		System.out.println();
		
		EmployeeClass emp [] = new EmployeeClass [numOfEmployee];			//array to instantiate the employee class
		
		for(i = 0; i<emp.length; i++) {										// loop to prompt the number of employees 
			System.out.println("PROFILE FOR EMPLOYEE #" + (i+1) + ":");
			System.out.print("type Hourly(1), Salaried(2), Salaried plus Commission(3)\r\n"
					+ "Enter 1, 2, or 3 ==> ");
			byte payType = scan.nextByte();
			
			if(payType == 1) {
			emp[i] = new HourlyClass();
			}
			else if(payType == 2) {
			emp[i] = new SalariedClass();
			}
			else if(payType == 3) {
			emp[i] = new SalariedPlusCommissionClass();
			}
			emp[i].loadMethod();							// call load method for whichever type of pay type
		}
		
		for(int j =0; j<emp.length; j++) {			// loop to output and print out ToString Method
			
			System.out.println(emp[j].toString());
			System.out.println();
		}
	}
	public double getEarnings() {				//GET EARNING METHOD
		return 0;
	}

}
