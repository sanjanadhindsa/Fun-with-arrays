import java.util.* ; 
public class Exercise1
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in) ; 
		int [] userInputs = new int [10] ; 
		for(int i =0; i<10; i++)
		{
			System.out.print("Enter element #" + (i+1) + ": ") ; 
			int input = scan.nextInt() ; 
			userInputs[i] = input ; 

		}
		for (int i = userInputs.length-1; i>=0; i--)
		{
			System.out.print( userInputs[i] + " "); 
		}
	}
}