class Z10
{
	public static void main(String[] args) 
	{
		int i=10;
		final int j=10;//constant expression
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
