class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=15;
		switch(i) 
		{
			case 1:
				System.out.println("from case 1");
			break;
			case 5:
				System.out.println("from case 5");
			break;
			case 7:
				System.out.println("from case 7");
			break;
			case 10:
			    System.out.println("from case 10");
			default:
			    System.out.println("from default  ");//executes if no case is suitable

			}
		System.out.println("main end");
	}
}
