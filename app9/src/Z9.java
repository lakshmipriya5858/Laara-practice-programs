class Z9
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=10;
		switch(i)
		{
			case 1:		System.out.println("case 1");
                         break;
		    case 5:		System.out.println("case 5");
                         break;
			case j:		System.out.println("case j");//cannot supply a variable which is not constant 
                         break;
		}
		System.out.println("end!");
	}
}
