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
	int simpleFib(int seriesIndex)
	{		
		if(seriesIndex<=0)
			return 0;
		
		if(seriesIndex==1)
			return 1;
		
		int numberOne=0;
		int numberTwo=1;
		int result=1;	
		
		for(int i = 0; i < seriesIndex; i++)
		{
			System.out.println(result);
			result = numberOne+numberTwo;
			numberOne=numberTwo;
			numberTwo=result;
			
		}
		
		
		
		
		
		
		
		return result;
	}

}
