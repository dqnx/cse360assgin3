package cse360assign3;

/** Calculator Program
 * 	This class contains a constructor of a calculator
 * 	It will be capable of performing add, subtract, multiply, and divide	
 *  afterward user input history will be displayed
 * 
 * @author  :  Seong Kim
 * @version :  Feb 21, 2016.
 * @ID 	    :  1208036059
 * @Lecture :  CSE360 MWF 1:30-2:20pm 
 * @pin#    :  422
 * 
 */
	

public class Calculator {
	
	//variable total declared
	private int total;
	
	/** Constructor
	 * 		initializes the value of total to 0
	 * 		
	 */
	public Calculator () 
	{			
		total = 0;  // not needed - included for clarity
	}
	
	/**Return the correct number of total
	 *  
	 * @return	 return total
	 * 
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**Add the given parameter (value) to the total
	 * 
	 * 
	 * @param value 	number to add to the total
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**Subtract the total with the given parameter
	 * 
	 * 
	 * @param value		number to subtract from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**Multiply the total with the given parameter
	 * 
	 * @param value		number to multiply with the total
	 */
	public void multiply (int value)
	{
		total = total * value;
	}
	
	/**Divide the total with the given parameter
	 * 
	 * @param value		number to divide the total with
	 */
	public void divide (int value)
	{	
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = (total / value);
		}		
	
	}

	/**Return history of all actions
	 * 
	 * @return			string value of history
	 */
	public String getHistory ()
	{
		return "";
	}
} 