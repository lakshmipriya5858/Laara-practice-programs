class Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1="hello";
		switch(s1) 
		{
			case "test":
				System.out.println("from case test");
			    break;
				case "hello":
				System.out.println("from case hello");
			    break;
				case "xyz":
				System.out.println("from case 65536");
			    break;
				case "sf":
			    System.out.println("from case f");	
			    break;
			}
		System.out.println("main end");
	}
}
