class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=7;
		switch(i)//argument should be int value 
		{
			case 1://multiple cases can be used 
				System.out.println("from case 1");
			case 5:
				System.out.println("from case 5");//any kind of statement is taken 
			case 7:
				System.out.println("from case 7");
			break;
			case 10:
			    System.out.println("from case 10");
			}
		System.out.println("main end");

	}
}
