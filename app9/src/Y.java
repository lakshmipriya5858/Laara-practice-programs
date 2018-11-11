class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char c1='t';//internally considering a ascii code //every character has an unique code  
		switch(c1) 
		{
			case 'a':
				System.out.println("from case 1");
			    break;
				case 't':
				System.out.println("from case 130");
			    break;
				case 'p':
				System.out.println("from case 7");
			    break;
				case 'f':
			    System.out.println("from case 10");	
			    break;
			}
		System.out.println("main end");
	}
}
