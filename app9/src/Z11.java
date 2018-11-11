class Z11
{
	public static void main(String[] args) 
	{
		int i=10;
		final int j;
			j=10;//even though j got initialised 
		switch(i)
		{
			case 1:		System.out.println("case 1");
                         break;
		    case 5:		System.out.println("case 5");
                         break;
			case j:		System.out.println("case j");
                         break;
		}
		System.out.println("end!");
	}
}
//compile time error 