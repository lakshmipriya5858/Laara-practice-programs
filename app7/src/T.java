class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		if(false)//receiving false goes to else block
		{
		System.out.println("if block!");
		}
		else                                                //in else block there is another if and else block
		{

			if(true)
			{			
				System.out.println("else-if block"); 
			}
			else
				{				
				System.out.println("else-if-else block");
				}

				}


								System.out.println("main end!! ");

              }
}