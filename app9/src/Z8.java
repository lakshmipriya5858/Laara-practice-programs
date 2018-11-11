class Z8
{
enum Test{CON1,CON2,CON3,CON4,CON5};//for derived data type we cannot supply int value to cases
	public static void main(String[] args) 
	{
		System.out.println("MAIN BEGIN");
		Test t1=Test.CON3;
		switch(t1) 
		{
			case CON1:
				System.out.println("from case CON1");
			    break;
				case CON2:
					System.out.println("from case CON2");
				break;
				case 2:
				System.out.println("from case CON3");//supplied indexof con3
			    			break;
				case CON4:
			    System.out.println("from case CON4");	
			    break;
			}
		System.out.println("main end");
	}
}
