class  Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1,j=10;
		for(i=5,System.out.println("init end"),j=20;//any type & no of statements are used 
		i<=15 && j<=50; 
		i+=2,j+=5,System.out.println("changes"))
		{
		System.out.println("loop body"+i+","+j);
		}
		System.out.println("main end");
	}
}
