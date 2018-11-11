class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char c1='t';  
		switch(c1) 
		{
			case 'a':
				System.out.println("from case 1");
			    break;
				case 116:
				System.out.println("from case 116");
			    break;
				case 65536:
				System.out.println("from case 65536");
			    break;
				case 'f':
			    System.out.println("from case 10");	
			    break;
			}
		System.out.println("main end");
	}
}
