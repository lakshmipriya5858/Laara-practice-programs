class Z7
{
enum Test{CON1,CON2,CON3,CON4,CON5};
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
				case CON3:
				System.out.println("from case CON3");
			    			break;
				case CON4:
			    System.out.println("from case CON4");	
			    break;
			}
		System.out.println("main end");
	}
}
