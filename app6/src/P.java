class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
        int i=10;
		if(i!=20)//compile time error if block, always require boolean result 
		{
		System.out.println("from if ");
		System.out.println("from if ");
		System.out.println("from if ");
		System.out.println("from if ");
		System.out.println("from if ");
		}
	    System.out.println("main end:"+i);
	}
}
