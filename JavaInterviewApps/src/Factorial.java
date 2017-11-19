
/**
 * @author Thomas Volz
 * This class will return a factorial result of a number
 * A factorial is a whole number multiplied by every single number that
 * preceded it (above zed), ie 5! = 5*4*3*2*1 = 120
 * 
 **/
public class Factorial {
	
	/**
	 * This class will take a number and return the factorial of 
	 * that number.  Use only whole integer values above 0.
	 * Negative factorials exist but that is a whole part of math theory
	 * I am not ready for
	 * 
	 * @param number whole number value to find the factorial for
	 * @return the factorial of the number else 0 if the number is <= 0
	 */
	protected int getFact(int number)
	{
		int result=0;
		if(number <= 0)
			return result;
		

		result = number;
		while(number>1)
		{			
			result = result * (number-1);
			number--;
		}
		return result;
	}
	

}
