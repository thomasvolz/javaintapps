/**
 * AppSelector
 * @author Thomas Volz
 * @version 0.1
 * 
 * This main method will eventually allow you to select
 * the particular function you want to see executed.
 * 
 * I have added a case switcher but have a hard coded choice
 * Future implementation will ask for user input
 *
 */


public class AppSelector {

	public static void main(String[] args) {
		
		int choice = 2;
		
		switch(choice) 
		{
			case 1: runFib();
			break;
			
			case 2: runFact();
			break;
		
			default: System.out.println("Error");
			break;
		}


	}
	

	static void runFib()
	{
		System.out.println("Running Simple Fib");
		
		Fibonacci newFib = new Fibonacci();
		
		System.out.println("Printing a value of 20=6765");
		System.out.println("The value is: "+newFib.simpleFib(20));
		
		System.out.println("Creating with arrayFib, size 20, should range to 6765");
		
		newFib.toString(newFib.arrayFib(20));
	}
	
	static void runFact()
	{
		System.out.println("Running Factorial");
		
		Factorial newFact = new Factorial();
		
		System.out.println("Test with Value of 5: " + newFact.getFact(5));
		
	}

}



