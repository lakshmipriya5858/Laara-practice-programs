class Z17
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		xyz:
		for(int i=0;i<=5;i++)
		{
					System.out.println("loop1 begin");
					for(int j=10;j<=13;j++)
			        {		
						System.out.println("loop2 begin "+i+","+j);
						if(j==12)
						{
							continue xyz;
						}
			         	System.out.println("loop2 end "+i+","+j);
					}
					System.out.println("loop end");
        }
				System.out.println("main end");
	}
}
