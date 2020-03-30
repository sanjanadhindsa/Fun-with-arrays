/*
NOTE: I COMMENTED OUT THE MAIN METHOD/DRIVER CODE. I used the example given in 
the pamphlet to test
public class question1
//{ 
	//public static void main(String [] args)
	//{
		///String [] referenceArray = {"abc", "ab", "bd", "cbc", "ab", "bd"} ; 
		String [] queryArray = {"xy","abc", "ab"} ; 

		question1(referenceArray, queryArray) ; 

	*/
	public static int[] question1(String [] referenceArray, String [] queryArray) 
	{
		int occurences [] = new int[queryArray.length] ; 
		int count = 0 ; 
		for (int i = 0; i<queryArray.length; i++)
		{
			count = 0 ; 
			for(int j = 0; j<referenceArray.length; j++)
			{
				if(queryArray[i].equals(referenceArray[j]))
				{
					count+=1 ; 
				}
			}
			occurences[i] = count ; 
		}
		System.out.print("Matching output is {") ; 
		for (int i = 0; i< occurences.length; i++)
		{
			if (i != 2)
			System.out.print(occurences[i] + ", ") ; 
			else 
				System.out.print(occurences[i]) ; 
		}
		System.out.print("} where each element of the output array is the number of occurences of each element in query string array in reference array") ; 
		return occurences ; 
	}
