/**
 * 
 */
package WEEKLYPAYROLL;
														//local date imports
import java.time.LocalDate;				
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author CamilleDayao
 *@Description:  to calculate and print the weekly payroll for your company.
 *@Datecreated: 05/30/2022
 */
public abstract class EmployeeClass {
	
	private String name;							//INSTANCE VARIABLE
	private String ssNum;
	private byte birthMonth;
	private byte birthWeek;
	double payCheck;
	
		 
	    
	    
	public void loadMethod() {														//LOAD METHOD TO PROMP
		Scanner scan = new Scanner(System.in);										//initialize scanner
		
		System.out.print("Name ==> ");											
		String name = scan.next();
		
		System.out.print("Social security number ==> ");
		String ssNum = scan.next();
		
		System.out.print("Birthday month (1-12) ==> ");
		byte birthMonth = scan.nextByte();
		
		System.out.print("Birthday week (1-4) ==> ");
		byte birthWeek = scan.nextByte();
		
		this.name = name;										//get the value of variables
		this.ssNum = ssNum;
		this.birthMonth = birthMonth;
		this.birthWeek = birthWeek;
		
	}
	
	public String toString() {									//TO STRING METHOD 
		getBonus();
		String formattedPrint = String.format("employee: %s \nsocial security: %s \npaycheck: $%s" , name, 
				ssNum, payCheck, + getEarnings());
		return formattedPrint;
	}
				
	public double getBonus() {														//GET BONUS METHOD
		int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;			//local date 		
	    int currentWeek = Calendar.getInstance().get(Calendar.WEEK_OF_MONTH); 
	    
		if(birthMonth == currentMonth && birthWeek == currentWeek) {				//condition to add $100
			payCheck = getEarnings() + 100;
	}
		else {
			payCheck = getEarnings();	
		}
		return payCheck;
	}
	public abstract double getEarnings();						//abstract method - getEarnings method on Employee Class
		

}
