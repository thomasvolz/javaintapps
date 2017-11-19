/**
 * 
 * Take an array of integer values and return
 * the maximum value from the array
 * 
 * @author Thomas Volz
 *
 */
public class ReturnArrayMaxInt {
	
	
	/**
	 * Thoughts:
	 * Might be better to operate on an object and return it,
	 * That way if the initial parameter were null I'd have 
	 * a cleaner way of detecting / reporting on that
	 * 
	 * @param collection
	 * @return
	 */
	public int getMax(int[] collection)
	{
		if(collection==null)
			return 0;
		
		int result=0;
		
		for(int a=0; a<collection.length; a++)
		{
			if(collection[a]>result)
			{
				result=collection[a];
			}
		}
		
		return result;
	}

}
