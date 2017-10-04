/**
 * AppSelector
 * @author Thomas Volz
 * @version 0.1
 * 
 * This main method will eventually allow you to select
 * the particular function you want to see executed.
 * 
 * For now, executions are hard coded
 *
 */


public class AppSelector {

	public static void main(String[] args) {
		System.out.println("Running Simple Fib");
		
		Fibonacci newFib = new Fibonacci();
		
		System.out.println("Printing a value of 20=6765");
		System.out.println("The value is: "+newFib.simpleFib(20));
		
		System.out.println("Creating with arrayFib, size 20, should range to 6765");
		
		newFib.toString(newFib.arrayFib(20));

	}

}
