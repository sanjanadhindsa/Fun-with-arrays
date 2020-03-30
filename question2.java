//I only have the method here and did not include the class/driver method
		public static int question5(int [] [] array)
		{
		int firstDiagonal = 0 ; 
		int secondDiagonal = 0 ; 
		for (int row = 0 ; row<array.length; row++)
		{
			for(int column = 0 ; column<array.length; column++)
			{
				if (row == column) // left diagonal 
					firstDiagonal += array[row][column] ; 
				else if ((row + column) == (array.length-1)) // right diagonal
				//but this won't go through a shared element if length = 3
					secondDiagonal+=array[row][column] ; 

			}
		}
		if (array.length == 3)
			secondDiagonal += array[1][1] ; 

		System.out.println("The sum of the first diagonal is <SUMDIAG1," + firstDiagonal + " in this example> and the sum of the other array diagonal is <SUM DIAG2, " + secondDiagonal + " in this example> and the abs diagonal difference is <|DIAG1-DIAG2| " + Math.abs(firstDiagonal-secondDiagonal) + " in this example>") ;
		return Math.abs(firstDiagonal-secondDiagonal) ;  
	}



	

