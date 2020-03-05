import java.util.* ; 
public class Exercise4
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in) ; 
		System.out.print("How many integers would you like to enter? ") ; 
		int length = scan.nextInt() ; 
		int array [] = new int [length] ; 
		for (int i = 0; i<length; i++)
		{
			System.out.print("Enter element #" + (i+1) + ": ") ; 
			int element = scan.nextInt() ; 
			array[i] = element ; 
		}
		
		if(isSorted(array) == false)
		{
			System.out.println("This array is not sorted") ; 
		}
		else if (isSorted(array) == true)
		{
			System.out.println("This array is sorted") ; 
		}


	}
	public static boolean isSorted(int[] list)
	{
		int sortedArray [] = list.clone()  ;  
		int count = 0 ; //using this variable later for 
		//sorting the sortedArray using selection sort
		for (int i = 0 ; i<sortedArray.length-1;i++)
		{	
			int currentMin = sortedArray[i] ; 
			int currentMinIndex = i ; 
			for (int j = i+1; j<sortedArray.length; j++)
			{
				if(currentMin > list[j])
				{
					currentMin = sortedArray[j] ; 
					currentMinIndex = j; 
				}
			}
			if (currentMinIndex != i)
			{
				sortedArray[currentMinIndex] = sortedArray[i] ; 
				sortedArray[i] = currentMin ; 
			}

		}
		//check if the two arrays are the same
		for (int i = 0 ; i<sortedArray.length; i++)
		{
			if (sortedArray[i] == list[i])
				count+=1 ; 
		}
		if (count == sortedArray.length)
			return true ; 
		else
			return false ; 


	}
}