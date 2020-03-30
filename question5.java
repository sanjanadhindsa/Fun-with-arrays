/*

I commented out driver method/class. 

import java.util.* ; 
public class question5
{
	public static void main(String [] args)
	{
		String threeWord = "" ; 
		Scanner input = new Scanner(System.in) ; 
		for (int i = 0 ; i<=2; i++)
		{
		System.out.print("Enter word number " + (i+1) + ": ") ; 
		String wordi = input.nextLine() ; 
		if (i == 2)
		{
			threeWord += wordi ; 
		}
		else{
			threeWord += wordi + " "; 
		}
		}

		question5(threeWord) ; 
	}
	*/
	public static void question5(String threeWordString)
	{
		String strArray[] = threeWordString.split(" ");
 		System.out.println("String converted to String array");
 		for(int i=2; i >= 0; i--){
 			System.out.print(strArray[i] + " ");
 		}
		
	}
	
//}