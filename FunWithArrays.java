import java.util.* ; 
public class FunWithArrays
{
	public static void main(String []args)
	{

		Scanner input = new Scanner(System.in) ; 
		//fills an array between size 1-100 (randomly generated length) with random values
		//also between 1-100 (also randomly generated values)
		int randomLength = 1 + (int)(Math.random() *100) ; 
		int [] array = new int [randomLength] ; 
		System.out.println("The length of your array is: " + randomLength) ; 
		fillAndPrintArray(array) ; 

		

		}
		public static void fillAndPrintArray(int [] array)
		{
			for (int i = 0 ; i< array.length; i++)
			{
				int randomInt = 1 + (int)(Math.random()*100) ; 
				array[i] = randomInt ; 
			}
			for (int i = 0 ; i<array.length; i++)
			{
				System.out.print(array[i] + " ") ; 
			}

	}
}