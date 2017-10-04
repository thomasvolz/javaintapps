/**
 * 
 * @author Thomas Volz
 * Yes, I am actually Bartholomew Fibonacci
 * Inventor of the Fibonacci Code, now a novel 
 * and soon to be a major motion picture
 * 
 * The Fibonacci series reads as such:
 * 1, 1, 2, 3, 5, 8, 13...
 * Where the result of an index position is the sum of the 
 * two preceding numbers
 * 
 * This is defined by the recurrence relation of
 * Fn = F(n-1) + F(n-2)
 * Seeded by: F1 = 1, F2 = 1
 * or: F0 = 0, F1 = 1
 * where n is the desired index location 
 * 
 */ 

public class Fibonacci {
	
	/**
	 * A basic Fibonacci Series function that
	 * will return the value from the Fib Series length specified
	 * @param seriesIndex the series length and value at that length
	 * THIS MUST BE A POSITIVE NUMBER
	 * @return the calculated result from the position in the Fib Series
	 */
	protected int simpleFib(int seriesIndex)
	{		
		if(seriesIndex<=0)
			return 0;
		
		if(seriesIndex==1)
			return 1;
		
		int numberOne=0;
		int numberTwo=1;
		int result=1;	
		
		for(int i = 0; i < seriesIndex-1; i++)
		{

			result = numberOne+numberTwo;
			numberOne=numberTwo;
			numberTwo=result;
		}
		
		return result;
	}
	
	/**
	 * Method to create an array with 
	 * all values in the defined
	 * range for the Fibonacci series
	 * 
	 * @param listSize the size of the array/range for the Fib series
	 **/
	protected int[] arrayFib(int listSize)
	{
		int[] fibArray= new int[listSize+1];
		
		//This is easiest if the first two values are initialized
		fibArray[0]=0;
		fibArray[1]=1;	
		
		for(int i = 2; i < listSize+1; i++)
		{
			fibArray[i]=fibArray[i-1] + fibArray[i-2];
		}
		
		return fibArray;
		
	}
	
	/**
	 * toString method to list all values in 
	 * a completed Fibonacci array
	 * @param fibArray the completed Array to list values from
	 */
	protected void toString(int[] fibArray)
	{
		for(int i = 0; i < fibArray.length; i++)
		{
			System.out.println(fibArray[i]);
		}
	}

}
