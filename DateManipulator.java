/**
 * This class contains several methods for manipulating dates.
 * @author ADD YOUR NAME HERE
 * @version 1.0
 * Lab07 - DateManipulator
 * Fall 2018
 */
public class DateManipulator {

	/**
	 * Empty-argument constructor
	 */
	public DateManipulator() {
		
	}//end constructor
	
	/**
	 * This method determines if a year is a leap year. Years 
	 * less than 1582 return -1 (not valid leap years). Otherwise
	 * the year must be evenly divisible by 4 or 400. However, years
	 * divisible by 100 are not leap years (although they are divisible
	 * by 4.
	 * @param year - four-digit integer representing a year.
	 * @return - true or false
	 */
	public boolean isLeapYear(int year) {
		boolean y = false;
		if (year<1582){
		    y=false;
		}
		else if(year%100==0 && year>1582){
			if (year%400==0){
				y=true;
			}
			else if (year%400!=0){
				y=false;
			}
		}
		else if (year%100!=0 && year%4==0 && year>1582){
			y=true;
		}
		return y;
	} //end isLeapYear
		
}//end class

