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
	
import java.util.*;

public class Calculator {
	
	//variable total declared
	private int total;
	private String TYPE_ADD = "+";
	private String TYPE_SUB = "-";
	private String TYPE_MUL = "*";
	private String TYPE_DIV = "/";
	private ArrayList<String> history = new ArrayList<String>();
	
	/** Constructor
	 * 		initializes the value of total to 0
	 * 		
	 */
	public Calculator () 
	{			
		total = 0;  // not needed - included for clarity
		history.add("0");
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
		history.add(TYPE_ADD + " " + value);
	}
	
	/**Subtract the total with the given parameter
	 * 
	 * 
	 * @param value		number to subtract from the total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history.add(TYPE_SUB + " " + value);
	}
	
	/**Multiply the total with the given parameter
	 * 
	 * @param value		number to multiply with the total
	 */
	public void multiply (int value)
	{
		total = total * value;
		history.add(TYPE_MUL + " " + value);
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
			history.add(TYPE_DIV + " " + value);
		}
		else
		{
			total = (total / value);
			history.add(TYPE_DIV + " " + value);
		}		
	
	}

	/**Return history of all actions
	 * 
	 * @return			string value of history
	 */
	public String getHistory ()
	{
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(history + "");
		
		String calcHistory = builder.toString()
				.replace(",", "").replace("[", "").replace("]", "").trim();
		
		System.out.print(calcHistory);
		System.out.println("");
		
		
		return calcHistory;
	}
} 