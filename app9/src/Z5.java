class Z5
{
	public static void main(String[] args) 
	{
		String s1="hello";
		System.out.println(s1.hashCode());
		switch(s1) 
		{
			case "test":
				System.out.println("from case test");
			    break;
				case 99162322:
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
