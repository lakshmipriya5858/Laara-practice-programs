class N
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if(false)//receiving false goes to else block
		{
		System.out.println("if block!");
		}
		else
		{
			if(false)
			{			
				System.out.println("else-if block begin");//if IF true block executes 
			}
		}
					System.out.println("main end ");

              }
}