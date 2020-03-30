/*

NOTE: I Commented out driver code so that the user could input their own size
import java.util.* ; 
public class question3
{
	public static void main(String [] args)
	{
	Scanner scan = new Scanner(System.in) ; 
	System.out.print("Enter size: ") ; 
	int size = scan.nextInt() ; 
	question3(size) ; 
	}
	*/
	public static void question3(int size)
	{
		for(int row = 0; row<size; row++)
		{
			if(row>0)
			{
				//look at commented out code to see attempts to fix formatting errors
				//if(row<(size-3)) 
				//the formatting error comes from larger sizes in the last 3 rows
				//{
				for(int i = 0; i<row; i++)
				{
					System.out.printf("%3s"," ") ; 
				}
				}
				//if(row>=(size-3))
				//{
					//for(int i =0 ; i<row; i++)
					//{
						//System.out.printf("%-1s", " ") ; 
					//}
				//}
			
				
			for (int column = 0; column<size; column++)
			{
				if(column==0)
					System.out.print(1 + " ") ; 
				else
				{
					if ((size-row-column)>0)
						System.out.print(((size-row-column)*(size-row-column))+ " ") ; 
				}
			}
			System.out.println(" ") ; 
	}
}
}



