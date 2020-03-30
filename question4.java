// this is ONLY the method as per instructions; no driver method/main class included

	public static void question5(int [] array)
	{
		int temp [] =  new int[array.length] ;
		int placeholder = 0 ; 
		int count = 0 ; 
		int times = 0 ; 
		for (int i = 0 ; i<array.length; i++)
		{
			count = 0 ; 
			placeholder = array[i] ; 
			for (int j = 0 ; j<temp.length; j++)
			{
				if (placeholder == temp[j])
					count += 1 ; 
			}
			if(count == 0)
				{
					times +=1 ; 
					temp[i] = placeholder ; 
					System.out.print(placeholder + " ") ; 
				}
		}

	}

